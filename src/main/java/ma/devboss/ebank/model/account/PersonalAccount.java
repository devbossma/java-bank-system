package ma.devboss.ebank.model.account;

import ma.devboss.ebank.model.client.IClient;
import ma.devboss.ebank.model.client.personal.PersonalAccountOwner;

public class PersonalAccount extends MainBankAccount{

    public PersonalAccount() {
        super();
    }
    public PersonalAccount(double v, String mad, boolean b, IClient owner1) {
        super(v,mad ,b,owner1 );
    }
}
