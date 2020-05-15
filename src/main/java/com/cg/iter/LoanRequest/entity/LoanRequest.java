package com.cg.iter.LoanRequest.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Loan_Reqest")
public class LoanRequest {

	@Id
	@NotNull
	@Column(length = 12)
	private String accountId;

	@NotNull
	@Size(min = 1000, max = 100000)
	private double amount;

	private String loantype;

	@NotNull
	@Size(min = 12, max = 240)
	private int tenure;

	@NotNull
	@Size(min = 4, max = 15)
	private double roi;

	private String loanStatus;
	private double emi;

	@NotNull
	@Size(min = 100, max = 999)
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

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		LoanRequest customer = (LoanRequest) obj;
		return accountId == customer.accountId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId);
	}

}
