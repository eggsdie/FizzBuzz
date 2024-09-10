public class Reduce {
        public static void main(String[] args) {
            int n = 100;
            int steps = 0;

            while (n > 0) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n -= 1;
                }
                steps++;  // Count each step
            }

            System.out.println("Steps to reduce 100 to 0: " + steps);
        }
    }


