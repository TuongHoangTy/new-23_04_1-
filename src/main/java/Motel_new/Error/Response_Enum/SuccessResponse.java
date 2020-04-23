package Motel_new.Error.Response_Enum;

import Motel_new.Annotation.CustomResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@CustomResponse
public class SuccessResponse<T> extends Response<T> {
    public SuccessResponse(T data) {
        this.setData(data);
        this.setStatus(ResponseStatus.SUCCESS);
    }
}

