package yp.Mail.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yp.Mail.mapper.EmailAccountsMapper;
import yp.Mail.mapper.EmailboxMapper;
import yp.Mail.pojo.Emailbox;
import yp.Mail.pojo.EmailboxExample;
import yp.Mail.service.EmailboxService;
import yp.Mail.utils.tableResult;

import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName EmailboxServiceImpl
 * @Description
 * @date 2018/10/21/11:52
 */
@Service
public class EmailboxServiceImpl implements EmailboxService{

    @Autowired
    private EmailboxMapper emailboxMapper;


    @Override
    public void saveEmail(Emailbox emailbox) {
        emailboxMapper.insert(emailbox);
    }

    @Override
    public tableResult<Emailbox> getReceiverEmailList(Integer flag,String user,Integer page, Integer limit) {
        //设置分页信息
        //page:页码
        //limit:每页显示数量
        PageHelper.startPage(page,limit);

        //执行查询
        EmailboxExample emailboxExample = new EmailboxExample();

        EmailboxExample.Criteria criteria = emailboxExample.createCriteria();
        if(flag==1) {
            criteria.andReceiverEqualTo(user);
            criteria.andBoxtypeEqualTo(2);
        }else if(flag==2){
            criteria.andSenderEqualTo(user);
            criteria.andBoxtypeEqualTo(2);
        }else if(flag==3){
            criteria.andSenderEqualTo(user);
            criteria.andBoxtypeEqualTo(0);
        }else if(flag==4){
            criteria.andSenderEqualTo(user);
            criteria.andBoxtypeEqualTo(3);
        }else {
            criteria.andSendtypeEqualTo(1);
        }
        List<Emailbox> emailboxes = emailboxMapper.selectByExample(emailboxExample);
        //创建一个返回值对象
        tableResult tableResult = new tableResult();
        tableResult.setData(emailboxes);
        tableResult.setCode(0);
        //取分页结果
        PageInfo pageInfo = new PageInfo(emailboxes);
        tableResult.setCount(pageInfo.getTotal());
        return tableResult;
    }

    @Override
    public Emailbox SeeMail(Integer emailid) {
        Emailbox emailbox = emailboxMapper.selectByPrimaryKey(emailid);
        return emailbox;
    }

    @Override
    public void deleteEmail(Integer emailid) {
        Emailbox emailbox = emailboxMapper.selectByPrimaryKey(emailid);
        emailbox.setBoxtype(3);
        emailboxMapper.updateByPrimaryKey(emailbox);
    }

}
