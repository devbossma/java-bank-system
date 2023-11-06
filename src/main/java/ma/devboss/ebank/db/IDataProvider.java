package ma.devboss.ebank.db;

import ma.devboss.ebank.model.IDataModel;

import java.util.List;


public interface IDataProvider {
    List<IDataModel> provideData();
}
