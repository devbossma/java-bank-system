package ma.devboss.ebank.model.client.personal;

import ma.devboss.ebank.model.Enums.BankClient;
import ma.devboss.ebank.model.IDataModel;
import ma.devboss.ebank.model.client.IClient;

import java.time.LocalDate;
import java.util.UUID;

public class PersonalAccountOwner implements IClient, IDataModel {
    private String id;
    private String firstName;
    private String lastName;
    private String midleName;
    private LocalDate dateOfBirth;
    private BankClient clientType;


    public PersonalAccountOwner() {

        this.id = UUID.randomUUID().toString();
        this.clientType = BankClient.PERSONAL;
    }

    public PersonalAccountOwner(String firstName,
                                String lastName,
                                String middleName,
                                LocalDate dateOfBirth) {
        this();

        this.firstName = firstName;
        this.lastName = lastName;
        this.midleName = (!middleName.isEmpty()) ? middleName : "";
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BankClient getClientType() {
        return clientType;
    }

    public void setClientType(BankClient clientType) {
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "\n\t\tAccountOwner{" +
                "\n\t\tID='" + id + '\'' +
                ", \n\t\tfirstName='" + firstName + '\'' +
                ", \n\t\tlastName='" + lastName + '\'' +
                ", \n\t\tmidleName='" + midleName + '\'' +
                ", \n\t\tdateOfBirth=" + dateOfBirth +
                '}';
    }
}
