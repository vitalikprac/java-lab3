import org.junit.*;


public class Task5Test {
    @Test
    public void hasOneLocalMinimum() {
        var results = Task5.getMinimum(new int[]{1});
        Assert.assertSame(1, results.get(0));
    }


}