package com.sutherland.loanservice.repo;
	import com.sutherland.loanservice.entity.LoanService;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface LoanServiceRepo extends JpaRepository<LoanService, Integer> {
	    // You can add custom query methods here if needed
	}

