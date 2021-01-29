package codewars;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IsAnagramTest {
    @Test
    public void exampleTests() {
        IsAnagram k = new IsAnagram();

        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }


}
