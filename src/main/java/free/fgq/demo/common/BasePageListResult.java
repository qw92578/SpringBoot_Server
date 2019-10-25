package free.fgq.demo.common;

import java.io.Serializable;

/**
 * @Package: free.fgq.demo.common
 * @ClassName: BasePageListResult
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:19
 */
public class BasePageListResult<T extends Serializable> extends BaseCommonResult {
    private static final long serialVersionUID = 6384557499208487820L;
    BaseCommonPage<T> page;

    public BasePageListResult(BaseCommonPage<T> page) {
        this.page = page;
    }

    public BasePageListResult() {
    }

    public BaseCommonPage<T> getPage() {
        return this.page;
    }

    public void setPage(BaseCommonPage<T> page) {
        this.page = page;
    }
}
