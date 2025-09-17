public class CheckPrime {
    public static void main(String[] args) {
        int num = 29; // You can change this number to test

        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (num <= 1) {
            isPrime = false;
        } else {
            // check from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // print result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
