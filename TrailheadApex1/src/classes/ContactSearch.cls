public class ContactSearch {
    public static List<Contact> searchForContacts(String lastNameGet, String postalCodeGet) {
        List<Contact> contacts = new List<Contact>();
        for (Contact ct : [SELECT Id, Name, LastName, MailingPostalCode FROM Contact]) {
            if (lastNameGet == ct.LastName || postalCodeGet == ct.MailingPostalCode) {
                contacts.add(ct);
            }
        }
        return contacts;
    }
}