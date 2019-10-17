import org.junit.Assert;
import org.junit.Test;

public class TestSingleDigits {

    @Test
    public void testDigitOne(){
        StringBuilder sb = new StringBuilder();
        sb.append(" \n");
        sb.append("|\n");
        sb.append("|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(1));
    }

    @Test
    public void testDigitTwo(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _\n");
        sb.append(" _|\n");
        sb.append("|_\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(2));
    }

    @Test
    public void testDigitThree(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _\n");
        sb.append(" _|\n");
        sb.append(" _|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(3));
    }

    @Test
    public void testDigitFour(){
        StringBuilder sb = new StringBuilder();
        sb.append("   \n");
        sb.append("|_|\n");
        sb.append("  |\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(4));
    }

    @Test
    public void testDigitFive(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ \n");
        sb.append("|_ \n");
        sb.append(" _|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(5));
    }

    @Test
    public void testDigitSix(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ \n");
        sb.append("|_ \n");
        sb.append("|_|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(6));
    }

    @Test
    public void testDigitSeven(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ \n");
        sb.append("  |\n");
        sb.append("  |\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(7));
    }

    @Test
    public void testDigitEight(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ \n");
        sb.append("|_|\n");
        sb.append("|_|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(8));
    }

    @Test
    public void testDigitNine(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ \n");
        sb.append("|_|\n");
        sb.append(" _|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(9));
    }

    @Test
    public void testDigitZero(){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ \n");
        sb.append("| |\n");
        sb.append("|_|\n");
        Assert.assertEquals(sb.toString(),NumberToLCD.convertDigit(0));
    }
}
