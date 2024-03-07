import java.io.*;

class T5 {

        public static void main(String[] args ) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

		char ch = (char)(rows+65);
                for( int i = 1 ; i <= rows ; i++ ) {
                        for( int j = 1 ; j <= i ; j++ ) {
                                System.out.print( ch++ + " ");
                        }
                        System.out.println();
                }

        }

}

