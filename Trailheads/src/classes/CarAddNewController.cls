public with sharing class CarAddNewController {

    private final Car__c car;
    private final String carBrand = 'Opel';
    private final String carModel = 'Insignia';
    private final String carName = carBrand + ' ' + carModel;
    public ApexPages.StandardController standardController;

    public CarAddNewController(ApexPages.StandardController controller) {
        this.car = (Car__c) controller.getRecord();
        standardController = controller;
    }

    public void save() {
        this.car.Name = carName;
        this.car.Marka__c = carBrand;
        this.car.Model__c = carModel;
        insert car;
    }

    public PageReference saveAndNew() {
        save();
        String url = 'https://resourceful-moose-74046-dev-ed--c.eu9.visual.force.com/apex/CarAddNewPage';
        return new PageReference(url);
    }

    public PageReference cancel() {
        String url = 'https://resourceful-moose-74046-dev-ed.my.salesforce.com/a05/o';
        return new PageReference(url);
    }

}