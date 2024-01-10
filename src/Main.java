import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(date.format(DateTimeFormatter.ofPattern("dd MM yyyy", Locale.ITALIAN)));

        System.out.println(date.plusYears(+1).plusMonths(-1).plusDays(+7).format(DateTimeFormatter.ofPattern("dd MM yyyy", Locale.ITALIAN)));
    }
}
