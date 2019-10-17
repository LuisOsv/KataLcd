import org.junit.Assert;
import org.junit.Test;

public class TestMultipleDigits {

    @Test
    public void testAllDigits(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t \t _\t _\t   \t _ \t _ \t _ \t _ \t _ \n");
        sb.append("\t|\t _|\t _|\t|_|\t|_ \t|_ \t  |\t|_|\t|_|\n");
        sb.append("\t|\t|_\t _|\t  |\t _|\t|_|\t  |\t|_|\t _|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertMultipleDigits(1234567890));
    }
}
