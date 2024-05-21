/*The moon's gravity is about 17 percent that of the earth's. Write a program
that computes your effective weight on the moon */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your weight on Earth : ");
        Scanner Earth_weight_input = new Scanner(System.in);
        int Earth_weight = Earth_weight_input.nextInt();
        double Moon_Weight = Earth_weight * .17;
        System.out.println("Your weight on the moon is : " + Moon_Weight + " Lbs");
    }
}