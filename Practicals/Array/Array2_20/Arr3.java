import java.util.*;

class Sun3 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size : ");
                int size = sc.nextInt();

                char arr[] = new  char[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = sc.next().charAt(0);
                }

                int index = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
                        if( arr[i] == 'a' || arr[i] == 'e'  || arr[i] == 'i'  || arr[i] == 'o'  || arr[i] == 'u'  || arr[i] == 'A' || arr[i] == 'E'  || arr[i] == 'I' || arr[i] == 'O'  || arr[i] == 'U' ){
                                index = i ;
				System.out.println("\n" + arr[i] + " found  at index " + index );
                        }
                }
                System.out.println();
        }

}
