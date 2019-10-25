package free.fgq.demo.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Package: free.fgq.demo.common
 * @ClassName: BaseCommonResult
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:21
 */
public class BaseCommonResult<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = -5857098803506028621L;
    public static final String SUCCESS_CODE = "10000";
    protected String responseCode = "10000";
    protected String responseMsg = "";
    protected List<T> resList;
    protected T resObject;

    public BaseCommonResult() {
    }

    public BaseCommonResult(Map<String, Object> map) {
        this.responseCode = (String)map.get("responseCode");
        this.responseMsg = (String)map.get("responseMsg");
    }

    public BaseCommonResult(String responseCode, String responseMsg) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return this.responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public void success(String msg) {
        this.responseCode = "10000";
        this.responseMsg = msg;
    }

    public void fail(String code, String msg) {
        this.responseCode = code;
        this.responseMsg = msg;
    }

    public boolean isSuccess() {
        return "10000".equals(this.responseCode);
    }

    public void copy(BaseCommonResult result) {
        this.responseCode = result.getResponseCode();
        this.responseMsg = result.getResponseMsg();
    }

    public List<T> getResList() {
        return this.resList;
    }

    public void setResList(List<T> resList) {
        this.resList = resList;
        if (resList == null) {
            this.resList = new ArrayList();
        }

    }

    public T getResObject() {
        return this.resObject;
    }

    public void setResObject(T resObject) {
        this.resObject = resObject;
        if (resObject == null) {
            this.resObject = (T)(new Object());
        }

    }

    @Override
    public String toString() {
        return "CommonResult : [ responseCode = " + this.responseCode + ", responseMsg = " + this.responseMsg + " ]";
    }
}

