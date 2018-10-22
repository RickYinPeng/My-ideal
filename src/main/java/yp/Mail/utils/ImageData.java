package yp.Mail.utils;

/**
 * @author RickYinPeng
 * @ClassName ImageData
 * @Description
 * @date 2018/10/21/15:54
 */
public class ImageData {
    private String src;

    private String title;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ImageData{" +
                "src='" + src + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
