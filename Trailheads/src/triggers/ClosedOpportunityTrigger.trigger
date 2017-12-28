trigger ClosedOpportunityTrigger on Opportunity (after insert, after update) {
	
	private static final String stageName = 'Closed Won';
	private static final String subject = 'Flollow Up Test Task';
	List<Task> taskList = new List<Task>();
    
    for(Opportunity o : [SELECT Id, StageName FROM Opportunity WHERE Id IN :Trigger.New]){
        if(o.StageName == stageName){
			taskList.add(new Task(Subject = subject, WhatId = o.Id));
        }
    }
    upsert taskList;
}