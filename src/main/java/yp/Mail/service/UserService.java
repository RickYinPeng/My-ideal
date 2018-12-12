package yp.Mail.service;

import yp.Mail.pojo.EmailAccounts;
import yp.Mail.utils.tableResult;

/**
 * 用户登录注册接口
 */
public interface UserService {

    /**
     * 用户登录
     * @param emailAccounts
     * @return
     */
    public EmailAccounts  UserLogin(EmailAccounts emailAccounts);

    /**
     * 联系人列表
     * @param page
     * @param limit
     * @param user
     * @return
     */
    public tableResult<EmailAccounts> listAccounts(Integer page,Integer limit,String user);

    /**
     * 根据id查询用户
     * @param userid
     * @return
     */
    public EmailAccounts selectByUserid(Integer userid);

    /**
     * 注册用户
     * @param emailAccounts
     * @return
     */
    public boolean registerEmailAccount(EmailAccounts emailAccounts);

}
