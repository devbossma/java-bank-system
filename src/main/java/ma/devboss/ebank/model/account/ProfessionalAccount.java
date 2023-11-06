package ma.devboss.ebank.model.account;

public class ProfessionalAccount extends MainBankAccount {

    @Override
    public String getId() {
        return this.getAccountOwner().getClientType().toString()+this.id;
    }
}
