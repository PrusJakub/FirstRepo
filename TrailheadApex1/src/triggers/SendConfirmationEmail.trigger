trigger SendConfirmationEmail on Session_Speaker__c (after insert) {

    if(Trigger.isAfter && Trigger.isInsert){
        SendConfirmationEmailTriggerHandler handler = new SendConfirmationEmailTriggerHandler();
        handler.onAfterInsert(Trigger.newMap, Trigger.oldMap);
    }



}