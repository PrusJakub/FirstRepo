trigger RejectDoubleBooking on Session_Speaker__c (before insert, before update) {

    if(Trigger.isBefore && (Trigger.isInsert || Trigger.isUpdate)){
        RejectDoubleBookingTriggerHandler handler = new RejectDoubleBookingTriggerHandler();
        handler.onBeforeInsertOrUpdate();
    }


}