package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        if (n%2 ==0) {
            System.out.println("Given number is even");
        }if(n > 5 ){
             System.out.println("Given number greater then 5");
        }if (n > 10) {
            System.out.println("Given number greater then 10");
        }

    }
}