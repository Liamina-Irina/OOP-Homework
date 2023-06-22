package homeworkSeven.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log implements Logger {
    DateTimeFormatter dfd = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    @Override
    public void writeLog(String str) {
        System.out.println(str + " (зарегистрировано: " + dfd.format(LocalDateTime.now()) + ")");
    }
}