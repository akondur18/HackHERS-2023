package com.fintech.app.controller;

import com.fintech.app.model.TransactionData;

import com.fintech.app.view.TransactionView;

import java.util.Scanner;

public class TransactionController {


	public TransactionController () {


	}


	public TransactionData controlTransaction () {

		TransactionView view = new TransactionView ();

		TransactionData info = view.render ();

		System.out.println ("Customer's Name: " + info.getFullName ());
		
		System.out.println ("Customer's Account ID: " + info.getAccountId());

		System.out.println ("Source of Transaction: " + info.getSource ());
          	
		System.out.println ("Date of Transaction: " + info.getDate ());
           	
		System.out.println ("Transaction Amount: " + info.getAmount ());

		System.out.println ("NOW SIMULATING CUSTOMER POINT OF VIEW");

		Scanner scan = new Scanner (System.in);

		System.out.println ("Please enter the minimum amount that you would like to be notified for: ");

		String minimum = (scan.nextLine ());

		if (info.getAmount() == minimum) {

			System.out.println ("Do you want to verify this purchase? Type [Y] for yes, [N] for no.");

			String response = scan.nextLine ();
		
				if (response == "Y") {

				System.out.println ("Transaction verified.");

				} else if (response == "N") {

				System.out.println ("Transaction denied.");

				}
			
	
		} else {

			System.out.println ("Transaction approved.");

		}

		return info;


	}

}