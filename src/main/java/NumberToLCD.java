import java.util.ArrayList;

public class NumberToLCD {

    public static String convertDigit(int digit){
        StringBuilder sb = new StringBuilder();

        switch (digit){
            case 1:
                sb.append(" \n");
                sb.append("|\n");
                sb.append("|\n");
                break;
            case 2:
                sb.append(" _\n");
                sb.append(" _|\n");
                sb.append("|_\n");
                break;

            case 3:
                sb.append(" _\n");
                sb.append(" _|\n");
                sb.append(" _|\n");
                break;
            case 4:
                sb.append("   \n");
                sb.append("|_|\n");
                sb.append("  |\n");
                break;
            case 5:
                sb.append(" _ \n");
                sb.append("|_ \n");
                sb.append(" _|\n");
                break;
            case 6:
                sb.append(" _ \n");
                sb.append("|_ \n");
                sb.append("|_|\n");
                break;
            case 7:
                sb.append(" _ \n");
                sb.append("  |\n");
                sb.append("  |\n");
                break;
            case 8:
                sb.append(" _ \n");
                sb.append("|_|\n");
                sb.append("|_|\n");
                break;
            case 9:
                sb.append(" _ \n");
                sb.append("|_|\n");
                sb.append(" _|\n");
                break;
            case 0:
                sb.append(" _ \n");
                sb.append("| |\n");
                sb.append("|_|\n");
                break;
            default:

                break;
        }
        return sb.toString();
    }

    public static String convertMultipleDigits(int digits){
        ArrayList<String> results = new ArrayList<String>();

        String digitsString = String.valueOf(digits);
        int length = digitsString.length();
        for (int index = 0; index < length; index++){
            if(index + 1 < length){
                String singleDigit = digitsString.valueOf(index+1);
                String digitConverted = convertDigit(Integer.valueOf(singleDigit));
                results.add(digitConverted);
            }
        }
        return drawNumbers(results);
    }

    private static String drawNumbers(ArrayList<String> results) {

        String rows[] = new String[]{"", "", ""};
        for (String number: results) {
            String lines[] = number.split("\\n");
            rows[0] +=  "\t"+ lines[0];
            rows[1] +=  "\t"+ lines[1];
            rows[2] +=  "\t"+ lines[2];
        }
        for (int index = 0; index < rows.length; index++){
            rows[index] +=  "\n";
        }
        return convertArrayToString(rows);
    }

    public static String convertArrayToString(String array[]){
        StringBuilder builder = new StringBuilder();
        for (String value : array) {
            builder.append(value);
        }
        return builder.toString();
    }
}
