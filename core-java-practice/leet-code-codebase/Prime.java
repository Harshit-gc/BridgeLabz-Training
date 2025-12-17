import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if( num == 2 ){
            System.out.println("Prime");
        }
        else{
            boolean isprime = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime = false;
                }   
            }
            if(isprime==true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }
}
