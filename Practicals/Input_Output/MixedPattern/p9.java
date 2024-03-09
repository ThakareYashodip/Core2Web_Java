import java.io.*;

class s9 {

        public static void main(String[] args) throws IOException {

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());
	
		char ch = (char)(64+rows);	
		for( int i = 1 ; i <= rows ; i++ ){ 
			int num = 1 ;
			for( int j = 1 ; j <= rows-i+1 ; j++ ){
				if( i % 2 == 0 ){
					System.out.print( ch-- + "\t" );
				} else {
					System.out.print( num+ + "\t" );
				}
			}
			ch-- ; 
			System.out.println();
		}

	}

}

