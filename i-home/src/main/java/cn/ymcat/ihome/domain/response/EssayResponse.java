package cn.ymcat.ihome.domain.response;

import lombok.Data;

import java.util.List;

/**
 * @author 86152
 */
@Data
public class EssayResponse extends ResponseBody {

    private EssayResponseBody record;

    private List<EssayResponseBody> records;

}
