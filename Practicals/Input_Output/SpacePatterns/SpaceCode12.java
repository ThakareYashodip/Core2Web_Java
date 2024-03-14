import java.io.*;

class SpaceDemo12 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                for( int i = 1 ; i <= rows ; i++ ){
                        for( int sp = 1 ; sp < i ; sp++ ){
                                System.out.print("\t");
                        }
			int num = 65+i-1;
                        for( int j =1 ; j <= rows-i+1 ; j++ ){
				if( num % 2  == 1){
					System.out.print( num + "\t");
				} else {
					System.out.print((char)(num) + "\t");	
				}
				num++;
			}
                 	System.out.println();
                }

        }

}
