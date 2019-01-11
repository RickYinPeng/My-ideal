package yp.Mail.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yp.Mail.mapper.EmailAccountsMapper;
import yp.Mail.pojo.EmailAccounts;
import yp.Mail.pojo.EmailAccountsExample;
import yp.Mail.service.UserService;
import yp.Mail.utils.tableResult;

import java.util.Arrays;
import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName UserServiceImpl
 * @Description
 * @date 2018/12/9/22:40
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private EmailAccountsMapper emailAccountsMapper;

    @Override
    public EmailAccounts UserLogin(EmailAccounts emailAccounts) {
        String mailUsername = emailAccounts.getMailUsername();
        String mailPassword = emailAccounts.getMailPassword();

        EmailAccountsExample emailAccountsExample = new EmailAccountsExample();
        EmailAccountsExample.Criteria criteria = emailAccountsExample.createCriteria();

        criteria.andMailUsernameEqualTo(mailUsername);
        criteria.andMailPasswordEqualTo(mailPassword);

        List<EmailAccounts> userList = emailAccountsMapper.selectByExample(emailAccountsExample);
        if(userList!=null && userList.size()>0){
            System.out.println(userList.get(0).toString());
            return userList.get(0);
        }
        return null;
    }

    @Override
    public tableResult<EmailAccounts> listAccounts(Integer page,Integer limit,String user) {

        EmailAccountsExample emailAccountsExample = new EmailAccountsExample();
        EmailAccountsExample.Criteria criteria1 = emailAccountsExample.createCriteria();
        criteria1.andMailUsernameEqualTo(user.concat("@rickyinpeng"));

        System.out.println(user.concat("@rickyinpeng"));

        List<EmailAccounts> emailAccounts = emailAccountsMapper.selectByExample(emailAccountsExample);
        System.out.println(emailAccounts.get(0));

        if(emailAccounts!=null && emailAccounts.size()>0){
            EmailAccounts email = emailAccounts.get(0);
            String linkman = email.getLinkman();
            System.out.println("linkman:"+linkman);
            //有联系人
            if(linkman!=null && !"".equals(linkman.trim())){
                String[] split = linkman.split(",");
                System.out.println(Arrays.toString(split));
                EmailAccountsExample emailAccountsExample2 = new EmailAccountsExample();

                for(int i = 0;i<split.length;i++){
                    System.out.println("设置条件");
                    EmailAccountsExample.Criteria criteria = emailAccountsExample2.createCriteria();
                    criteria.andUseridEqualTo(split[i]);
                    emailAccountsExample2.or(criteria);
                }

                //设置分页信息
                //page:页码
                //limit:每页显示数量
                PageHelper.startPage(page,limit);

                List<EmailAccounts> emailAccounts2 = emailAccountsMapper.selectByExample(emailAccountsExample2);
                System.out.println("emailAccounts2.size():"+emailAccounts2.size());
     

                //创建一个返回值对象
                tableResult tableResult = new tableResult();
                tableResult.setData(emailAccounts2);
                tableResult.setCode(0);
                //取分页结果
                PageInfo pageInfo = new PageInfo(emailAccounts2);
                tableResult.setCount(pageInfo.getTotal());
                return tableResult;
            }else{
                return null;
            }
        }
        return null;
    }

    @Override
    public EmailAccounts selectByUserid(Integer userid) {
        EmailAccounts emailAccounts = emailAccountsMapper.selectByPrimaryKey(userid);
        return emailAccounts;
    }

    @Override
    public boolean registerEmailAccount(EmailAccounts emailAccounts) {
        EmailAccountsExample emailAccountsExample = new EmailAccountsExample();
        EmailAccountsExample.Criteria criteria = emailAccountsExample.createCriteria();
        criteria.andMailUsernameEqualTo(emailAccounts.getMailUsername());

        List<EmailAccounts> accountsList = emailAccountsMapper.selectByExample(emailAccountsExample);
        if(accountsList==null || accountsList.size()==0){
            //可以注册
            emailAccountsMapper.insert(emailAccounts);
            return true;
        }
        return false;
    }
}
