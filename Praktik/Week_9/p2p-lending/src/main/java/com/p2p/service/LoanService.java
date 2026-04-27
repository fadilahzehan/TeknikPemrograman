
package com.p2p.service;

import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.math.BigDecimal;

public class LoanService {
    private static final Logger logger = LogManager.getLogger(LoanService.class);
    private static final int CREDIT_SCORE_THRESHOLD = 600;

    public Loan createLoan(Borrower borrower, BigDecimal amount) {
        logger.info("Memproses pengajuan loan untuk borrower verified={}, creditScore={}, amount={}",
                borrower.isVerified(), borrower.getCreditScore(), amount);
        validateBorrower(borrower);
        validateAmount(amount);
        Loan loan = new Loan();
        if (borrower.getCreditScore() >= CREDIT_SCORE_THRESHOLD) {
            loan.approve();
            logger.info("Loan APPROVED untuk borrower dengan creditScore={}", borrower.getCreditScore());
        } else {
            loan.reject();
            logger.warn("Loan REJECTED untuk borrower dengan creditScore={} (threshold={})",
                    borrower.getCreditScore(), CREDIT_SCORE_THRESHOLD);
        }
        logger.info("Status akhir loan: {}", loan.getStatus());
        return loan;
    }

    private void validateBorrower(Borrower borrower) {
        if (!borrower.canApplyLoan()) {
            logger.error("Pengajuan ditolak: borrower belum terverifikasi KYC");
            throw new IllegalArgumentException("Borrower not verified");
        }
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            logger.error("Jumlah pinjaman tidak valid: {}", amount);
            throw new IllegalArgumentException("Loan amount must be greater than zero");
        }
    }
}
