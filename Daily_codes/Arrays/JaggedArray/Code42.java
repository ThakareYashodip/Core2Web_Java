

import java.io.*;

class OneDInput42 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Size : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Elements :");
		for( int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for( int i = 0 ; i < arr.length ; i++ ){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}

