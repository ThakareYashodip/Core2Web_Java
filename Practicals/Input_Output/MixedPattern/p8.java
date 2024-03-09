import java.io.*;

class s8 {

        public static void main(String[] args) throws IOException {

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());
		
		int num = (rows*(rows+1))/2;
		int temp = num ;
		char ch = (char)( 64 + temp);
		for( int i =1 ; i <= rows ; i++ ){
		        for( int j = 1 ; j <= rows-i+1 ; j++) {
				System.out.print( ch-- + "\t");
			}
		System.out.println();
		}
	}

}

