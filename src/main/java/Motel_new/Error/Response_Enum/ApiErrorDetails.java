package Motel_new.Error.Response_Enum;

import Motel_new.Annotation.CustomResponse;
import Motel_new.Error.ApiErrorType;
import Motel_new.Error.ErrorMessage;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


@Getter
@Setter
@CustomResponse
public class ApiErrorDetails {
    private ApiErrorType errorType;

    private int errorCode;

    private String errorMessage;

    public ApiErrorDetails(ApiErrorType errorType, ErrorMessage errorMessage, String... args) {
        this.errorType = errorType;
        this.errorCode = errorType.code;
        this.errorMessage = errorMessage.desc + ", " + Arrays.toString(args);
    }


}
