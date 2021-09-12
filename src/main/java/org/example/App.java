package org.example;

import java.util.Objects;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the order amount?");
        int order = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What state do you live in?");
        String state = input2.nextLine();

        System.out.println("The subtotal is $" + order);

        if(Objects.equals(state, "AL") || Objects.equals(state, "Ak") || Objects.equals(state, "AZ") || Objects.equals(state, "AR") || Objects.equals(state, "CA") || Objects.equals(state, "CO") || Objects.equals(state, "CT") || Objects.equals(state, "DE") || Objects.equals(state, "FL"))
        {
            double tax = order*.055;
            double total = order+tax;
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + total);


        }

        else
        {
            double tax = order*.066;
            double total = order+tax;
            System.out.println("The tax is $" + tax);
            System.out.println("The tax is $" + total);
        }
    }
}
