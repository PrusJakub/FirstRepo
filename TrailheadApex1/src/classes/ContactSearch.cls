public class ContactSearch {
    public static List<Contact> searchForContacts(String lastNameGet, String postalCodeGet){
        List<Contact> lista = new List<Contact>();
        for(Contact ct : [SELECT Id, Name, LastName, MailingPostalCode FROM Contact]){
      		if(lastNameGet == ct.LastName)
                lista.add(ct);
            if(postalCodeGet == ct.MailingPostalCode)
                lista.add(ct);
        }
        return lista;
    }
}