import java.io.*;

class Y8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows : ");
		int rows = Integer.parseInt(br.readLine());

		for( int i = 1 ; i <= rows ; i++ ){
			int num = i ;
			for( int j = 1 ; j <= rows-i+1 ; j++ ){
			       System.out.print( num++ + " " );
			}
	 		System.out.println();
		}

	}

}
