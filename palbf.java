class palbf{
    public static void main(String[] args) {
        int result = 0, num = 12321;
        int temp = num;
        while(temp != 0){
            int rem = temp%10;
            result = result*10+rem;
            temp = temp/10;
        }
        if (result == num) {
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
    }
}