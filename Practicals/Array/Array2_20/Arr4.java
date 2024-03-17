


import java.util.*;

class Sun4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i = 0 ; i < arr.length ; i++ ){
		
			arr[i] = sc.nextInt();
		}		
		
		System.out.print("Enter the number to search in array : ");
		int num = sc.nextInt();
		int index = 0 ;
		for(int i = 0 ; i < arr.length ; i++ ){
		
			if(arr[i] == num){
				index  = i ;			
				System.out.println("\n" + num + " found at index " + index );
			}
		}
	}

}	
