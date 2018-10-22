package yp.Mail.utils;

/**
 * @author RickYinPeng
 * @ClassName imageResult
 * @Description 图片上传返回值
 * @date 2018/10/21/15:15
 */
public class imageResult<String> {

    private int code;
    private String msg;
    private ImageData data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ImageData getData() {
        return data;
    }

    public void setData(ImageData data) {
        this.data = data;
    }

    @Override
    public java.lang.String toString() {
        return "imageResult{" +
                "code=" + code +
                ", msg=" + msg +
                ", data=" + data +
                '}';
    }
}
