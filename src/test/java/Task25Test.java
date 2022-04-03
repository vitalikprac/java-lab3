import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;


public class Task25Test {

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
    public void hasLargestText() {
        var largestText = Task25.getLargestText(List.of("a", "test123", "c", "test"));
        Assert.assertEquals("test123", largestText);

    }

    @Test
    public void noLargestText() {
        var largestText = Task25.getLargestText(List.of());
        Assert.assertEquals("", largestText);
    }

    @Test
    public void runWithEmptyArgs() {
        Task25.execute(new String[]{"task25"});
        Assert.assertEquals("""
                [TASK25] Count of arguments: 0\r
                [TASK25] The largest text not found\r
                """, outContent.toString());
    }

    @Test
    public void runWithOneArg() {
        Task25.execute(new String[]{"task25", "a"});
        Assert.assertEquals("""
                [TASK25] Count of arguments: 1\r
                [TASK25] a\r
                [TASK25] The largest text: a\r
                """, outContent.toString());
    }

    @Test
    public void runWithSomeArgs() {
        Task25.execute(new String[]{"task25", "a", "the_largest", "c", "not"});
        Assert.assertEquals("""
                [TASK25] Count of arguments: 4\r
                [TASK25] a\r
                [TASK25] the_largest\r
                [TASK25] c\r
                [TASK25] not\r
                [TASK25] The largest text: the_largest\r
                """, outContent.toString());
    }


}