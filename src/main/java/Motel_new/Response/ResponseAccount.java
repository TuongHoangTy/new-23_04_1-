package Motel_new.Response;

import Motel_new.Annotation.CustomResponse;
import lombok.Data;

@Data
@CustomResponse

public class ResponseAccount {
    private Long id;
    private String firstNamel;
    private String lastName;
    private String phoneNumber;
    private String email;

}
