package ma.devboss.ebank.service.banking.transactions;

import ma.devboss.ebank.model.account.MainBankAccount;
import ma.devboss.ebank.service.banking.IBankingTransaction;

public abstract class  WithdrowTransaction implements IBankingTransaction {
    @Override
    public boolean startTransaction(MainBankAccount account) {
        return false;
    }

    @Override
    public boolean processTransaction(MainBankAccount account) {
        return false;
    }

    @Override
    public boolean compliteTransaction(MainBankAccount account) {
        return false;
    }
}
