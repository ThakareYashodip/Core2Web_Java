





import java.util.*;

class Sun10 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Elements : ");
                        arr[i] = sc.nextInt();
                }

                int max = arr[0];
                for(int i = 1 ; i < arr.length ; i++ ){
                        if( arr[i] > max ){
                                max = arr[i];
                        }
                }
                System.out.println("Maximum number in the array is " + max );
        }

}
