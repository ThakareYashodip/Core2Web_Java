import java.io.*;

class YashArray9 {

        public static void main(String[] args) throws IOException {

          /*      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size : ");
                int size = Integer.parseInt(br.readLine());
	  */
                int arr[] = new int[]{1,2,3,4,5,6,7,8,9,20};

                for( int i =  0 ; i < arr.length ; i++ ){
			if( i % 2 == 1 ){
				System.out.println( arr[i] + " is an odd indexed element" );
			}

		}

	}

}

