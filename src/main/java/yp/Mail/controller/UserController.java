package yp.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yp.Mail.pojo.EmailAccounts;
import yp.Mail.service.UserService;
import yp.Mail.utils.tableResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author RickYinPeng
 * @ClassName UserController
 * @Description 用户登录注册
 * @date 2018/12/9/22:29
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${MAILBOX_SUFFIX}")
    private String MAILBOX_SUFFIX;

    @RequestMapping("/User/login")
    public String login(EmailAccounts emailAccounts, HttpServletRequest request){
        if(emailAccounts==null || "".equals(emailAccounts.getMailUsername().trim()) || "".equals(emailAccounts.getMailPassword().trim())){
            return "";
        }
        emailAccounts.setMailUsername(emailAccounts.getMailUsername().concat(MAILBOX_SUFFIX));
        System.out.println(emailAccounts.getMailUsername());
        System.out.println(emailAccounts.getMailPassword());
        EmailAccounts user = userService.UserLogin(emailAccounts);
        if(user!=null){
            //登录成功
            System.out.println("登录成功！！！");
            HttpSession session = request.getSession();

            session.setAttribute("user",(user.getMailUsername().split("@"))[0]);

            return "/menu";
        }else{
            System.out.println("登录失败");
            return "error";
        }
    }

    @RequestMapping("/email/linkman")
    @ResponseBody
    public tableResult<EmailAccounts> listAccounts(HttpServletRequest request,Integer page, Integer limit){
        System.out.println("进入查看联系人列表");
        HttpSession session = request.getSession(false);
        String user = (String) session.getAttribute("user");
        System.out.println("user:"+user);
        tableResult<EmailAccounts> emailAccountstableResult = userService.listAccounts(page, limit, user);
        return emailAccountstableResult;
    }

    @RequestMapping("/send/email")
    public String sendMailToLinkMan(Model model,Integer userid){
        System.out.println("userid:"+userid);
        EmailAccounts accounts = userService.selectByUserid(userid);
        model.addAttribute("receivercode",accounts.getMailUsername());

        return "edit";
    }

    @RequestMapping("/email/regist")
    public String registAccount(Model model,EmailAccounts emailAccounts){
        emailAccounts.setMailUsername(emailAccounts.getMailUsername().concat("@rickyinpeng"));

        boolean flag= userService.registerEmailAccount(emailAccounts);

        if(flag){
            model.addAttribute("msg","\"注册成功！！！<a href='/index'>返回主页</a>\"");
        }else{
            model.addAttribute("msg","注册失败,改账号已存在！！！<a href='/index'>返回主页</a>");
        }

        return "msg";
    }


}
