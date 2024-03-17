import java.util.*;

class Sun7 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Elements : ");
                        arr[i] = sc.nextInt();
                }

      		System.out.println("Array elements are : "); 
                for(int i = 0 ; i < arr.length ; i++ ){
                        if( size % 2 == 0 ){
				System.out.println(arr[i]);
				i++;
			} else {
				System.out.println(arr[i]);
			}
                }
	
	}

}
