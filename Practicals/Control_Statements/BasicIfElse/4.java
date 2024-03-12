 class charecterCaseCheck {
    public static void main(String[] args) {
        char ch = 'a';
        int asciiValue = (int) ch;
        if (asciiValue >= 65 && asciiValue <= 90) {
            System.out.println(ch + " is an uppercase character.");
        }
        else if (asciiValue >= 97 && asciiValue <= 122) {
            System.out.println(ch + " is a lowercase character.");
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }
    }
}
