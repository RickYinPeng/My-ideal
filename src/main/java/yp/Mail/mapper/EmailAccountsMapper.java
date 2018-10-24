package yp.Mail.mapper;

import org.apache.ibatis.annotations.Param;
import yp.Mail.pojo.EmailAccounts;
import yp.Mail.pojo.EmailAccountsExample;

import java.util.List;

public interface EmailAccountsMapper {
    int countByExample(EmailAccountsExample example);

    int deleteByExample(EmailAccountsExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(EmailAccounts record);

    int insertSelective(EmailAccounts record);

    List<EmailAccounts> selectByExample(EmailAccountsExample example);

    EmailAccounts selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") EmailAccounts record, @Param("example") EmailAccountsExample example);

    int updateByExample(@Param("record") EmailAccounts record, @Param("example") EmailAccountsExample example);

    int updateByPrimaryKeySelective(EmailAccounts record);

    int updateByPrimaryKey(EmailAccounts record);
}