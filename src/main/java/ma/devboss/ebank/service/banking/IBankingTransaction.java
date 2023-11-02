package ma.devboss.ebank.service.banking;

import ma.devboss.ebank.model.account.MainBankAccount;

public interface IBankingTransaction {
    boolean startTransaction(MainBankAccount account);
    boolean processTransaction(MainBankAccount account);
    //boolean killTransaction();
    boolean compliteTransaction(MainBankAccount account);
}
