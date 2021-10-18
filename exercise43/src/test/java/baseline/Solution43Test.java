package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    @Test
    void testMain() throws IOException {
        boolean expected = true;
        String name = "webtest";
        String author = "tester";
        Solution43 test;
        test = new Solution43();
        String path = "data/test/";

        test.makeDir(path, name, author);

        Path dir = Paths.get(path + name);
        boolean actual = Files.exists(dir);

        assertEquals(expected, actual);

    }
}