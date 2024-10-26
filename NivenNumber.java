public class NivenNumber {

    public static boolean isNiven(int number) {
        int sum = 0;
        int temp = number;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        return number % sum == 0;
    }

    public static void main(String[] args) {
        int number = 18;
        if (isNiven(number)) {
            System.out.println(number + " is a Niven Number.");
        } else {
            System.out.println(number + " is not a Niven Number.");
        }
    }
}
