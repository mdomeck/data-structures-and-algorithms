package challenges.leftJoin;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class leftJoinTest {

    HashMap<String, String> synonymHash = new HashMap<>();
    HashMap<String, String> antonymHash = new HashMap<>();

    @Before
    public void hashMapCreate(){
        synonymHash.put("fond", "enamored");
        synonymHash.put("wrath", "angered");
        synonymHash.put("diligent", "employed");
        synonymHash.put("outfit", "garb");
        synonymHash.put("guide", "usher");
        antonymHash.put("fond", "averse");
        antonymHash.put("wrath", "delight");
        antonymHash.put("diligent", "idle");
        antonymHash.put("guide", "follow");
        antonymHash.put("flow", "jam");
    }

    @Test
    public void hashMapTest(){
        assertEquals("This is table A", "{diligent=employed, outfit=garb, wrath=angered, guide=usher, fond=enamored}", synonymHash.toString());
    }

    @Test
    public void hashMapKeyTest(){
        Set<String> synonymArrayList = synonymHash.keySet();
        assertEquals("keys of the synonymLIst", "[diligent, outfit, wrath, guide, fond]", synonymArrayList.toString());
    }

    @Test
    public void joinLeftTest(){
        LeftJoin leftJoin = new LeftJoin();
        String[][] results = leftJoin.leftJoin(synonymHash, antonymHash);
        assertEquals("left join at 0 index", "[diligent, employed, idle]",Arrays.toString(results[0]));
        assertEquals("left join at 1 index", "[outfit, garb, null]",Arrays.toString(results[1]));
        assertEquals("left join at 2 index", "[wrath, angered, delight]",Arrays.toString(results[2]));
        assertEquals("left join at 3 index", "[guide, usher, follow]",Arrays.toString(results[3]));
        assertEquals("left join at 4 index", "[fond, enamored, averse]",Arrays.toString(results[4]));
    }

    @Test
    public void hashNotSameSize(){
        HashMap<String, String> smallerHash = new HashMap<>();
        HashMap<String, String> biggerHash = new HashMap<>();

        smallerHash.put("fond", "enamored");
        smallerHash.put("wrath", "angered");
        smallerHash.put("diligent", "employed");

        biggerHash.put("fond", "averse");
        biggerHash.put("wrath", "delight");
        biggerHash.put("diligent", "idle");
        biggerHash.put("guide", "follow");
        biggerHash.put("flow", "jam");

        LeftJoin leftJoin = new LeftJoin();
        String[][] results = leftJoin.leftJoin(smallerHash, biggerHash);
        assertEquals("smaller hash should return", "[[diligent, employed, idle, ][wrath, angered, delight, ][fond, enamored, averse, ]]", leftJoin.toString());
    }

    @Test
    public void emptyTest(){
        HashMap<String, String> emptyHash = new HashMap<>();
        LeftJoin leftJoin = new LeftJoin();
        String[][] results = leftJoin.leftJoin(emptyHash, antonymHash);
        assertEquals("this should be empty", "[]", leftJoin.toString());

    }

}
