public class ForLoopChallenge {

    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 500; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }

            if (primeCount == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    

}
