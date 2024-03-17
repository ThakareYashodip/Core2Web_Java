import java.util.*;

class Sun5 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++ ){
			System.out.print("Enter Elements : ");
                        arr[i] = sc.nextInt();
                }

                int sum = 0 ;
                for(int i = 0 ; i < arr.length ; i++ ){
			if( arr[i] % 2 == 1 ){
				sum += arr[i];
			}
                }
		System.out.println("Sum of odd Elements is : " + sum );
        }

}
