package com.cg.iter.LoanRequest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.LoanRequest.dto.LoanRequestDto;
import com.cg.iter.LoanRequest.entity.LoanRequest;
import com.cg.iter.LoanRequest.service.LoanRequestService;

@RestController
@RequestMapping("/Loanrequest")
public class LoanRequestController {

	@Autowired
	LoanRequestService loanRequestService;
	
	  @PostMapping("/add")
	    public ResponseEntity<LoanRequestDto> add(@RequestBody LoanRequestDto requestDto) {
	        LoanRequest loanRequest = new LoanRequest();
	        loanRequest.setAccountId(requestDto.getAccountId());
	        loanRequest.setAmount(requestDto.getAmount());
	        loanRequest.setTenure(requestDto.getTenure());
	        loanRequest.setLoantype(requestDto.getType());
	        loanRequest.setCreditScore(requestDto.getCreditScore());
	        
	        
	        loanRequest = loanRequestService.save(loanRequest);
	        LoanRequestDto dto = convertToDetailsDto(loanRequest);
	        ResponseEntity<LoanRequestDto> response = new ResponseEntity<>(dto, HttpStatus.OK);
	        return response;
	    }
	    
	    
	    @GetMapping("/get/{id}")
	    public ResponseEntity<LoanRequestDto> add(@PathVariable("id") String id) {
	        LoanRequest loanRequest = loanRequestService.findById(id);
	        LoanRequestDto dto = convertToDetailsDto(loanRequest);
	        ResponseEntity<LoanRequestDto> response = new ResponseEntity<>(dto, HttpStatus.OK);
	        return response;
	    }
	    
	    
	    LoanRequestDto convertToDetailsDto(LoanRequest loanRequest) {
	    	LoanRequestDto dto = new LoanRequestDto();
	        dto.setAccountId(loanRequest.getAccountId());
	        dto.setAmount(loanRequest.getAmount());
	        dto.setType(loanRequest.getLoantype());
	        dto.setTenure(loanRequest.getTenure());
	        return dto;
	    }
}
