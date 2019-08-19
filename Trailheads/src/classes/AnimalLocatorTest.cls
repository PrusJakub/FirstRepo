@isTest
private class AnimalLocatorTest {

    @isTest static void testAnimalNameById() {
        Test.setMock(HttpCalloutMock.class, new AnimalLocatorMock());

        String result = AnimalLocator.getAnimalNameById(1);
        System.debug(result);
        System.assertEquals(AnimalLocatorMock.animalName, result);

    }

}