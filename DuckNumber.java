public class DuckNumber {

    public static boolean isDuck(int number) {
        String strNum = String.valueOf(number);
        if (strNum.charAt(0) == '0') return false;
        return strNum.contains("0");
    }

    public static void main(String[] args) {
        int number = 203; 
        if (isDuck(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }
    }
}
