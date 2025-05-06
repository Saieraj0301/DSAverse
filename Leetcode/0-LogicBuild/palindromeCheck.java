public class palindromeCheck{

    public static void palindrome(int number){
        int original_number=number;
        
        int revNumber=0;
        while(number!=0){
           int last_digit=number%10;
            revNumber=revNumber*10+last_digit;
            number/=10;

        }
        if(revNumber==original_number)
            System.out.println("Given number is a palindrome");
        else
           System.out.println("Given number is not a palindrome");
    }
    public static void main(String[] args) {
        palindrome(121);
        palindrome(112);

    }
}
