package yp.Mail.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Emailbox {
    private Integer emailid;

    private String sender;

    private String sendercode;

    private String receiver;

    private String receivercode;

    private String title;

    private String content;

    private String enclosure;

    private Integer sendtype;

    private Date senddate;

    private Date readdate;

    private Integer boxtype;

    private Integer emailstatus;

    public Integer getEmailid() {
        return emailid;
    }

    public void setEmailid(Integer emailid) {
        this.emailid = emailid;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
                "emailid=" + emailid +
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