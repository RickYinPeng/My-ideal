import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yp.Mail.mapper.EmailboxMapper;
import yp.Mail.pojo.Emailbox;
import yp.Mail.pojo.EmailboxExample;

import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName Test2
 * @Description
 * @date 2018/10/24/20:23
 */
public class Test2 {

    @Test
    public void testPageHelp() throws Exception{
        //初始化spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //从容器中获得Mapper代理对象
        EmailboxMapper emailboxMapper = applicationContext.getBean(EmailboxMapper.class);
        //执行sql语句之前设置分页信息使用PageHelper的startPage方法
        PageHelper.startPage(1,10);
        //执行查询
        EmailboxExample emailboxExample = new EmailboxExample();
        /*List<TbItem> tbItems = itemMapper.selectByExample(tbItemExample);*/
        List<Emailbox> emailboxList = emailboxMapper.selectByExample(emailboxExample);
        System.out.println("tbItems.size:"+emailboxList.size());
        //取分页信息，PageInfo。
        PageInfo<Emailbox> pageInfo = new PageInfo<Emailbox>(emailboxList);
       /* List pageInfo = new PageInfo<>(emailboxList);*/
        // 1.可以拿到总记录数
        System.out.println("总记录数:"+pageInfo.getTotal());
        // 2.总页数
        System.out.println("总页数:"+pageInfo.getPages());
        // 3.当前页显示数量
        System.out.println("当前页显示数量"+emailboxList.size());
        Emailbox emailbox = emailboxList.get(0);

        System.out.println(emailbox);

    }


    @Test
    public void split(){
        String en = "G:\\upload_File\\6d85c8a319fd428fbec5195020b1cf5a.png,G:\\upload_File\\6d85c8a319fd428fbec5195020b1cf5a.png,G:\\upload_File\\6d85c8a319fd428fbec5195020b1cf5a.png,";
        String[] split = en.split(",");

        System.out.println(split.length);

    }
}
