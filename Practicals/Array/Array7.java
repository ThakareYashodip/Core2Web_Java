import java.io.*;

class YashArray7 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                for( int i =  0 ; i < arr.length ; i++ ){
                        arr[i] = Integer.parseInt(br.readLine());
                }
                for( int i = 0 ; i < arr.length ; i++ ){
			if(arr[i] % 4 == 0 ){
				System.out.println(arr[i] + " is divisible by 4 and it's index is " + i );
			}

                }

        }

}
