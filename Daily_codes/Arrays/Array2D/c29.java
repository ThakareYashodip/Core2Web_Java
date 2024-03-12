import java.util.* ;

class ArrayDemo9 {

        public static void main(String[] aggs) {

                Scanner sc  = new Scanner(System.in);
                System.out.println("Enter array size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Size of an array : " + arr.length);

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = sc.nextInt();
                }
		int sum = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
			sum = sum + arr[i];
                        System.out.println(arr[i]);
                }
		System.out.println("Sum : " + sum );

        }

}
