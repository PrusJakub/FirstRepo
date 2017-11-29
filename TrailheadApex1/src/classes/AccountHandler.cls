public class AccountHandler {
    public static Account insertNewAccount(String gettedName) {
        Account acc;
        try {
            acc = new Account(Name = gettedName);
            insert acc;

            List<Account> accounts = new List<Account>([
                    SELECT Id, Name
                    FROM Account
                    WHERE Id = :acc.Id
            ]);

            if (accounts.isEmpty()) {
                return null;
            } else {
                return accounts.get(0);
            }

            return acc;
        } catch (DmlException e) {
            return null;
        }
    }
}