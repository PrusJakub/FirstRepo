@isTest
public class TestVerifyDate {
    
    @isTest
    static void CheckDatesTest(){
        Date date1 = Date.newInstance(2017, 10, 10);
        Date date2 = date1.addDays(2);
        Date date3 = VerifyDate.CheckDates(date1, date2);
        System.assertEquals(date2, date3);
        
    }
    
    @isTest
    static void CheckDatesTestSecond(){
		Date date1 = Date.newInstance(2017, 10, 10);
        Date date2 = date1.addDays(60);
        Date date3 = VerifyDate.CheckDates(date1, date2);
        Date date4 = Date.newInstance(2017, 10, 31);
        System.assertEquals(date4, date3);        
    }
    
   @isTest
    static void DateWithin30DaysDateInPast(){
        Date date1 = Date.newInstance(2017, 10, 10);
        Date date2 = Date.newInstance(2017, 10, 8);
        Boolean tescik = VerifyDate.DateWithin30Days(date1, date2);
        System.assertEquals(false, tescik);
    }
    
    @isTest
    static void DateWithin30DaysSecondTest(){
        Date date1 = Date.newInstance(2017, 10, 10);
        Date date2 = date1.addDays(60);
        Boolean tescik = VerifyDate.DateWithin30Days(date1, date2);
        System.assertEquals(false, tescik);
    }
    
    @isTest
    static void DateWithin30DaysThirdTest(){
        Date date1 = Date.newInstance(2017, 10, 10);
        Date date2 = date1.addDays(10);
        Boolean tescik = VerifyDate.DateWithin30Days(date1, date2);
        System.assertEquals(true, tescik);
    }
    
    
    	public static Date SetEndOfMonthDate(Date date1) {
		Integer totalDays = Date.daysInMonth(date1.year(), date1.month());
		Date lastDay = Date.newInstance(date1.year(), date1.month(), totalDays);
		return lastDay;
	}
    
    @isTest
    static void SetEndOfMonthDateFirstTest(){
		Date date1 = Date.newInstance(2017, 10, 10);
		Date date2 = VerifyDate.SetEndOfMonthDate(date1);
         Date date4 = Date.newInstance(2017, 10, 31);
		System.assertEquals(date4, date2);        
    }
}