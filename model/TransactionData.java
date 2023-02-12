package com.fintech.app.model;

public class TransactionData {

	private String fullName;
	private long accountId;
	private String source;
	private String date;
	private String amount;

	public TransactionData () {


	}

	public TransactionData (String fullName, long accountId, String source, String date, String amount) {

		this.fullName = fullName;
		this.accountId = accountId;
		this.source = source;
		this.date = date;
		this.amount = amount;


	}
	
	public String getFullName () {

		return fullName;

	}

	public long getAccountId () {

		return accountId;

	}


	public String getSource () {

		return source;

	}

	public void setSource (String source) {
		
		this.source = source;

	}

	public String getDate () {
	
		return date;

	}

	public void setDate (String date) {
	
		this.date = date;

	}

	public String getAmount () {
	
		return amount;

	}

	public void setAmount (String amount) {
	
		this.amount = amount;

	}



}