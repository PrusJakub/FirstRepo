@isTest
public class ParkLocatorTest {

    @isTest static void testParks(){
        Test.setMock(WebServiceMock.class, new ParkServiceMock());
        String country = 'Germany';
        String[] parks = ParkLocator.country(country);
        System.assertEquals(new List<String>{'Park1', 'Park2', 'Park3'}, parks);
    }
}