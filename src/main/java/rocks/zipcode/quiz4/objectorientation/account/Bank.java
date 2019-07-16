package rocks.zipcode.quiz4.objectorientation.account;

import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccounts;
    public Bank(){

    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        if(bankAccounts.contains(indexNumber))
            bankAccounts.remove(indexNumber);
        return (BankAccount) bankAccounts;
    }

    public void addBankAccount(BankAccount bankAccount) {
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
