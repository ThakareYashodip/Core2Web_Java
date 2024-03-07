import java.io.*;

class T4 {

        public static void main(String[] args ) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());


                for( int i = 1 ; i <= rows ; i++ ) {
                        char ch1 = (char)(rows+96);
			char ch2 = (char)(rows+64);
                        for( int j = 1 ; j <= i ; j++ ) {
				if( i % 2 == 1 ) {
					System.out.print( ch1-- + " " );
				} else {
					System.out.print( ch2-- + " " );
				}

			}
			System.out.println();
		}
	
	}

}

