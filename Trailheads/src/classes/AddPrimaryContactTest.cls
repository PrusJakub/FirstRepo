/**
 * Created by Kuba on 18.12.2017.
 */
@isTest
public with sharing class AddPrimaryContactTest {


    @isTest
    private static void addContactTest() {
        //given
        List<Account> accounts = new List<Account>();
        Contact contact = new Contact(LastName = 'asd');
        AddPrimaryContact apc = new AddPrimaryContact(contact, 'CA');
        for (Integer i = 0; i < 50; i++) {
            accounts.add(new Account(Name = ('acc' + i), BillingState = 'NY'));
        }
        for (Integer i = 0; i < 50; i++) {
            accounts.add(new Account(Name = ('act' + i), BillingState = 'CA'));
        }
        insert accounts;
        //when
        Test.startTest();
        System.enqueueJob(apc);
        Test.stopTest();
        //then
        System.assertEquals(50, [SELECT COUNT() FROM Account WHERE BillingState = 'CA']);
    }
}