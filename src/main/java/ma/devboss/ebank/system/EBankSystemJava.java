package ma.devboss.ebank.system;
import ma.devboss.ebank.db.BankAccountDataProvider;
import ma.devboss.ebank.db.ClientDataProvider;
import ma.devboss.ebank.db.IDataProvider;
import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.account.MainBankAccount;
import ma.devboss.ebank.model.client.personal.PersonalAccountOwner;

import java.util.List;


public class EBankSystemJava implements  IEBankSystem{
    public EBankSystemJava() {

    }

    public void run(){

        IDataProvider bankAccountsProvider = new BankAccountDataProvider();
        IDataProvider clientsProvider = new ClientDataProvider();

        List<IDataModel> accounts = bankAccountsProvider.provideData();
        List<IDataModel> clients = clientsProvider.provideData();

        for (int i = 0; i < accounts.size(); i++) {
            MainBankAccount account =(MainBankAccount) accounts.get(i);
            account.setAccountOwner((PersonalAccountOwner) clients.get(i));
            PersonalAccountOwner client = (PersonalAccountOwner) account.getAccountOwner();
            System.out.println(client.getId());


        }



    }

}
