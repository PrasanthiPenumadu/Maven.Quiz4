package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    Double expectedHourlyWage = 0.0;
    Double expectedHoursWorked = 0.0;
    Double expectedBalance = 0.0;
    Double expectedBankAccountBalance = expectedBalance;
    Double expectedMoneyEarned = expectedHourlyWage * expectedHoursWorked;

    BankAccount bankAccount;
    Double val;
//    public void setBalance(Double val) {
//        this.val=val;
//    }


    public Employee() {
        this.expectedHourlyWage = 35.0;
       this.expectedHoursWorked = 0.0;
        this.expectedBalance = 0.0;
        this.expectedBankAccountBalance = 0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount=bankAccount;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount=bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
    expectedHoursWorked=expectedHoursWorked+numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return getHoursWorked()*getHourlyWage();
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
   // this.expectedBalance=this.expectedBalance+amountToIncreaseBy;
     this.val=this.val+amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.val=this.val-amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return this. val;
    }
}
