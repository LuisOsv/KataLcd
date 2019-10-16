public class NumberToLCD {

    public static String convertDigit(int digit){
        StringBuilder sb = new StringBuilder();

        switch (digit){
            case 1:
                sb.append("|\n");
                sb.append("|");
                break;
            case 2:
                sb.append(" _ \n");
                sb.append(" _|\n");
                sb.append("|_ ");
                break;

            case 3:
                sb.append(" _ \n");
                sb.append(" _|\n");
                sb.append(" _|");
                break;
            case 4:
                sb.append("   \n");
                sb.append("|_|\n");
                sb.append("  |");
                break;
            case 5:
                sb.append(" _ \n");
                sb.append("|_ \n");
                sb.append(" _|");
                break;
            case 6:
                sb.append(" _ \n");
                sb.append("|_ \n");
                sb.append("|_|");
                break;
            case 7:
                sb.append(" _ \n");
                sb.append("  | \n");
                sb.append("  |");
                break;
            case 8:
                sb.append(" _ \n");
                sb.append("|_| \n");
                sb.append("|_|");
                break;
            case 9:
                sb.append(" _ \n");
                sb.append("|_| \n");
                sb.append(" _|");
                break;
            case 0:
                sb.append(" _ \n");
                sb.append("| | \n");
                sb.append("|_|");
                break;
            default:

                break;
        }
        return sb.toString();
    }

    public static String convertTwoDigits(int digits){
        String result = "";

        String digitsString = String.valueOf(digits);
        int length = digitsString.length();
        for (int index = 0; index < length; index++){
            String singleDigit = digitsString.valueOf(index);
            String digitConverted = convertDigit(Integer.valueOf(singleDigit));
            result += digitConverted;
        }
        return result;
    }
}
