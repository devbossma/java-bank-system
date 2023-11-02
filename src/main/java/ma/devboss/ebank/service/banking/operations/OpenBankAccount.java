package ma.devboss.ebank.service.banking.operations;

import ma.devboss.ebank.model.account.MainBankAccount;
import ma.devboss.ebank.model.account.PersonalAccount;
import ma.devboss.ebank.model.client.IClient;
import ma.devboss.ebank.model.client.personal.PersonalAccountOwner;
import ma.devboss.ebank.service.banking.IBankingOperation;

public class OpenBankAccount implements IBankingOperation {

    public OpenBankAccount() {

    }

    private MainBankAccount openBankAccount(IClient accountOwner){

        return new PersonalAccount();
    }
    @Override
    public boolean processOperation() {

        return false;
    }

}
