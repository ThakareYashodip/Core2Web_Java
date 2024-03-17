import java.util.*;

class Sun2 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new  int[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = sc.nextInt();
                }

                int sum = 0;
                System.out.print("Divisible by 3 numbers are : ");
                for( int i = 0 ; i < arr.length ; i++ ){
                        if( arr[i] % 3 == 0 ){
                                System.out.print(arr[i] + "\t");
                                sum += arr[i ];
                        }
                }
                System.out.println("\n Sum of the numbers are : " + sum);
        }

}
