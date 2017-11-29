@isTest
public class TestRestrictContactByName {
    @isTest
    static void TriggerTest() {
        Contact c = new Contact(LastName = 'INVALIDNAME');

        Test.startTest();
        Database.SaveResult result = Database.insert(c);
        Boolean resultString = result.isSuccess();
        Test.stopTest();

        System.assertEquals(false, resultString);
    }
}