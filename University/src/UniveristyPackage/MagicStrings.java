package UniveristyPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MagicStrings {
    String createdBy = "Admin";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate localDate = LocalDate.now();
    String createdDate = localDate.toString();
}