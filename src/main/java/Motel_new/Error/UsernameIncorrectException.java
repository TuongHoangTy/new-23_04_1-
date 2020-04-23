package Motel_new.Error;

import javax.naming.AuthenticationException;

public class UsernameIncorrectException extends AuthenticationException {

    public UsernameIncorrectException(String msg) {
        super(msg);
    }
}
