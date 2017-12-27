@RestResource(urlMapping = '/Accounts/*/contacts')
global with sharing class AccountManager {

    @HttpGet
    global static Account getAccount() {
        RestRequest request = RestContext.request;
        String AccountId = request.requestURI.substringBetween('Accounts/', '/contacts');
        Account result = [SELECT Name, Id, (SELECT Id, Name FROM Contacts) FROM Account WHERE Id = :AccountId];
        System.debug('/////////////////// ' + result);
        return result;
    }
}