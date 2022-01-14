package codingdojo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class Util {

    public static Date fromIsoDate(String datetime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");
        Instant instant = LocalDateTime.parse(datetime, formatter).toInstant(ZoneOffset.UTC);
        return Date.from(instant);
    }

    public static String toIsoDate(Date date) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");
        return dateTime.format(formatter);
    }
}
