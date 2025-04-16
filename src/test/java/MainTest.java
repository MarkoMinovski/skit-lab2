import static org.junit.jupiter.api.Assertions.assertEquals;

import com.skit.Main;
import org.junit.jupiter.api.Test;

public class MainTest {

    /**
     * Test1 - follows the test path: [1, 2, 3, 4, 6, 2, 3, 5, 6, 2, 7, 8] <br>
     * Expected input: Non-null array of size 2; First element invalid, second valid <br>
     * Expected output: "Invalid grades detected." <br>
     */
    @Test
    void test1() {
        int[] grades = {-5, 60};
        String result = Main.analyzeGrades(grades);
        assertEquals("Invalid grades detected.", result);
    }

    /**
     * Test2 - follows the test path: [1, 2, 3, 5, 6, 2, 3, 4, 6, 2, 7, 8] <br>
     * Expected input: Non-null array of size 2; First element valid, second invalid <br>
     * Expected output: "Invalid grades detected." <br>
     */
    @Test
    void test2() {
        int[] grades = {60, 105};
        String result = Main.analyzeGrades(grades);
        assertEquals("Invalid grades detected.", result);
    }
    /**
     * Test3 - follows the test path: [1, 2, 3, 5, 6, 2, 3, 5, 6, 2, 7, 9] <br>
     * Expected input: Non-null array of size 2; Both valid - both passing <br>
     * Expected output: "All students passed." <br>
     */
    @Test
    void test3() {
        int[] grades = {75, 80};
        String result = Main.analyzeGrades(grades);
        assertEquals("All students passed.", result);
    }

    /**
     * Test4 - follows the test path: [1, 2, 3, 5, 6, 2, 3, 5, 6, 2, 7, 10] <br>
     * Expected input: Non-null array of size 2; Both valid - both failing <br>
     * Expected output: "No students passed." <br>
     */
    @Test
    void test4() {
        int[] grades = {40, 30};
        String result = Main.analyzeGrades(grades);
        assertEquals("No students passed.", result);
    }

    /**
     * Test5 - follows the test path: [1, 2, 7, 10] <br>
     * Expected input: Non-null array, but empty. <br>
     * Expected output: "No students passed." <br>
     */
    @Test
    void test5() {
        int[] grades = {};
        String result = Main.analyzeGrades(grades);
        assertEquals("No students passed.", result);
    }
}
