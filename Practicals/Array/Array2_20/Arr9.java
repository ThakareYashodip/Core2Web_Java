





import java.util.*;

class Sun9 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Elements : ");
                        arr[i] = sc.nextInt();
                }

                int min = arr[0];
                for(int i = 1 ; i < arr.length ; i++ ){
                        if( arr[i] < min ){
				min = arr[i];
                        }
                }
                System.out.println("Minimum number in the array is " + min );
        }

}
