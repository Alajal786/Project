package com.sutherland.loanservice.service;

public class LoanServiceImpl {
	
	package com.sutherland.loan.service;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.sutherland.loan.entity.Loan;
	import com.sutherland.loan.repo.LoanRepo;

	@Service
	public class LoanServiceImpl implements LoanService {

	    @Autowired
	    private LoanRepo loanRepo;

	    @Override
	    public void addLoanDetails(Loan loan) {
	        loanRepo.save(loan);
	    }

	    @Override
	    public List<Loan> getAllLoans() {
	        return loanRepo.findAll();
	    }

	    @Override
	    public Loan getLoanById(Long loanId) {
	        Optional<Loan> loan = loanRepo.findById(loanId);
	        return loan.orElse(null); // or throw an exception if preferred
	    }

	    @Override
	    public List<Loan> getLoansByPancard(String pancard) {
	        return loanRepo.findByPancard(pancard);
	    }
	}

}
