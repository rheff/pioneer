package cn.ymcat.ihome.domain.requst.essay;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author 86152
 */
@Data
@ApiModel(value = "短文")
public class EssayRequest implements Serializable {

    public interface CreateGroup {

    }
    public interface UpdateGroup {

    }
    public interface ListGroup {

    }
    /**
     * 主键id
     */
    @ApiModelProperty(name = "id",value = "主键id",dataType = "String" )
    private String id;

    /**
     * 业务id
     */
    @ApiModelProperty(name = "serviceId",value = "业务id",dataType = "String")
    private String serviceId;

    /**
     * 标题
     */
    @NotBlank(message="标题不能为空",groups = {CreateGroup.class})
    @ApiModelProperty(name = "title",value = "标题",dataType = "String")
    private String title;

    /**
     * 简介
     */
    @NotBlank(message="简介不能为空",groups = {CreateGroup.class})
    @ApiModelProperty(name = "introduction",value = "简介",dataType = "String")
    private String introduction;

    /**
     * 正文
     */
    @NotBlank(message="正文不能为空",groups = {CreateGroup.class})
    @ApiModelProperty(name = "text",value = "正文",dataType = "String")
    private String text;

    /**
     * 用户id
     */
    @NotBlank(message="用户id不能为空",groups = {CreateGroup.class})
    @ApiModelProperty(name = "useId",value = "用户id",dataType = "String")
    private String useId;

    /**
     * 页码
     */
    @NotBlank(message="页码不能为空",groups = {ListGroup.class})
    @ApiModelProperty(name = "pageNum",value = "页码",dataType = "String")
    private String pageNum;

    /**
     * 每页数量
     */
    @NotBlank(message="每页数量不能为空",groups = {ListGroup.class})
    @ApiModelProperty(name = "pageSize",value = "每页数量",dataType = "String")
    private String pageSize;

}
