package ma.devboss.ebank.db;

import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.account.MainBankAccount;

import java.util.List;


public interface IDbProvider {
    List<IDataModel> provideData();
}
