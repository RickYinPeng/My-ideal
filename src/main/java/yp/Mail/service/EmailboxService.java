package yp.Mail.service;

import yp.Mail.pojo.Emailbox;
import yp.Mail.utils.tableResult;

public interface EmailboxService {

    /**
     * 发送邮件
     * @param emailbox
     */
    public void saveEmail(Emailbox emailbox);

    /**
     * 查询邮件信息,带有分页的
     * @param page 第几页
     * @param limit 每页显示多少
     * @return json
     */
    public tableResult<Emailbox> getReceiverEmailList(Integer flag,String user,Integer page,Integer limit);

    /**
     * 用户点击查看邮件按钮时触发的后台
     * @param emailid 邮件id
     * @return
     */
    public Emailbox SeeMail(Integer emailid);

    /**
     * 删除邮件
     * @param emailid
     */
    public void deleteEmail(Integer emailid);
}
