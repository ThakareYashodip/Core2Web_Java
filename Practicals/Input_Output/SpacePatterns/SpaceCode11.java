import java.io.*;

class SpaceDemo11 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                for( int i = 1 ; i <= rows ; i++ ){
                        for( int sp = 1 ; sp < i ; sp++ ){
                                System.out.print("\t");
                        }
			char ch = (char)(rows+64);
                        for( int j = 1 ; j <= rows-i+1 ; j++ ){
                                System.out.print( ch-- + "\t");
                        }
                System.out.println();
                }

        }

}
