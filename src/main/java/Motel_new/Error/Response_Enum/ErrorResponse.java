package Motel_new.Error.Response_Enum;

import Motel_new.Annotation.CustomResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@CustomResponse
public class ErrorResponse<T> extends Response<T> {
    public ErrorResponse(T data) {
        this.setStatus(ResponseStatus.FAILED);
        this.setData(data);
    }
}
