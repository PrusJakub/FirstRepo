public with sharing class AddPrimaryContact implements Queueable {
    private String state;
    private Contact contact;

    public AddPrimaryContact(Contact contact, String state) {
        this.state = state;
        this.contact = contact;
    }

    public void execute(QueueableContext context) {
        List<Contact> contacts = new List<Contact>();

        for (Account account : [SELECT Id, BillingState FROM Account WHERE BillingState = :state LIMIT 200]) {
            Contact c = contact.clone();
            c.AccountId = account.Id;
            contacts.add(c);
        }

        insert contacts;
    }
}