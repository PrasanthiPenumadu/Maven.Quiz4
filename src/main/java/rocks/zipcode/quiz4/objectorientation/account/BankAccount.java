package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double val;
    public void setBalance(Double val) {
        this.val=val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy>0)
    this.val=this.val+amountToIncreaseBy;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(this.val<amountToDecreaseBy||amountToDecreaseBy<0)
            throw new IllegalArgumentException();
        else
    this.val=this.val-amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return this.val;
    }
}
