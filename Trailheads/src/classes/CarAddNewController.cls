public with sharing class CarAddNewController {

    private final Car__c car;
    public ApexPages.StandardController standardController;

    public CarAddNewController(ApexPages.StandardController controller) {
        this.car = (Car__c) controller.getRecord();
        standardController = controller;
    }

    public PageReference save() {
        this.car.Name = StaticFields.carName;
        this.car.Marka__c = StaticFields.carBrand;
        this.car.Model__c = StaticFields.carModel;
        return standardController.save();
    }

    public PageReference saveAndNew() {
        save();
        PageReference result = Page.CarAddNewPage;
        result.setRedirect(true);
        return result;
    }
}