/**
 * Created by Kuba on 18.12.2017.
 */
@isTest
private class AccountProcessorTest {


    @IsTest
    private static void testCountContacts() {
        //given
        Account acc = new Account(Name = 'Acc1');
        insert acc;
        Contact con1 = new Contact(LastName = 'Con1', AccountId = acc.Id);
        insert con1;
        Contact con2 = new Contact(LastName = 'Con2', AccountId = acc.Id);
        insert con2;
        List<Id> accountIds = new List<Id>();
        accountIds.add(acc.Id);

        //when
        Test.startTest();
        AccountProcessor.countContacts(accountIds);
        Test.stopTest();

        //then
        acc = [SELECT Id, Number_of_Contacts__c, (SELECT Id FROM Contacts) FROM Account WHERE Id = :acc.Id];
        System.assertEquals(2, Integer.valueOf(acc.Number_of_Contacts__c));
    }
}