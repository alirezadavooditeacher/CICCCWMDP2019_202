package app.criteria;

import app.entity.Account;

import java.util.List;

public class AccountSuspended extends Criteria<Account>{
    @Override
    public boolean satisfied(Account el, List<Account> data) {
        return el.isSuspended();
    }
}
