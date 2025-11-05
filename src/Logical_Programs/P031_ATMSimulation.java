package Logical_Programs;

//ATM Withdrawal Simulation
//
//Initialize the account balance with a fixed amount (e.g., ₹10,000).
//Take user input for the amount they want to withdraw.
//Check withdrawal conditions:
    //The amount should be greater than zero.
    //The amount should be a multiple of 100 (common ATM rule).
    //The amount should not exceed the account balance.
        //Deduct the amount from the balance if conditions are met.
        //Display the updated balance or an error message if the withdrawal fails.

import java.util.Scanner;

public class P031_ATMSimulation {
    public static void main(String[] args) {
        atmSimulation();
    }

    static void atmSimulation(){
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount in multiples of 100: ");
        if(scanner.hasNextInt()){
            int entered_amt = scanner.nextInt();
            if(entered_amt >0 && entered_amt%100 == 0 && entered_amt<balance){
                balance = balance - entered_amt;
                System.out.println("Withdrawal successful! Balance available is "+ balance);
            }else
                System.out.println("Withdrawal failed");

        }else
            System.out.println("Enter proper amount");
    }
}
