










class inputdemo96 {

        int x = 30 ;
        static int y = 60 ;

	void fun() {
		System.out.println("In Fun Method");
	}
	static void run() {
		System.out.println("In Run Method");
	}


        public static void main(String[] args) {

                inputdemo96 obj = new inputdemo96();
                System.out.println(x);
                System.out.println(obj.y);
		fun();
		obj.run();

        }

}
