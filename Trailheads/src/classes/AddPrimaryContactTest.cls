@isTest
public with sharing class AddPrimaryContactTest {


    @isTest
    private static void addContactTest() {
        //given
        String stateToCheck = 'CA';

        List<Account> accounts = new List<Account>();
        Contact contact = new Contact(LastName = 'asd');

        AddPrimaryContact apc = new AddPrimaryContact(contact, stateToCheck);

        for (Integer i = 0; i < 50; i++) {
            accounts.add(new Account(Name = ('acc' + i), BillingState = 'NY'));
        }

        for (Integer i = 0; i < 50; i++) {
            accounts.add(new Account(Name = ('act' + i), BillingState = stateToCheck));
        }

        insert accounts;

        //when
        Test.startTest();
        System.enqueueJob(apc);
        Test.stopTest();

        //then
        List<Contact> contacts = new List<Contact>([
                SELECT Id
                FROM Contact
                WHERE Account.BillingState = :stateToCheck
        ]);

        System.assertEquals(50, contacts.size());
    }
}