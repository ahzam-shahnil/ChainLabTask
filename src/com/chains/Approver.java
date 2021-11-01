package com.chains;

public interface Approver {
	void setNext(Approver approver);

	void process(Loan loan);
}
