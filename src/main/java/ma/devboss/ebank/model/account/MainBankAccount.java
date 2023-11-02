package ma.devboss.ebank.model.account;


import ma.devboss.ebank.model.Enums.AccountStatus;
import ma.devboss.ebank.model.client.IClient;
import ma.devboss.ebank.model.client.personal.PersonalAccountOwner;

import java.util.UUID;

/*
* public: publicly accessed and modified.
* private: reached only by the class where they defined.
* protected: reached by the class where they have been  defined and their subclasses.
* */
public abstract class MainBankAccount {

    protected String id;
    private double balance;
    private String currency;
    private boolean active;
    private AccountStatus status;



    private IClient accountOwner;




    // constructor without params
    public MainBankAccount() {
        this.id = UUID.randomUUID().toString();
        this.status = AccountStatus.CREATED;
        this.currency = "MAD";
    }

    // constructor with params
    public MainBankAccount(double balance,
                           String currency,
                           boolean active,
                           IClient accountOwner
                       ) {
        this();
        this.balance = balance;
        this.currency = currency;
        this.active = active;
        this.accountOwner = accountOwner;
    }



    // start accessors
    public IClient getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(PersonalAccountOwner accountOwner) {
        this.accountOwner = accountOwner;
    }
    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active){

        this.active = active;
    }
    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    // end accessors. this way we implement the Encapsulation Principe.


    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", \n\tbalance=" + balance +
                ", \n\tcurrency='" + currency + '\'' +
                ", \n\tactive=" + active +
                ", \n\tstatus=" + status +
                ", \n\taccountOwner=" + accountOwner+
                '}';
    }
}
