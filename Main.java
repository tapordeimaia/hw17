import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 2);
        LocalTime time = LocalTime.of(13, 20);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        ZoneId.getAvailableZoneIds().stream()
//                .filter(z -> z.contains("US"))
//                .sorted().forEach(System.out::println);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("US/Eastern"));
        zonedDateTime.plusMinutes(1);
        zonedDateTime.plusHours(1);
        zonedDateTime.plusDays(1);
        zonedDateTime.plusYears(1);
    }
}