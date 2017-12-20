/**
 * Created by Kuba on 18.12.2017.
 */

public with sharing class AddPrimaryContact implements Queueable {
    private String state;
    private Contact contact;

    public AddPrimaryContact(Contact contact, String state) {
        this.state = state;
        this.contact = contact;
    }

    public void execute(QueueableContext context) {
        for (Account account : [SELECT Id, BillingState FROM Account WHERE BillingState = :state LIMIT 200]) {
            contact.clone().AccountId = account.Id;
            update account;
        }
    }
}