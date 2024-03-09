import java.io.*;

class  Factorial {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Num : ");
                int num = Integer.parseInt(br.readLine());
		
		int fact = 1 ;
		int i = 1 ;
		while( i <= num ){
			fact = fact * i ;
			i++;
		}
		System.out.println("Factorials of " + num + " are " + fact + " ." );
	}

}

