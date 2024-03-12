import java.io.*;

class YashArray10 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter count : ");
                int count = Integer.parseInt(br.readLine());

                String arr[] = new String[count];

                for( int i =  0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Student Name : ");
			arr[i] = br.readLine();
                }
                for( int i = 0 ; i < arr.length ; i++ ){
                        int num = i ;
			System.out.println("Name of Student No : " + num++ + " is " + arr[i]);
                }

        }

}
