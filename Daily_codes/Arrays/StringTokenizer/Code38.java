import java.util.Scanner;

class Demo38     {

        public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = sc.next();

		System.out.println("Enter Society name :");
		String socName = sc.next();

		System.out.println("Enter Wing :");
		char wing = sc.next().charAt(0);

		System.out.println("Enter FlatNO : ");
		int flatNo = sc.nextInt();


                System.out.println("Name : " + name);
                System.out.println("socName : " + socName);
                System.out.println("Wing : " + wing);
                System.out.println("flatNo : " + flatNo);
        }

}
