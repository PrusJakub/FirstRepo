public with sharing class CarAddNewController {

    private final Car__c car;
    private final String carBrand = Label.Opel;
    private final String carModel = 'Insignia';
    private final String carName = carBrand + ' ' + carModel;
    public ApexPages.StandardController standardController;

    public CarAddNewController(ApexPages.StandardController controller) {
        this.car = (Car__c) controller.getRecord();
        standardController = controller;
    }

    public PageReference save() {
        this.car.Name = carName;
        this.car.Marka__c = carBrand;
        this.car.Model__c = carModel;
        return standardController.save();
    }

    public PageReference saveAndNew() {
        save();
        PageReference result = Page.CarAddNewPage;
        result.setRedirect(true);
        return result;
    }
}