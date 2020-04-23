package Motel_new.Filter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FilterParam {
    private List<Long> ids = new ArrayList<>();
}
