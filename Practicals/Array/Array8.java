import java.io.*;

class YashArray8 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter count : ");
                int count = Integer.parseInt(br.readLine());

                int arr[] = new int[count];

                for( int i =  0 ; i < arr.length ; i++ ){
			System.out.println("Enter Age : ");
                        arr[i] = Integer.parseInt(br.readLine());
                }
                for( int i = 0 ; i < arr.length ; i++ ){
			int num = i ;
                        System.out.println("Age of employee No : " + ++num + " is " + arr[i]);
                }

        }

}
