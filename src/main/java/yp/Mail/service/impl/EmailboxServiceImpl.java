package yp.Mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yp.Mail.mapper.EmailAccountsMapper;
import yp.Mail.mapper.EmailboxMapper;
import yp.Mail.pojo.Emailbox;
import yp.Mail.service.EmailboxService;

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

    @Autowired
    private EmailAccountsMapper emailAccountsMapper;

    @Override
    public void saveEmail(Emailbox emailbox) {
        emailboxMapper.insert(emailbox);
    }
}
