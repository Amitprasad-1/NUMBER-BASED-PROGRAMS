public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        String strNum = String.valueOf(number);
        int sum = 0;
        int numDigits = strNum.length();

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(strNum.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}
