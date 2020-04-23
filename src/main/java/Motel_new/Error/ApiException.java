package Motel_new.Error;

import Motel_new.Error.Response_Enum.ApiErrorDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiException extends  RuntimeException {
    //private  ApiException apiException; // ?

    private ApiErrorDetails apiErrorDetails;

    public ApiException(ApiErrorType errorType, ErrorMessage errorMessage , String... args) {
        super(errorMessage.name());
        this.apiErrorDetails = new ApiErrorDetails(errorType,errorMessage,args);
    }

}
