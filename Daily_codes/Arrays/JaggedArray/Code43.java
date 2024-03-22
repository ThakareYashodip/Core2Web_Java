import java.util.*;

class TwoDarray43 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for rows and columns ");
		int rows = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[rows][col];
		System.out.println("Enter Elements :");
		for( int i = 0 ; i < arr.length ; i++ ){
			for( int j = 0 ; j < arr[i].length ; j++ ){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Arrays Elements are : ");
		for( int i = 0 ; i < arr.length ; i++ ){
			for( int j = 0 ; j < arr[i].length ; j++ ){
				System.out.print(arr[i][j] + "\t");
			}
			 System.out.println();
		}
	
	}

}



