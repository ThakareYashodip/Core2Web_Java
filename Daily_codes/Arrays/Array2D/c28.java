import java.util.* ;

class ArrayDemo8 {

        public static void main(String[] aggs) {

                Scanner sc  = new Scanner(System.in);
                System.out.println("Enter array size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Size of an array : " + arr.length);

                for( int i = 0 ; i < arr.length ; i++ ){
                        System.out.print("Enter Element : \n");
			arr[i] = sc.nextInt();
                }
		System.out.println("Array Elements are : ");
                for( int i = 0 ; i < arr.length ; i++ ){
                        System.out.println(arr[i]);
                }

        }

}
