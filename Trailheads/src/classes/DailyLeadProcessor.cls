/**
 * Created by Kuba on 18.12.2017.
 */

public with sharing class DailyLeadProcessor implements Schedulable {

    public static void execute(SchedulableContext ctx) {
        List<Lead> leadsWithBlanks = [SELECT Id, LeadSource FROM Lead WHERE LeadSource = null LIMIT 200];
        for (Lead ld : leadsWithBlanks) {
            ld.LeadSource = 'Dreamforce';
        }
        update leadsWithBlanks;
    }
}