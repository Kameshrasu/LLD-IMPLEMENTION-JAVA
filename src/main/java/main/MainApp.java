package main;
import java.sql.*;
import java.util.Scanner;

import Model.*;
import ModelDAO.*;
import Service.*;

public class MainApp {

    public static void main(String[] args) throws  SQLException {
        
       Scanner sc = new Scanner(System.in);
        

        
        while(true){
            System.out.println("1 ==> ADD USER");
            System.out.println("2 ==> deposit");
            System.out.println("3 ==> withdraw");
            System.out.println("4 ==> exit");
            System.out.println("select the options");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    adduser();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    return;
                default :
                    System.out.println("Unknown choice");
                    break;
            }
        }
    }

    private static void adduser() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String name = sc.nextLine();
        System.out.println("ENTER YOUR ACCOUNT NUMBER");
        int account_no = sc.nextInt();
        BankingDetails newuser = new BankingDetails(name , account_no , 0);
        BankingDetailsDAO bd = new BankingDetailsDAO();
        bd.adduserDetail(newuser);
    }

    private static void deposit() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR ACCOUNTNUMBER");
        int acc_no = sc.nextInt();
        System.out.println("ENTER THE DEPOSIT AMOUNT");
        int amount = sc.nextInt();
        BankingDetailsDAO bd = new BankingDetailsDAO();
        TranscationDetails tdetails = new TranscationDetails(acc_no , "deposit" ,amount);
        TranscationDetailsDAO td = new TranscationDetailsDAO();
        BankAccount user = new BankAccount(bd , td);
        user.deposit(acc_no,amount);
        td.addtranscation(tdetails);


    }

    private static void withdraw() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR ACCOUNTNUMBER");
        int acc_no = sc.nextInt();
        System.out.println("ENTER THE WITHDRAW AMOUNT");
        int amount = sc.nextInt();
        BankingDetailsDAO bd = new BankingDetailsDAO();
        TranscationDetailsDAO td = new TranscationDetailsDAO();
        BankAccount user = new BankAccount(bd , td);
        user.withdraw(acc_no , amount);
        TranscationDetails tdetails = new TranscationDetails(acc_no , "withdraw" ,amount);
        td.addtranscation(tdetails);

    }



}
