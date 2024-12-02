public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        
        int[] startNumber = new int[n-1];
            for (int i = 0; i<startNumber.length-2; i++ ) {
                startNumber[i] = i+2;
            }
        boolean[] isPrime = new boolean[n+1];
            for (int j = 2; j<=n; j++) {
                isPrime[j] = true;
            }
        for (int q = 2; q*q <= n; q++) {
            if (isPrime[q]) {
                for (int multiples = q*q; multiples<= n; multiples += q ) {
                   isPrime[multiples] = false; 
                }
            }
        }
        System.out.println("Prime numbers up to "+n+":");
        int count = 0;
        for (int print = 2; print <= n; print++ ) {
            if (isPrime[print]) {
                System.out.println(print);
                count++;
            }
        }
        int ratio = (int) (((double) count / n) * 100);
        System.out.println("There are "+count+" primes between 2 and "+n+" ("+ratio+"% are primes)");
    }
}