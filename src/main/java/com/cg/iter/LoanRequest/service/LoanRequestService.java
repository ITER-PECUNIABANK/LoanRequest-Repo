package com.cg.iter.LoanRequest.service;

import com.cg.iter.LoanRequest.entity.LoanRequest;

public interface LoanRequestService {
	
	LoanRequest findById(String accountId);
	LoanRequest save(LoanRequest loanRequest);

}
