class reverseNumber{

    public static int reverse(int number){
        int revNumber=0;
        int last_digit=0;
        while(number>0){
            last_digit=number%10;
            revNumber=revNumber*10+last_digit;
            number/=10;

        }
        return revNumber;
    }
    public static void main(String[]args){
       System.out.println(" "+ (reverse(123)) ); 

    }
}