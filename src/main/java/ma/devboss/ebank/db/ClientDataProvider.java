package ma.devboss.ebank.db;

import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.client.personal.PersonalAccountOwner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientDataProvider implements IDataProvider
{
    private List<IDataModel> clients = new ArrayList<>();

    public ClientDataProvider() {
        clients.add(new PersonalAccountOwner("Ahmed","rami","Rabi3", LocalDate.of(1988, 6, 3)));
        clients.add(new PersonalAccountOwner("Yassine","Jasmi","", LocalDate.of(1977, 12, 1)));
        clients.add(new PersonalAccountOwner("Sulayman","Yaakoub","", LocalDate.of(1978, 6, 3)));
        clients.add(new PersonalAccountOwner("Salma","Shikh","Nawar", LocalDate.of(1982, 6, 3)));
    }

    @Override
    public List<IDataModel> provideData() {
        return clients;
    }
}
