import java.util.*;

class Sun1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();

		int arr[] = new  int[size];

		for( int i = 0 ; i < arr.length ; i++ ){
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		System.out.print("Even Numbers are : ");
		for( int i = 0 ; i < arr.length ; i++ ){
			if( arr[i] % 2 == 0 ){
				System.out.print(arr[i] + "\t");
				count++;
			}
		}
		System.out.println("\nCount of even elements are : " + count);
	}

}
