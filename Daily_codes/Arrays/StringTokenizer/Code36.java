import java.io.*;

class Demo36     {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print( "Enter your name : " );
                String name = br.readLine();

                System.out.print( "Enter society name : " );
                String socName = br.readLine();

                System.out.print( "Enter wing : " );
                char wing = (char)br.read();

                System.out.print("Enter Flat No : ");
                int flatNo = Integer.parseInt(br.readLine());
		
		br.skip(1);

                System.out.println("Name : " + name);
                System.out.println("socName : " + socName);
                System.out.println("Wing : " + wing);
                System.out.println("flatNo : " + flatNo);
        }

}
