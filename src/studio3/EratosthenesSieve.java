public class EratosthenesSieve {
    public static void main(String[] args) {
        
        int n = 40;
        boolean[] numbers = new boolean[n];

        int p = 2;

        while (p < 40) {
            for (int i = 2; p * i < n; i++) {
            numbers[p * i] = true;
        }
        p += 1;
        }



        // PRINTING ARRAY
        for (int j = 0; j <= 40; j++) {
            System.out.println(numbers[j]);
        }

		
		}
	}

