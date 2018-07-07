package chapter_2.exercise_2;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class ThreadLocalDateFormatterTest {

    @Test
    public void shouldFormatGivenDateCorrectly() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2010);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 10);

        String formatted = ThreadLocalDateFormatter.formatter.get().getFormat().format(calendar.getTime());

        assertEquals("10-Feb-2010", formatted);
    }
}
