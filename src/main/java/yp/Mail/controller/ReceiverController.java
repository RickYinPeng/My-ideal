package yp.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yp.Mail.mapper.EmailboxMapper;
import yp.Mail.pojo.Emailbox;
import yp.Mail.service.EmailboxService;
import yp.Mail.utils.tableResult;

/**
 * @author RickYinPeng
 * @ClassName ReceiverController
 * @Description
 * @date 2018/10/24/13:42
 */
@Controller
public class ReceiverController {

    @Autowired
    private EmailboxService emailboxService;


    @ResponseBody
    @RequestMapping("/test/table/demo1")
    public tableResult<Emailbox> receiverEmail(Integer page,Integer limit,@RequestParam(defaultValue = "0") Integer emailid){
        System.out.println("进入receiverEmail方法！！！");
        tableResult<Emailbox> receiverEmailList = emailboxService.getReceiverEmailList(page, limit,emailid);
        return receiverEmailList;
    }

    @RequestMapping("/See/mail")
    public String SeeMail(Integer emailid, Model model){
        Emailbox emailbox = emailboxService.SeeMail(emailid);
        model.addAttribute("emailbox",emailbox);
        return "SeeMail";
    }


}
