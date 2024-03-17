import java.io.*;

class YashArray6 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size : ");
                int size = Integer.parseInt(br.readLine());

                String arr[] = new String[size];

                for( int i =  0 ; i < arr.length ; i++ ){
			System.out.println("Enter Characters : ");
                        arr[i] = br.readLine();
                }
		System.out.println("All characters are ; ");
                for( int i = 0 ; i < arr.length ; i++ ){
                        System.out.println(arr[i]);
                }

        }

}
