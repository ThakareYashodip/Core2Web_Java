
import java.util.*;

class Sun8 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Elements : ");
                        arr[i] = sc.nextInt();
                }

                
                for(int i = 0 ; i < arr.length ; i++ ){
                        if( arr[i] > 5 && arr[i] < 9 ){
                                System.out.println(arr[i] + " is greater than 5 but less than 9 .");
                        }
                }
                
	}

}
