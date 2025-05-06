public class factorialofNumber {
    public static int factorial(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }

        return factorial;
    }
    public static void main(String[] args) {
        
        System.out.println(" "+(factorial(5)));
    }
}
