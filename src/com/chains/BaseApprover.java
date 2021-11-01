package com.chains;

public class BaseApprover implements Approver{
  Approver approver;

//  public BaseApprover() {
//    super();
//    approver=new BaseApprover();
//  }

  public void setNext(Approver approver) {
    this.approver=approver;
  }

  @Override
  public void process(Loan loan) {
    System.out.println("Loan: "+loan.getPurpose());
  }

}
