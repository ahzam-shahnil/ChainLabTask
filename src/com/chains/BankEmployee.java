package com.chains;

public class BankEmployee extends BaseApprover {
  String title;
  int approvalLimit;

  public BankEmployee(String title, int approvalLimit) {

    this.title = title;
    this.approvalLimit = approvalLimit;
  }

  @Override
  public void process(Loan loan) {
    if (title.equalsIgnoreCase("Clerk")) {
      System.out.println("Clerk forwards the loan " + loan.getNumber() + " for processing");
    } else if (title.equalsIgnoreCase("Assistant Manager")) {
      System.out.println(
          "Assistant Manager forwards the loan " + loan.getNumber() + " for Processing");
    } else if (title.equalsIgnoreCase("manager")) {

      System.out.println(loan.toString() + " is approved by " + title);
    }
  }
}
