package Motel_new;

import Motel_new.Entity.Account;
import Motel_new.Enum.Gender;
import Motel_new.Enum.LoginStatus;
import Motel_new.Enum.RegisterStatus;
import Motel_new.Enum.UserRole;
import Motel_new.Repository.AccountRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements  ApplicationListener<ContextRefreshedEvent> {
    private  AccountRepository accountRepository;

    private BCryptPasswordEncoder passwordEncoder;


    public ApplicationStartup(AccountRepository accountRepository, BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.accountRepository = accountRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try{
            Account user= new Account();
            user.setEmail("tuonghoangty123@gmail.com");
            user.setPhoneNumber("84335898022");
            user.setFistname("Ty");
            user.setLastname("Tuong Hoang");
            user.setPassword(passwordEncoder.encode("9999"));
            user.setLoginStatus(LoginStatus.LOGIN);
            user.setRegisterStatus(RegisterStatus.COMPLETED);
            user.setUserRole(UserRole.ROLE_USER);
            user.setGender(Gender.MALE);
            accountRepository.saveAndFlush(user);

            //dummy account user
            Account admin = new Account();
            admin.setEmail("");
            admin.setPhoneNumber("");
            admin.setFistname("");
            admin.setLastname("");
            admin.setPassword(passwordEncoder.encode(""));
            admin.setLoginStatus(LoginStatus.LOGOUT);
            admin.setRegisterStatus(RegisterStatus.COMPLETED);
            admin.setUserRole(UserRole.ROLE_ADMIN);
            admin.setGender(Gender.MALE);
            accountRepository.saveAndFlush(admin);

        }catch (Exception e)
        {

        }

    }
}
