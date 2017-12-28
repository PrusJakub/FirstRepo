trigger ClosedOpportunityTrigger on Opportunity (after insert, after update) {
	List<Task> lista = new List<Task>();
    
    for(Opportunity o : [SELECT Id, StageName FROM Opportunity WHERE Id IN :Trigger.New]){
        if(o.StageName == 'Closed Won'){
			lista.add(new Task(Subject = 'Follow Up Test Task', WhatId = o.Id));
        }
    }
    upsert lista;
}