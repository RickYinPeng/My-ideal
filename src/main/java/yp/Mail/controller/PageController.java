package yp.Mail.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import yp.Mail.mapper.EmailboxMapper;
import yp.Mail.pojo.Emailbox;
import yp.Mail.service.EmailboxService;
import yp.Mail.utils.ImageData;
import yp.Mail.utils.imageResult;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
/**
 * @author RickYinPeng
 * @ClassName TestController
 * @Description
 * @date 2018/10/19/22:32
 */
@Controller
public class PageController {

    @Autowired
    private EmailboxService emailboxService;


    @RequestMapping("/{page}")
    public String index(@PathVariable String page) {

        return page;
    }

    @RequestMapping("/email/send")
    public String sendEmail(Model model, Integer flag, Emailbox emailbox, HttpServletRequest request) {
        System.out.println("flag:"+flag);
        //获取当前用户
        String user = (String) request.getSession(false).getAttribute("user");
        System.out.println("发件人姓名:"+user);
        //邮件ID自增长
        //emailid

        //获取发件人姓名
        //sender
        emailbox.setSender(user);

        //获取发件人邮箱地址
        //sendercode
        emailbox.setSendercode(user.concat("@rickyinpeng"));

        //获取收件人姓名
        //receiver
        String receivercode = emailbox.getReceivercode();
        System.out.println(receivercode);
        int index = receivercode.indexOf("@");
        String receiver = receivercode.substring(0, index);
        emailbox.setReceiver(receiver);

        //收件人邮箱地址---------receivercode
        //主题--------------title
        //正文--------------content
        //附件--------------enclosure

        /*//附件
        //enclosure
        emailbox.setEnclosure("");*/

        //发送类型 0：普通 1:急件
        //sendtype
        emailbox.setSendtype(0);

        //发送日期
        //senddate
        emailbox.setSenddate(new Date());

        //读取时间
        //readdate

        //邮箱类型 0：草稿箱 1：收件箱 2：发件箱 3：垃圾箱
        //boxtype
        if(flag==1) {
            emailbox.setBoxtype(2);
            model.addAttribute("msg","发送成功!!!!");
        }else if(flag==3){
            emailbox.setBoxtype(0);
            model.addAttribute("msg","已存入草稿箱");
        }
        //邮件类型 0：未读 1：已读 2：回复 3：转发 4：全部转发
        //emailstatus
        emailbox.setEmailstatus(0);

        System.out.println(emailbox);

        emailboxService.saveEmail(emailbox);

        System.out.println("新发送的邮件的id:"+emailbox.getEmailid());

        return "return_index";
    }

    @ResponseBody
    @RequestMapping("/uploadimage")
    public imageResult uploadImage(@RequestParam("file") MultipartFile pictureFile) throws IOException {
        String name = UUID.randomUUID().toString().replaceAll("-", "");

        //后缀名截取（这个工具帮我们做了）
        String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());

        pictureFile.transferTo(new File("G:\\upload\\" + name + "." + ext));

        imageResult imageResult = new imageResult();
        imageResult.setCode(0);
        ImageData data = new ImageData();
        data.setSrc("/pic/" + name + "." + ext + "");
        data.setTitle("上传的图片");
        System.out.println(data.getSrc());
        imageResult.setData(data);
        return imageResult;
    }

    @RequestMapping("/email/maxSend")
    public String maxSendEmail(Model model, Integer flag, Emailbox emailbox, HttpServletRequest request) {
        System.out.println("flag:"+flag);
        //获取当前用户
        String user = (String) request.getSession(false).getAttribute("user");
        System.out.println("发件人姓名:"+user);
        //邮件ID自增长
        //emailid

        //获取发件人姓名
        //sender
        emailbox.setSender(user);

        //获取发件人邮箱地址
        //sendercode
        emailbox.setSendercode(user.concat("@rickyinpeng"));

        //获取收件人姓名
        //receiver
        /*String receivercode = emailbox.getReceivercode();
        System.out.println(receivercode);
        int index = receivercode.indexOf("@");
        String receiver = receivercode.substring(0, index);
        emailbox.setReceiver(receiver);*/

        //收件人邮箱地址---------receivercode
        //主题--------------title
        //正文--------------content
        //附件--------------enclosure

        /*//附件
        //enclosure
        emailbox.setEnclosure("");*/

        //发送类型 0：普通 1:急件
        //sendtype
        emailbox.setSendtype(1);

        //发送日期
        //senddate
        emailbox.setSenddate(new Date());

        //读取时间
        //readdate

        //邮箱类型 0：草稿箱 1：收件箱 2：发件箱 3：垃圾箱
        //boxtype
        if(flag==1) {
            emailbox.setBoxtype(2);
            model.addAttribute("msg","发送成功!!!!");
        }else if(flag==3){
            emailbox.setBoxtype(0);
            model.addAttribute("msg","已存入草稿箱");
        }
        //邮件类型 0：未读 1：已读 2：回复 3：转发 4：全部转发
        //emailstatus
        emailbox.setEmailstatus(0);

        System.out.println(emailbox);

        emailboxService.saveEmail(emailbox);

        System.out.println("新发送的邮件的id:"+emailbox.getEmailid());

        return "return_index";
    }

}
