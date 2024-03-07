import java.io.*;

class T7 {

        public static void main(String[] args ) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                char ch = 97 ;
                for( int i = 1 ; i <= rows ; i++ ) {
                        int num = i ;
			for( int j = 1 ; j <= i ; j++ ) {
                                if( j % 2 == 1 ){
                                        System.out.print( num + " " );
                                } else {
                                        System.out.print( ch++ + " " );
                                }
                        }
                        System.out.println();
                }

        }

}
