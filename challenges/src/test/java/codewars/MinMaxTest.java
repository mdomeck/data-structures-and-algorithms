package codewars;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinMaxTest {

        Random rand;

        @BeforeEach
        public void initTest() {
            rand = new Random();
        }

        @Test
        public void testExampleCases() {
            assertArrayEquals(new int[]{1,5}, MinMax.minMax(new int[]{1,2,3,4,5}));
            assertArrayEquals(new int[]{5, 2334454}, MinMax.minMax(new int[]{2334454,5}));
            assertArrayEquals(new int[]{1, 1}, MinMax.minMax(new int[]{1}));
        }

        @Test
        public void minMaxRandomTest() {
            for(int i = 0; i < 20; i++) {
                int r = rand.nextInt();
                System.out.println(r);
                assertArrayEquals(new int[]{r, r}, MinMax.minMax(new int[]{r}));
            }
        }
    }

