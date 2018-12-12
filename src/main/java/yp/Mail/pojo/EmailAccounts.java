package yp.Mail.pojo;

public class EmailAccounts {
    private Integer userid;

    private String mailUsername;

    private String mailPassword;

    private String hasbeenSent;

    private String hasbeenAccepted;

    private String linkman;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    @Override
    public String toString() {
        return "EmailAccounts{" +
                "userid=" + userid +
                ", mailUsername='" + mailUsername + '\'' +
                ", mailPassword='" + mailPassword + '\'' +
                ", hasbeenSent='" + hasbeenSent + '\'' +
                ", hasbeenAccepted='" + hasbeenAccepted + '\'' +
                ", linkman='" + linkman + '\'' +
                '}';
    }
}