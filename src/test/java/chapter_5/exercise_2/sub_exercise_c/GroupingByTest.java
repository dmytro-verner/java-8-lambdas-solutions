package chapter_5.exercise_2.sub_exercise_c;

import music_domain.Artist;
import org.junit.Test;
import test_data.TestData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class GroupingByTest {

    @Test
    public void shouldGroupByListSize() {
        GroupingBy<List<Artist>, Integer> groupingBy = new GroupingBy<>(List::size);
        Map<Integer, List<List<Artist>>> results = Stream.of(Arrays.asList(TestData.kerryKing, TestData.tomAraya),
                Collections.singletonList(TestData.oceanElzy))
                .collect(groupingBy);

        assertEquals(2, results.size());
        assertEquals(Arrays.asList(TestData.kerryKing, TestData.tomAraya), results.get(2).get(0));
        assertEquals(Collections.singletonList(TestData.oceanElzy), results.get(1).get(0));
    }
}
