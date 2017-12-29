@isTest
private class AccountManagerTest {

    @isTest static void testGetAccountById() {
        Id recordId = createTestRecord();
        RestRequest request = new RestRequest();
        request.requestURI = 'https://resourceful-moose-74046-dev-ed.my.salesforce.com/services/apexrest/Accounts/' + recordId + '/contacts';
        request.httpMethod = 'GET';
        RestContext.request = request;
        Account thisAccount = AccountManager.getAccount();
        System.assert(thisAccount != null);
        System.assertEquals('Test Record', thisAccount.Name);
    }

    static Id createTestRecord(){
        Account testAccount = new Account(Name = 'Test Record');
        insert testAccount;
        Contact testContact = new Contact(LastName = 'Test', AccountId = testAccount.Id);
        insert testContact;
        return testAccount.Id;
    }
    
    @isTest static void testGetAccountByWrongId(){
    	String wrongId = 'zwaloneId';
        RestRequest request = new RestRequest();
        request.requestURI = 'https://resourceful-moose-74046-dev-ed.my.salesforce.com/services/apexrest/Accounts/' + wrongId + '/contacts';
        request.httpMethod = 'GET';
        RestContext.request = request;
        Account thisAccount = AccountManager.getAccount();
        System.assertEquals(null, thisAccount);
    }
}