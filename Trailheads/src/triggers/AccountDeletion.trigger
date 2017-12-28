trigger AccountDeletion on Account (before delete) {
   HierarchyTriggerSettings__c hierarchyTriggerSettings = HierarchyTriggerSettings__c.getInstance('AccountDeletionTrigger');
	 if(hierarchyTriggerSettings != null){
	 	DateTime now = DateTime.now();
	 	if(hierarchyTriggerSettings.StartOfActivity__c < now && hierarchyTriggerSettings.EndOfActivity__c > now ){
	 		// Prevent the deletion of accounts if they have related contacts.
    		for (Account a : [SELECT Id FROM Account
                     WHERE Id IN (SELECT AccountId FROM Opportunity) AND
                     Id IN :Trigger.old]) {
        				Trigger.oldMap.get(a.Id).addError(
			            'Cannot delete account with related opportunities.');
    		}
	 	}
	}   
}