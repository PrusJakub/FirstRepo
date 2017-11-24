package UniveristyPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class MagicStrings {
    public static final String createdBy = "Admin";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private final LocalDate localDate = LocalDate.now();
    final String createdDate = localDate.toString();
}