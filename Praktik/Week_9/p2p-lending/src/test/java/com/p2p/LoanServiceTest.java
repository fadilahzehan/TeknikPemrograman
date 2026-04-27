package com.p2p;

import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;
import com.p2p.service.LoanService;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class LoanServiceTest {
    private final LoanService loanService = new LoanService();

    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {
        Borrower borrower = new Borrower(false, 700);
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> loanService.createLoan(borrower, BigDecimal.valueOf(1000)));
        assertEquals("Borrower not verified", ex.getMessage());
    }

    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {
        Borrower borrower = new Borrower(true, 700);
        Exception exZero = assertThrows(IllegalArgumentException.class,
                () -> loanService.createLoan(borrower, BigDecimal.ZERO));
        assertEquals("Loan amount must be greater than zero", exZero.getMessage());

        Exception exNeg = assertThrows(IllegalArgumentException.class,
                () -> loanService.createLoan(borrower, BigDecimal.valueOf(-500)));
        assertEquals("Loan amount must be greater than zero", exNeg.getMessage());
    }

    @Test
    void shouldApproveLoanWhenCreditScoreHigh() {
        Borrower borrower = new Borrower(true, 750);
        Loan loan = loanService.createLoan(borrower, BigDecimal.valueOf(1000));
        assertEquals(Loan.Status.APPROVED, loan.getStatus());
    }

    @Test
    void shouldRejectLoanWhenCreditScoreLow() {
        Borrower borrower = new Borrower(true, 500);
        Loan loan = loanService.createLoan(borrower, BigDecimal.valueOf(1000));
        assertEquals(Loan.Status.REJECTED, loan.getStatus());
    }
}
