package cn.ymcat.ihome.domain.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Header implements Serializable {

    private String code = "0";

    private String desc = "成功";
}
