package cn.ymcat.ihome.domain.response;

import lombok.Data;

/**
 * @author 86152
 */
@Data
public class BaseResponse<T extends ResponseBody> {
    private T body;
    private Header header = new Header();

    public BaseResponse<T> buildBody(T body) {
        this.body =body;
        return this;
    }
}
