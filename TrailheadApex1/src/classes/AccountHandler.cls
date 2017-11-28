public class AccountHandler {
    public static Account insertNewAccount(String gettedName) {
        Account acc = new Account(Name = gettedName);
        try {
            insert acc;
            return [SELECT Id, Name FROM Account WHERE Name = :gettedName];
        } catch (DmlException e) {
            return null;
        }

    }
}