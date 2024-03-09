import java.io.*;

class Factors1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num : ");
		int num = Integer.parseInt(br.readLine());
	
		System.out.println("Factors of " + num + " are ");
		int i = 1 ; 
		while( i <= num ){
			if( num % i == 0 ){
				System.out.print( i + "\t");
			}
			i++;
		}
		System.out.println();	
	}

}

