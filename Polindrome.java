class Polindrome {
    public static void main(String args[]) {

        // Palindrome
        int n = 121;
        int temp = n;
        int rev = 0;

        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Armstrong
        int a = 153;
        int temp1 = a;
        int sum = 0;

        while(a > 0) {
            int rem = a % 10;
            sum = sum + rem * rem * rem;
            a = a / 10;
        }

        if(temp1 == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}