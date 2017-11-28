public class RandomContactFactory {
    public static List<Contact> generateRandomContacts(Integer numberOfContacts, String lastNameOfContact) {
        List<Contact> lista = new List<Contact>();
        for (integer i = 0; i < numberOfContacts; i++) {
            Contact c = new Contact(FirstName = 'FName' + i, LastName = lastNameOfContact);
            lista.add(c);
        }
        return lista;
    }
}