import java.io.*;

class T8 {

        public static void main(String[] args ) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                char ch = 99 ;
                for( int i = 1 ; i <= rows ; i++ ) {
                        int num = 1 ;
                        for( int j = 1 ; j <= i ; j++ ) {
                                if( j % 2 == 1 ){
                                        System.out.print( num + " " );
					num += 2 ;
                                } else {
                                        System.out.print( ch + " " );
					ch += 2 ;
                                }
                        }
                        System.out.println();
                }

        }

}
