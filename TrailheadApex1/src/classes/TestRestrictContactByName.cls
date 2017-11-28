@isTest
public class TestRestrictContactByName {

 
    
    @isTest
    static void TriggerTest(){
        Contact c = new Contact(LastName = 'INVALIDNAME');
        
     	Test.startTest();
        
        database.SaveResult result = Database.insert(c);
		Boolean resultstring = result.isSuccess();
        Test.stopTest();
        
        
      System.assertEquals(false, resultstring);
        
    }
    
    
}