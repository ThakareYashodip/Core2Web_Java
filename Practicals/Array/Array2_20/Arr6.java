



import java.util.*;

class Sun6 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Elements : ");
                        arr[i] = sc.nextInt();
                }

                int prod = 1 ;
                for(int i = 0 ; i < arr.length ; i++ ){
                        if( arr[i] % 2 == 1 ){
                                prod *= arr[i];
                        }
                }
                System.out.println("Product of odd indexed elements is : " + prod );
        }

}
