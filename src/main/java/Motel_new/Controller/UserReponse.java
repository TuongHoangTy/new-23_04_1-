package Motel_new.Controller;

import Motel_new.Filter.UserQueryParam;
import Motel_new.Response.ResponseAccount;
import Motel_new.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserReponse {
    @Autowired
    private AccountService accountService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Page<ResponseAccount> getAccouts(UserQueryParam userQueryParam)
    {
        return accountService.getAccounts(userQueryParam());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseAccount getAccout(@PathVariable Long id)
    {
        return accountService.getAccout(id);
    }


}
