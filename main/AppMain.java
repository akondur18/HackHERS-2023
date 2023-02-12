package com.fintech.app.main;

import com.fintech.app.model.TransactionData;

import com.fintech.app.view.TransactionView;

import com.fintech.app.controller.TransactionController;

public class AppMain { 

	public static void main (String args []) {

		TransactionController t1 = new TransactionController ();

		t1.controlTransaction ();


	}

}