package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void main() {
        ArrayList<String> Actual = new ArrayList<String>();
        Actual.add("Joe");
        Actual.add("Anna");
        Actual.add("Zoe");

        ArrayList<String> Expected = new ArrayList<String>();
        Expected.add("Anna");
        Expected.add("Joe");
        Expected.add("Zoe");

        Collections.sort(Actual);

        assertEquals(Actual, Expected);


    }
}