@isTest
global class AnimalLocatorMock implements HttpCalloutMock {
    
    global HttpResponse respond(HTTPRequest request) {
        String animalId = request.getEndpoint().substringAfterLast('/');
        AnimalLocator.Animal animal = new AnimalLocator.Animal(animalId, StaticFields.animalName, 'chicken food', 'cluck cluck');
        HttpResponse response = new HttpResponse();
        response.setHeader('Content-Type', 'application/json');
        response.setBody('{"animal":' + JSON.serialize(animal) + '}');
        response.setStatusCode(200);
        return response;
    }
}