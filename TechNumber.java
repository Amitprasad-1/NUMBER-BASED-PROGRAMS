public class TechNumber {

    public static boolean isTech(int number) {
        String strNum = String.valueOf(number);
        if (strNum.length() % 2 != 0) return false;

        int firstHalf = Integer.parseInt(strNum.substring(0, strNum.length() / 2));
        int secondHalf = Integer.parseInt(strNum.substring(strNum.length() / 2));
        int sum = firstHalf + secondHalf;
        
        return sum * sum == number;
    }

    public static void main(String[] args) {
        int number = 2025;
        if (isTech(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }
    }
}
