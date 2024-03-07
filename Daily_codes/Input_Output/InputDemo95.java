










class inputdemo95 {

        int x = 10 ;
        static int y = 32 ;
	
	void fun(){
		System.out.println("In Fun Method");
	}
	void run(){
		System.out.println("In Run Method");
	}

        public static void main(String[] args) {

                inputdemo95 obj = new inputdemo95();
                System.out.println(obj.x);
                System.out.println(obj.y);
		obj.fun();
		obj.run();

        }

}
