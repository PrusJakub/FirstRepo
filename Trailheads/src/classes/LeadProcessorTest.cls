/**
 * Created by Kuba on 18.12.2017.
 */
@IsTest
public with sharing class LeadProcessorTest {


    @isTest
    private static void batchTest() {
        //given
        List<Lead> leads = new List<Lead>();
        for (Integer i = 0; i < 200; i++) {
            leads.add(new Lead(LastName = ('lead' + i), Company = ('cmp') + i));
        }
        insert leads;

        //when
        Test.startTest();
        LeadProcessor lp = new LeadProcessor();
        Id batchId = Database.executeBatch(lp);
        Test.stopTest();

        //then
        System.assertEquals(200, [SELECT COUNT() FROM Lead WHERE LeadSource = 'Dreamforce']);
    }
}