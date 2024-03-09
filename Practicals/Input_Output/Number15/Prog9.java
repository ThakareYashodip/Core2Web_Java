import java.io.*;

class Palindrome {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Num : ");
                int num = Integer.parseInt(br.readLine());
		
		int temp = num ;
                int rem = 0 ;
                int varr = 0 ;
                while( num != 0 ){
                        rem = num % 10 ;
                        varr = varr * 10 + rem ;
                        num /= 10 ;
                }
		if( temp == varr ){
			System.out.println( "This is Palindrome Number" );
		} else {
			System.out.println( "This is not Palindrome Number" );
		}


        }

}
