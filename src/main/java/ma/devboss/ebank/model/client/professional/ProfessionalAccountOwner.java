package ma.devboss.ebank.model.client.professional;

import ma.devboss.ebank.model.Enums.BankClient;
import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.client.IClient;

import java.util.UUID;

public class ProfessionalAccountOwner implements IClient, IDataModel {
    private String id;
    private BankClient clientType;

    /*
    * company proprieties goes here
    *
    * */

    public ProfessionalAccountOwner() {

        this.id = UUID.randomUUID().toString();
        this.clientType = BankClient.PERSONAL;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public BankClient getClientType() {
        return clientType;
    }

    public void setClientType(BankClient clientType) {
        this.clientType = clientType;
    }
}
