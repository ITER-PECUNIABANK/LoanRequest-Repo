package com.cg.iter.LoanRequest.repository;

import org.springframework.data.repository.CrudRepository; 

import com.cg.iter.LoanRequest.entity.LoanRequest;

public interface LoanRequestRepository extends CrudRepository<LoanRequest, String> {

}
