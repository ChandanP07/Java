
// import java.io.*;

public class Functions {

    // public static void printHelloWorld() {
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // }


    // Func- To find sum of 2 nums
    // public static int calculatesum(int a, int b) { //Formal Parameters
    // int sum = a + b;
    // return sum;
    // }


    // Func- To Swap 2 nums
    // public static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.print("a = " + a + "\n" + "b = " + b);
    // }


    // Func- to find product of 2 nums
    // public static int product(int a, int b) {
    // int product=a * b;
    // return product;
    // }


    // Func- to find Factorial of a number
    // public static int factorial(int n) {
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact = fact * i;
    // }
    // return fact;
    // }


    // Func- to find BinomialCoefficient
    // public static int binomialcoefficient(int n, int r) {
    // int n_fact=factorial(n);
    // int r_fact=factorial(r);
    // int nmr_fact=factorial(n-r);
    // int bc = factorial(nmr_fact)/ (r_fact * nmr_fact);
    // return bc;
    // }


    // Func- to return sum of 2 nums
    // public static int sum(int a, int b) {
    // return a + b;
    // }


    // Func- to return sum of 3 nums
    // public static int sum(int a, int b,int c) {
    // return a + b + c;
    // }


    // Func- To Calculate int sum
    // public static int sum(int a, int b) {
    // return a + b;
    // }


    // Func- To Calculate float sum
    // public static float sum(float a, float b) {
    // return a + b;
    // }


    // Func- To Check for Prime only for n>=1
    // public static boolean isPrime(int n) {
    // //corner cases
    // //2
    // if(n==2){
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }


    // Func- To check prime optimised
    // public static boolean isPrime(int n){
    // if(n==2){
    // return true;
    // }
    // for(int i=2;i<=Math.sqrt(n);i++){
    // if(n%i==0) {
    // return false;
    // }
    // }
    // return true;
    // }


    // Func- To check primesinrange
    static boolean IsPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    // Func-To Convert Binary to Decimal
        // public static void bintoDec(int binum) {
        // int mynum=binum;
        // int pow = 0;
        // int decnum = 0;
        // while (binum > 0) {
        // int lastdigit = binum % 10;
        // decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
        // pow++;
        // binum /= 10;
        // }
        // System.out.println("decimal of " + mynum + " = " + decnum);
        // }


    // Func- To Convert from Decimal to Binary
        // public static void Dectobin(int Decnum){
        // int mynum=Decnum;
        // int rem=0;
        // int bin=0,pow=0;
        // while(Decnum > 0){
        // rem=Decnum%2;
        // bin =bin+rem*(int)Math.pow(10, pow);
        // pow++;
        // Decnum=Decnum/2;
        // }
        // System.out.println("Binary of " + mynum + " = " + bin);
        // }
    }

    public static void main(String args[]) {

        System.out.print("Enter the number till where you want prime numbers : ");
        int n = Integer.parseInt(args[0]);
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " , ");
            }
        }

        // bintoDec(1010);
        // Dectobin(20);
        // primesInRange(5);
    }

}
