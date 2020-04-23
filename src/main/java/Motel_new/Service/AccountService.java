package Motel_new.Service;

import Motel_new.Filter.QueryPredicate;
import Motel_new.Response.ResponseAccount;
import org.springframework.data.domain.Page;

public interface AccountService {
    Page<ResponseAccount> getAccounts(QueryPredicate predicate);

    ResponseAccount getAccout(long id);


}
