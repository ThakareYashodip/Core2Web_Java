
import java.io.* ;

class Y10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows : ");
		int rows = Integer.parseInt(br.readLine());

		for( int i = 1 ; i <= rows ; i++ ){
			char ch = (char)(64 + rows-i+1);
			for( int j = rows ; j >= 1 ; j-- ){ 
				System.out.print( ch-- + " ");
			}
			System.out.println();
		}
	
	}

}

