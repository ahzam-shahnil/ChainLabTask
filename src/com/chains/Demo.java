package com.chains;

public class Demo {
  public static void main(String[] args) {
      BankEmployee clerk = new BankEmployee("Clerk",10000);
      BankEmployee assistantManager = new BankEmployee("Assistant Manager",25000);
      BankEmployee manager = new BankEmployee("Manager",100000);
      clerk.setNext(assistantManager);
      assistantManager.setNext(manager);
      Loan loan = new Loan("5", 3000,"house repair");
      clerk.process(loan);
      assistantManager.process(loan);
       loan = new Loan("9", 30000,"car damage");
      manager.process(loan);
      clerk.process(loan);

  }
}
