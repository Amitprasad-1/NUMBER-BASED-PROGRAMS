public class PronicNumberr {

    public static boolean isPronic(int number) {
        for (int i = 0; i < number; i++) {
            if (i * (i + 1) == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 20;
        if (isPronic(number)) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }
    }
}
