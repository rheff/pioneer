package cn.ymcat.ihome.common.enums;

import lombok.Getter;

/**
 * @author 86152
 */

@Getter
public enum ResultCode {
    // 处理成功
    SUCCESS(1000, "操作成功"),
    // 响应失败
    FAILED(1001, "响应失败"),
    // 参数校验失败
    VALIDATE_FAILED(1002, "参数校验失败"),
    // 未知错误
    ERROR(5000, "未知错误");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
