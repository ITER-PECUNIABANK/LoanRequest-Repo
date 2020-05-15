package com.cg.iter.LoanRequest.service;

import java.util.Optional; 

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.iter.LoanRequest.entity.LoanRequest;
import com.cg.iter.LoanRequest.exception.AccountNotFoundException;
import com.cg.iter.LoanRequest.repository.LoanRequestRepository;

@Service
@Transactional
public class LoanRequestServiceImpl implements LoanRequestService {

	@Autowired
	LoanRequestRepository loanRequestRepository;

	@Override
	public LoanRequest findById(String accountId) {
		Optional<LoanRequest> optional=loanRequestRepository.findById(accountId);
        if(optional.isPresent()) {
            LoanRequest loanRequest=optional.get();
            return loanRequest;
        }
        throw new AccountNotFoundException("no such account exists");
    
	}

	@Override
	public LoanRequest save(LoanRequest loanRequest) {
		loanRequest=loanRequestRepository.save(loanRequest);
		return loanRequest;
	}

}
