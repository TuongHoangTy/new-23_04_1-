package Motel_new.Security;

import Motel_new.Request.RequestCustomer;
import lombok.SneakyThrows;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private JWTProvider jwtProvider;

    private String TOKEN_PREFIX;

    private AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager, JWTProvider jwtProvider,String TOKEN_PREFIX )
    {
        this.authenticationManager= authenticationManager;
        this.jwtProvider= jwtProvider;
        this.TOKEN_PREFIX=TOKEN_PREFIX;

    }

    @SneakyThrows
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
    {
        RequestCustomer payload= (new  Ob)
    }
}
