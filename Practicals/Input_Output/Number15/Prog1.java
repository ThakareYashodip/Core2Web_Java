import java.io.*;

class PrimeNumbers {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Num : ");
                int num = Integer.parseInt(br.readLine());

		int count = 0;
		int i = 1 ;
		while( i <= num ) {
			if( num % i == 0 ){
				count++;
			}
			i++;
		}
		if( count == 2 ){
			System.out.println(num + "is a Prime Number");
		} else {
			System.out.println(num + "is not a Prime Number");
		}
		System.out.println();
	}

}

