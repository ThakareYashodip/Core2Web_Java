import java.io.*;

class Y12 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		for( int i = 1 ; i <= rows ; i++ ){ 
			int num = 65+i-1 ; 
			for( int j = 1 ; j <= rows-i+1 ; j++ ){
				if( num % 2 == 1 ){
					System.out.print( num + " ");
				} else {
					System.out.print( (char)num + " " );
				}
				num++;
			}
			System.out.println();
		}
	}

}

