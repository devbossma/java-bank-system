package ma.devboss.ebank.db;

import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.account.MainBankAccount;
import ma.devboss.ebank.model.account.PersonalAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDataProvider implements IDbProvider{
    private List<IDataModel> bankAccounts = new ArrayList<>();

    public BankAccountDataProvider() {

        bankAccounts.add(new PersonalAccount());
        bankAccounts.add(new PersonalAccount());
        bankAccounts.add(new PersonalAccount());
        bankAccounts.add(new PersonalAccount());

    }


    @Override
    public List<IDataModel> provideData() {

        return bankAccounts;
    }
}
