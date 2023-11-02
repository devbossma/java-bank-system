package ma.devboss.ebank.model.client.professional;

import ma.devboss.ebank.model.Enums.BankClient;
import ma.devboss.ebank.model.client.IClient;

import java.time.LocalDate;
import java.util.UUID;

public class ProfessionalAccountOwner implements IClient {
    private String ID;
    private BankClient clientType;

    /*
    * company proprieties goes here
    *
    * */

    public ProfessionalAccountOwner() {

        this.ID = UUID.randomUUID().toString();
        this.clientType = BankClient.PERSONAL;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public BankClient getClientType() {
        return clientType;
    }

    public void setClientType(BankClient clientType) {
        this.clientType = clientType;
    }
}
