public with sharing class CarEditNewController {

    private final Car__c car;
    public String inputEngineVolume { get; set; }
    public String inputEnginePower { get; set; }
    private String carBrand = 'FSO';
    private String carModel = 'Polonez Atu Plus';
    private String carName = carBrand + ' ' + carModel;
    public ApexPages.StandardController standardController;

    public CarEditNewController(ApexPages.StandardController controller) {
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
        String url = 'https://resourceful-moose-74046-dev-ed--c.eu9.visual.force.com/apex/CarEditNew';
        return new PageReference(url);
    }

    public PageReference cancel() {
        String url = 'https://resourceful-moose-74046-dev-ed.my.salesforce.com/a05/o';
        return new PageReference(url);
    }

}