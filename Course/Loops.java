import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // While loop
        // int counter = 1;
        // while (counter <= 10) {
        // System.out.print(counter+" ");
        // counter++;
        // }

        // Print number from 1 to n
        // int num=sc.nextInt(),count=1;
        // while(count <= num){
        // System.out.print(count+" ");
        // count++;
        // }

        // Sum of first n natural numbers
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int i = 1, sum = 0;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println(sum);

        // For Loop
        // for(int i=1;i<=10;i++){
        // System.out.println("Hello World");
        // }

        // Print Square Pattern
        // for (int i = 1; i <= 4; i++) {
        // System.out.println("****");
        // }

        // Print reverse of number
        // int n = 12;
        // while(n>0) {
        // int Lastdigit = n % 10;
        // System.out.print(Lastdigit);
        // n = n / 10;
        // }
        
        // Reverse the given number
        // int n=10899,reverse=0;
        // while(n>0){
        // int Lastdigit=n%10;
        // reverse=(reverse*10)+Lastdigit;
        // n=n/10;
        // }
        // System.out.println(reverse);

        // Break Statement
        // for(int i=1;i<=5;i++){
        // System.out.println("Enter the number :");
        // int n=sc.nextInt();
        // if(n%10==0){
        // break;
        // }
        // }

        // Continue Statement
        // for (int i = 1; i <= 5; i++) {
        //     System.out.print("Enter the number :");
        //     int n=sc.nextInt();
        //     if (n%10==0) {
        //         continue;
        //     }
        //     System.out.println(n);
        // }


        //Check Prime number
        // System.out.println("Enter a number");
        // int n=sc.nextInt();
        // boolean isPrime=true;
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         isPrime=false;
        //     }
        // }
        // if(isPrime==true){
        //     System.out.println("PRIME");
        // } else{
        //     System.out.println("NOT PRIME");
        // }

        sc.close();

    }

}
