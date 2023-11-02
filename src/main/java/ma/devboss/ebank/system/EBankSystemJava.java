package ma.devboss.ebank.system;
import ma.devboss.ebank.model.account.MainBankAccount;
import ma.devboss.ebank.model.account.PersonalAccount;
import ma.devboss.ebank.model.client.IClient;
import ma.devboss.ebank.model.client.personal.PersonalAccountOwner;

import java.time.LocalDate;


public class EBankSystemJava implements  IEBankSystem{
    public EBankSystemJava() {

    }

    public void run(){
        IClient owner_1 = new PersonalAccountOwner("Yassine", "Devboss", "", LocalDate.of(1994, 3, 5));
        MainBankAccount account_1 = new PersonalAccount(30_000.30, "MAD", false, owner_1);
        System.out.println("***********************");
        String info = account_1.toString();
        System.out.println(info);

    }

}
