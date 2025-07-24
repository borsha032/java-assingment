public class GoldbachConjecture {
    
    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void findGoldbachPairs(int evenNumber) {
        if (evenNumber <= 2 || evenNumber % 2 != 0) {
            System.out.println("Please enter an even number greater than 2.");
            return;
        }

        System.out.println("Goldbach pairs for " + evenNumber + ":");

        for (int i = 2; i <= evenNumber / 2; i++) {
            int j = evenNumber - i;
            if (isPrime(i) && isPrime(j)) {
                System.out.println(i + " + " + j + " = " + evenNumber);
            }
        }
    }

    public static void main(String[] args) {
        int number = 28;  
        findGoldbachPairs(number);
    }
}
