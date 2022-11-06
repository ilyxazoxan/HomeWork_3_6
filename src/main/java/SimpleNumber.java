public class SimpleNumber {
    public static void main(String args[]) {

        int i, j;
        boolean isPrime;
        for (i = 2; i < 100; i++) {
            isPrime = true;
            // проверить, делится ли число без остатка
            for (j = 2; j <= i / j; j++)
                // если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) isPrime = false;
            if (isPrime)
                System.out.println(i + " - простое число.");
        }
    }

}
