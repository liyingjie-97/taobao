package cn.fs.taobao;

public class AjaxResult {

    //是否成功
    private Boolean success;
    //错误信息
    private String message;
    //返回的数据
    private Object object;

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}
