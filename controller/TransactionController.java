package com.fintech.app.controller;

import com.fintech.app.model.TransactionData;

import com.fintech.app.view.TransactionView;

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

		return info;


	}

}