package austify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.print("Number: ");
       Scanner scanner =  new Scanner(System.in);
       byte number = scanner.nextByte();

       if (number % 5 == 0 && number % 3 == 0)
           System.out.println("FizzBuzz");
       else if(number % 3 == 0)
           System.out.println("Buzz");
       else if(number % 5 == 0)
           System.out.println("Fizz");
       else
           System.out.println(number);
    }
}
