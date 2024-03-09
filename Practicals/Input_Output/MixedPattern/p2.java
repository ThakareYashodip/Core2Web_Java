import java.io.*;

class s2 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());
		
		char ch = (char)(64+rows);
                for( int i = 1 ; i <= rows ; i++ ){
			int num = rows + i - 1 ; 
                        for( int j = 1 ; j <= rows ; j++ ){
                                System.out.print( ch + "" + num++ + "\t");
                        }
                        System.out.println();
                }

        }

}
