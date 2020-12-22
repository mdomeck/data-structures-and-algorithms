package challenges.repeatedWord;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RepeatedWordTest {

    @Test
    public void testInputString() throws Exception {
        String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("should return first repeated work of summer", "summer", RepeatedWord.duplicateWord(input));
    }

    @Test
    public void testMultipleDuplicates() throws Exception {
        String input = "It was the best of times, it was the worst of times";
        assertEquals("should return first repeated work of it", "it", RepeatedWord.duplicateWord(input));
    }

    @Test
    public void testException() throws Exception {
        String input = "There is no repeat here";
        assertThrows(Exception.class, () -> RepeatedWord.duplicateWord(input), "should throw exception");
    }
}

