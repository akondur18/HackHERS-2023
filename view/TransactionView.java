package com.fintech.app.view;

import com.fintech.app.model.TransactionData;

import java.util.Scanner;

public class TransactionView {

	public TransactionView () {

	}

	public TransactionData render () {

		Scanner scan = new Scanner (System.in);

            System.out.println ("Hello, what is your customer's name?");
            String name = scan.nextLine ();
            
            System.out.println ("Please provide us with your customer's account ID for verification purposes.");
            Long id = Long.parseLong (scan.nextLine());

            System.out.println ("Thank you for the information. Please enter the following information to log in a transaction.");

            System.out.println ("Please enter the source of transaction.");
            String tranName = scan.nextLine ();

            System.out.println ("Please enter the date of transaction.");
            String tranDate = scan.nextLine ();

            System.out.println ("Please enter the transaction amount.");
            String tranAmount = scan.nextLine();

            System.out.println ("Thank you for the information. Please wait while we compile your data.");

	TransactionData transactionInfo = new TransactionData (name, id, tranName, tranDate, tranAmount);

	return transactionInfo;



	}

}

