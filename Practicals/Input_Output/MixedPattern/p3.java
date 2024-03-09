import java.io.*;

class s3 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                for( int i = 1 ; i <= rows ; i++ ){
	                char ch = (char)(64+rows);
                        for( int j = 1 ; j <= rows ; j++ ){
                   		if( i % 2 == 0 ){
					System.out.print(j + "\t");
				}else {
					System.out.print(ch-- + "\t");
				}
                        }
                        System.out.println();
                }

        }

}
