package dataStructures.utilities;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {

    //regex tests only work with line 16 commented
//    @Test
//    public void testRegexTrue() {
//        //String toPassIn = "0";
//        assertTrue(MultiBracketValidation.testForMirrors("["));
//        assertTrue(MultiBracketValidation.testForMirrors("{"));
//        assertTrue(MultiBracketValidation.testForMirrors("("));
//    }
//
//    @Test public void testRegexFalse(){
//        assertFalse(MultiBracketValidation.testForMirrors("1"));
//        assertFalse(MultiBracketValidation.testForMirrors("2"));
//        assertFalse(MultiBracketValidation.testForMirrors("3"));
//    }

    @Test
    public void removeCurlyBrackets() {
        assertTrue(MultiBracketValidation.testForMirrors("{}"));
        assertTrue(MultiBracketValidation.testForMirrors("{}()[]"));
        assertTrue(MultiBracketValidation.testForMirrors("{{a}}"));
        assertTrue(MultiBracketValidation.testForMirrors("a{a}"));
        assertTrue(MultiBracketValidation.testForMirrors("{}a()"));
        assertFalse(MultiBracketValidation.testForMirrors("{)}"));
        assertFalse(MultiBracketValidation.testForMirrors("{[}"));
        assertFalse(MultiBracketValidation.testForMirrors("}{)}"));

    }

}
