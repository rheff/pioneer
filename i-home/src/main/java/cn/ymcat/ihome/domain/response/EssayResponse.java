package cn.ymcat.ihome.domain.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * @author 86152
 */
@Data
@ApiModel(value = "短文")
public class EssayResponse extends ResponseBody {

    private EssayResponseBody record;

    private List<EssayResponseBody> records;

}
