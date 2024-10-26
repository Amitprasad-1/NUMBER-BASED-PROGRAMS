public class SpyNumber {

    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        return sum == product;
    }

    public static void main(String[] args) {
        int number = 22;
        if (isSpy(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }
    }
}

