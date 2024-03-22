import java.util.*;

class TwoDArray44 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for rows and columns ");
		int rows = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[rows][col];

		System.out.println("Enter Elements :");

		for( int i = 0 ; i < arr.length ; i++ ){
			for( int j= 0 ; j < arr[i].length ; i++ ){
			       arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Arrays Elements are : ");
		for( int i = 0 ; i < arr.length ; i++ ){
                        for( int j= 0 ; j < arr[i].length ; i++ ){
                               System.out.print(arr[i][j] + "\t");
                        }
			System.out.println();
                }		

	}

}
