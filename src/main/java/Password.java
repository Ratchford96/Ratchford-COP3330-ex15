/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Joseph Ratchford
 */
import javax.swing.*;
import java.util.Scanner;

public class Password {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print(" What is the password? ");
        String password = scan.nextLine();
        String answer = "abc$123";
        // This function prints true if the answer is true

        if(answer.equals(password))
        {
            System.out.println(" Welcome!");
        }
        // This prints if you don't enter the correct password.
        else
        {
            System.out. println(" I don't know you.");
    }
    }
}
