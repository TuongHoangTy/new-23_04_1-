package Motel_new.Service;

import Motel_new.Entity.QAccount;
import Motel_new.Filter.QueryPredicate;
import Motel_new.Response.ResponseAccount;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import javax.persistence.EntityManager;

public class AccountServiceImpl implements AccountService {

    @Autowired
    private EntityManager em;


    @Override
    public Page<ResponseAccount> getAccounts(QueryPredicate predicate) {
        JPAQuery<ResponseAccount> query=  userQuery();
        return predicate.fetch(query);
    }

    @Override
    public ResponseAccount getAccout(long id) {
        return null;
    }


    private JPAQuery<ResponseAccount> userQuery() {
        QAccount account = QAccount.account;

        QBean<ResponseAccount> userRes = Projections.bean(
                ResponseAccount.class,
                account.id,
                account.fistname,
                account.lastname,
                account.phoneNumber,
                account.email
        );

        return new JPAQuery<>(em)
                .select(userRes)
                .from(account);
    }

}
