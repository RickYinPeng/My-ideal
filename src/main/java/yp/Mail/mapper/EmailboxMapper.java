package yp.Mail.mapper;

import org.apache.ibatis.annotations.Param;
import yp.Mail.pojo.Emailbox;
import yp.Mail.pojo.EmailboxExample;

import java.util.List;

public interface EmailboxMapper {
    int countByExample(EmailboxExample example);

    int deleteByExample(EmailboxExample example);

    int deleteByPrimaryKey(Integer emailid);

    int insert(Emailbox record);

    int insertSelective(Emailbox record);

    List<Emailbox> selectByExample(EmailboxExample example);

    Emailbox selectByPrimaryKey(Integer emailid);

    int updateByExampleSelective(@Param("record") Emailbox record, @Param("example") EmailboxExample example);

    int updateByExample(@Param("record") Emailbox record, @Param("example") EmailboxExample example);

    int updateByPrimaryKeySelective(Emailbox record);

    int updateByPrimaryKey(Emailbox record);
}