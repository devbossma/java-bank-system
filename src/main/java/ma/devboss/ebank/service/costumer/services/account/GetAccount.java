package ma.devboss.ebank.service.costumer.services.account;

import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.account.MainBankAccount;
import ma.devboss.ebank.service.costumer.ICostumerService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetAccount implements ICostumerService {
    MainBankAccount acc = null;
    List<IDataModel> accounts;
    public GetAccount(List<IDataModel> accounts) {
        this.accounts = accounts;
    }

    public MainBankAccount find(String id){


        for (IDataModel c : this.accounts) {
            if (c.getId().equals(id)) {
                acc = (MainBankAccount) c;
                break;
            }
        }

        return acc;
    }


    @Override
    public void provideService() {

    }
}
