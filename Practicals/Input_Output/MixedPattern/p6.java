import java.io.*;

class s6 {

        public static void main(String[] args) throws IOException {

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                for( int i = 1 ; i<= rows ; i++ ){
                        int num = rows ;
                        for( int j = 1 ; j <= i ; j++ ){
				if( i % 2 == 0 ){
					System.out.print( num + "\t" );
				} else {
					System.out.print( (char)(num+64) + "\t" );
				}
			num--;
			}	
                        System.out.println();
                }

        }

}
