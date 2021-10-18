package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void main() {
        String[] actual = new String[6];
        String[] expected = new String[6];
        String[] load = {"ling,mai,55900", "johnson,jim,56500"};
        int num = 0;
        expected[0] = "ling";
        expected[1] = "mai";
        expected[2] = "55900";
        expected[3] = "johnson";
        expected[4] = "jim";
        expected[5] = "56500";

        for(int i = 0; i < 2; i++){
            String temp[] = load[i].split(",");
            for(int j = 0; j < 3; j++, num++) {
                actual[num] = temp[j];
            }
        }

        assertEquals(actual[0], expected[0]);
    }
}