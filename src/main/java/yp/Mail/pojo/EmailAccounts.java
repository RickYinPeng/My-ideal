package yp.Mail.pojo;

public class EmailAccounts {
    //用户ID
    private String userid;

    //用户名
    private String mailUsername;

    //密码
    private String mailPassword;

    //已发送
    private String hasbeenSent;

    //已接收
    private String hasbeenAccepted;

    //联系人列表
    private String linkman;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getMailUsername() {
        return mailUsername;
    }

    public void setMailUsername(String mailUsername) {
        this.mailUsername = mailUsername == null ? null : mailUsername.trim();
    }

    public String getMailPassword() {
        return mailPassword;
    }

    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword == null ? null : mailPassword.trim();
    }

    public String getHasbeenSent() {
        return hasbeenSent;
    }

    public void setHasbeenSent(String hasbeenSent) {
        this.hasbeenSent = hasbeenSent == null ? null : hasbeenSent.trim();
    }

    public String getHasbeenAccepted() {
        return hasbeenAccepted;
    }

    public void setHasbeenAccepted(String hasbeenAccepted) {
        this.hasbeenAccepted = hasbeenAccepted == null ? null : hasbeenAccepted.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }
}