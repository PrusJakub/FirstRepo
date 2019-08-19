@RestResource(urlMapping = '/Accounts/*/contacts')
global with sharing class AccountManager {

    @HttpGet
    global static Account getAccount() {
        RestRequest request = RestContext.request;
        String accountId = request.requestURI.substringBetween('Accounts/', '/contacts');
        List<Account> validationAccountList = [SELECT Id FROM Account WHERE Id =:accountId];
        if(validationAccountList.size() == 0){
        	return null;
        }else{	
        Account result = [SELECT Name, Id, (SELECT Id, Name FROM Contacts) FROM Account WHERE Id = :accountId];
        return result;
        }
    }
}