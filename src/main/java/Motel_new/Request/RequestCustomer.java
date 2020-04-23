package Motel_new.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RequestCustomer {
    @NotNull(message = "MISSING_ACCOUNT")
    @JsonProperty("ACCOUNT")
    private String name;

    @NotNull(message = "MISSING_PASSWORD")
    private String passWord;
}
