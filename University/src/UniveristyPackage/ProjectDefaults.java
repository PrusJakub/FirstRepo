package UniveristyPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ProjectDefaults {
    public static final String createdBy = "Admin";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private final LocalDate localDate = LocalDate.now();
    String date = localDate.toString();
    static final LocalDate createdDate = LocalDate.now();
}