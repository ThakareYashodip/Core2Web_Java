import java.io.*;

class Demo29 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print( "Enter your name : " );
                String name = br.readLine();

                System.out.print( "Enter society name : " );
                String socName = br.readLine();

                System.out.print( "Enter wing : " );
                char wing = br.readLine();

                System.out.print("Enter Flat No : ");
                String flatNo = br.readLine();

        }

}

