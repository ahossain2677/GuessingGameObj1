package Abdul_Hossain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    { System.out.println("What is the correct number?");
        Scanner input = new Scanner(System.in) ;

        (int rand){
        int max = 100  ;
        int min = 1;
        int range = max - min + 1;
        // generate random number from 1 to 10
        int rand = (int) (Math.random()* range) + min;
        Integer.toString(rand);}




        if(input = rand){
        System.out.println("Correct");
    }else{
            System.out.println("Incorrect");}
    }
}
