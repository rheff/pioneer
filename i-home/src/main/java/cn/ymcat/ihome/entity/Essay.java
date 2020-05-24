package cn.ymcat.ihome.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 86152
 * @since 2020-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Essay extends Model<Essay> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 业务id
     */
    @TableField("serviceId")
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
    private Integer useId;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新时间
     */
    private LocalDateTime modifyDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
