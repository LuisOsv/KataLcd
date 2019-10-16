import org.junit.Assert;
import org.junit.Test;

public class TestMultipleDigits {

    @Test
    public void testTwoDigits(){
        StringBuilder sb = new StringBuilder();
        sb.append("  _\n");
        sb.append("| _|\n");
        sb.append("||_ ");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertTwoDigits(12));
    }
}
