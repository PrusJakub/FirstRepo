public class ParkLocator {

    public static List<String> country(String inputCountry){
        ParkService.ParksImplPort park = new ParkService.ParksImplPort();
        return park.byCountry(inputCountry);
    }
}