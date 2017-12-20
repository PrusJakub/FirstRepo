@isTest
public with sharing class DailyLeadProcessorTest {

    @isTest
    private static void leadTest() {
        //given
        String sch = '0 13 21 18 12 ? 2017';
        List<Lead> leads = new List<Lead>();

        for (Integer i = 0; i < 200; i++) {
            leads.add(new Lead(LastName = ('lead' + i), Company = 'cmp'));
        }

        insert leads;

        //when
        Test.startTest();
        String jobId = System.schedule('ScheduleTest', sch, new DailyLeadProcessor());
        Test.stopTest();

        //then
        List<Lead> lista = new List<Lead>([
                SELECT Id, LeadSource
                FROM Lead
                WHERE LeadSource = 'Dreamforce'
        ]);

        System.assertEquals(200, lista.size());
    }
}