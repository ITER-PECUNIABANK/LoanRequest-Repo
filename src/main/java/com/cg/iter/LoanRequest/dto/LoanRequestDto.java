package com.cg.iter.LoanRequest.dto;

import org.springframework.stereotype.Component;

@Component
public class LoanRequestDto {
	private String accountId;
	private double amount;
	private String type;
	private int tenure;
	private double roi;
	private String loanStatus;
	private double emi;
	private int creditScore;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public LoanRequestDto(String accountId, double amount, String type, int tenure, double roi,
			String loanStatus, double emi, int creditScore) {
		super();
		this.accountId = accountId;
		this.amount = amount;
		this.type = type;
		this.tenure = tenure;
		this.roi = roi;
		this.loanStatus = loanStatus;
		this.emi = emi;
		this.creditScore = creditScore;

	}

	public LoanRequestDto() {

	}

	@Override
	public String toString() {
		return "LoanRequestDto [accountId=" + accountId + ", amount=" + amount + ", type=" + type + ", tenure=" + tenure
				+ ", roi=" + roi + ", loanStatus=" + loanStatus + ", emi=" + emi + ", creditScore=" + creditScore + "]";
	}

//	public String toString() {
//		sb.append("------------------------Printing Loan Details---------------------------- \n");
//		sb.append("Account Id: " + accountId + "\n");
//		sb.append("Amount: " + amount + "\n");
//		sb.append("Type : " + type + "\n");
//		sb.append("Tenure : " + tenure + "\n");
//		sb.append("Rate of Interest : " + roi + "\n");
//		sb.append("Loan Status: " + loanStatus + "\n");
//		sb.append("Emi : " + emi + "\n");
//		sb.append("Credit Score : " + creditScore + "\n");
//		return sb.toString();
//	}
	
}
