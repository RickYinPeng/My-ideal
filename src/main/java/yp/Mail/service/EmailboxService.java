package yp.Mail.service;

import yp.Mail.pojo.Emailbox;

public interface EmailboxService {

    /**
     * 发送邮件
     * @param emailbox
     */
    public void saveEmail(Emailbox emailbox);

}
