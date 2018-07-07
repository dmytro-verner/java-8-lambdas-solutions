package chapter_2.exercise_2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;

public class ThreadLocalDateFormatter {

    public static ThreadLocal<DateFormatter> formatter = ThreadLocal
            .withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
}
