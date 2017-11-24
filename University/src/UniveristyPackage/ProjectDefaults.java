package UniveristyPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ProjectDefaults {
	// konwencja nazewnicza takich rzeczy pochodzi od ENUMów, więc powinieneś mieć:
    //public static final String DEFAULT_CREATED_BY = "Admin";
    public static final String createdBy = "Admin";

    // to nie potrzebujesz mieć tutaj, to nie jest static. Przenieś do konstruktora
    // chciałem, żebyś miał chociaż 1 magic string i musiał założyć klasę i zobaczyć o co chodzi
    public static final LocalDate createdDate = LocalDate.now();
}