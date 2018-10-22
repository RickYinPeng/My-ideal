package yp.Mail.pojo;

import java.util.Date;

public class Emailbox {
    //邮件编号
    private String emailid;

    //发送人
    private String sender;

    //发送人编号
    private String sendercode;

    //收信人
    private String receiver;

    //收信人编号
    private String receivercode;

    //主题
    private String title;

    //内容
    private String content;

    //附件
    private String enclosure;

    //发送类型 0：普通 1:急件
    private Integer sendtype;

    //发送日期
    private Date senddate;

    //读取时间
    private Date readdate;

    //邮箱类型 0：草稿箱 1：收件箱 2：发件箱 3：垃圾箱
    private Integer boxtype;

    //邮件类型 0：未读 1：已读 2：回复 3：转发 4：全部转发
    private Integer emailstatus;

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid == null ? null : emailid.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getSendercode() {
        return sendercode;
    }

    public void setSendercode(String sendercode) {
        this.sendercode = sendercode == null ? null : sendercode.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getReceivercode() {
        return receivercode;
    }

    public void setReceivercode(String receivercode) {
        this.receivercode = receivercode == null ? null : receivercode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public Integer getSendtype() {
        return sendtype;
    }

    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Date getReaddate() {
        return readdate;
    }

    public void setReaddate(Date readdate) {
        this.readdate = readdate;
    }

    public Integer getBoxtype() {
        return boxtype;
    }

    public void setBoxtype(Integer boxtype) {
        this.boxtype = boxtype;
    }

    public Integer getEmailstatus() {
        return emailstatus;
    }

    public void setEmailstatus(Integer emailstatus) {
        this.emailstatus = emailstatus;
    }

    @Override
    public String toString() {
        return "Emailbox{" +
                "emailid='" + emailid + '\'' +
                ", sender='" + sender + '\'' +
                ", sendercode='" + sendercode + '\'' +
                ", receiver='" + receiver + '\'' +
                ", receivercode='" + receivercode + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", sendtype=" + sendtype +
                ", senddate=" + senddate +
                ", readdate=" + readdate +
                ", boxtype=" + boxtype +
                ", emailstatus=" + emailstatus +
                '}';
    }
}