import java.util.Math;
import java.util.Scanner;

public static void main(String[] args){
    int calc = 0;
    String c = 'yes';
    int n;
    while(c.equals('yes')){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which calculation would you like to do? Type the corresponding number.");
        System.out.println("1: 2^n");
        System.out.println("2: n!");
        System.out.println("3: nth Fibonacci number");
        calc = sc.nextInt();
        
        if(calc>3 || calc<1){
            System.out.println("Not a recognized command");
        }
        
        else{
            System.out.println("Please enter n.");
            n = sc.nextInt();
            while(n>20){
                System.out.println("Please select a value below 20");
                n = sc.nextInt();
            }
            if(calc == 1){
                
            }
            else if(calc == 2){
                
            }
            else if(calc == 3){
                  
            }
        }
        
        System.out.println("Would you like to continue? (yes/no)");
        c = sc.next();
    }
}