import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Task31Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void runWithEmptyArgs() {
        Task31.execute(new String[]{"task31"});
        Assert.assertEquals("""
                [TASK31] Count of arguments: 0\r
                [TASK31] List of sorted arguments is empty!\r
                """, outContent.toString());
    }

    @Test
    public void runWithOneArg() {
        Task31.execute(new String[]{"task31", "a"});
        Assert.assertEquals("""
                [TASK31] Count of arguments: 1\r
                [TASK31] Argument 1 value: a\r
                [TASK31] List of sorted arguments: a\r
                """, outContent.toString());
    }

    @Test
    public void runWithSomeArgs() {
        Task31.execute(new String[]{"task25", "a", "the_largest", "c", "not"});
        Assert.assertEquals("""
                [TASK31] Count of arguments: 4\r
                [TASK31] Argument 1 value: a\r
                [TASK31] Argument 2 value: the_largest\r
                [TASK31] Argument 3 value: c\r
                [TASK31] Argument 4 value: not\r
                [TASK31] List of sorted arguments: a, c, not, the_largest\r
                """, outContent.toString());
    }

    @Test
    public void checkSorted() {
        Task31.execute(new String[]{"task25", "z", "asfd", "csfsadf", "bshsdgd", "edsfgsdfg", "dfhfdg", "g", "f"});
        Assert.assertEquals("""
                [TASK31] Count of arguments: 8\r
                [TASK31] Argument 1 value: z\r
                [TASK31] Argument 2 value: asfd\r
                [TASK31] Argument 3 value: csfsadf\r
                [TASK31] Argument 4 value: bshsdgd\r
                [TASK31] Argument 5 value: edsfgsdfg\r
                [TASK31] Argument 6 value: dfhfdg\r
                [TASK31] Argument 7 value: g\r
                [TASK31] Argument 8 value: f\r
                [TASK31] List of sorted arguments: asfd, bshsdgd, csfsadf, dfhfdg, edsfgsdfg, f, g, z\r
                """, outContent.toString());
    }


}