package cn.ymcat.ihome.domain.response;

import cn.ymcat.ihome.domain.response.ResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 86152
 */
@Data
public class EssayResponseBody extends ResponseBody {

    /**
     * 主键id
     */
    private String id;

    /**
     * 业务id
     */
    private String serviceId;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 正文
     */
    private String text;

    /**
     * 用户id
     */
    private String useId;
}
