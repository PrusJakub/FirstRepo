/**
 * Created by Kuba on 18.12.2017.
 */
@isTest
public with sharing class DailyLeadProcessorTest {

    @isTest
    private static void leadTest() {
        //given
        List<Lead> leads = new List<Lead>();
        for (Integer i = 0; i < 200; i++) {
            leads.add(new Lead(LastName = ('lead' + i), Company = 'cmp'));
        }
        insert leads;
        String sch = '0 13 21 18 12 ? 2017';
        //when
        Test.startTest();
        String jobId = System.schedule('ScheduleTest', sch, new DailyLeadProcessor());
        Test.stopTest();
        //then
        List<Lead> lista = [SELECT Id, LeadSource FROM Lead WHERE LeadSource = 'Dreamforce'];
        System.assertEquals(200, lista.size());
    }
}