package yp.Mail.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import yp.Mail.pojo.Emailbox;
import yp.Mail.service.EmailboxService;
import yp.Mail.utils.ImageData;
import yp.Mail.utils.imageResult;
import yp.Mail.utils.tableResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    public tableResult<Emailbox> receiverEmail(Integer page, Integer limit, @RequestParam(defaultValue = "0") Integer emailid) {
        System.out.println("进入receiverEmail方法！！！");
        tableResult<Emailbox> receiverEmailList = emailboxService.getReceiverEmailList(page, limit, emailid);
        return receiverEmailList;
    }

    @RequestMapping("/See/mail")
    public String SeeMail(Integer emailid, Model model) {

        //EmailStatus：修改邮件类型 0：未读 1：已读 2：回复 3：转发 4：全部转发

        //ReadDate：邮件读取日期更新

        Emailbox emailbox = emailboxService.SeeMail(emailid);

        //获取附件内容手动封装
        String enclosure = emailbox.getEnclosure();
        System.out.println("enclosure:"+enclosure);
        if(enclosure!=null) {
            String[] split = enclosure.split(",");
            List enclosureList = new ArrayList();
            for(int i = 0;i<split.length;i++){
                enclosureList.add(split[i]);
                System.out.println(split[i]);
            }

            model.addAttribute("enclosure", enclosureList);
        }
        model.addAttribute("emailbox", emailbox);
        return "SeeMail";
    }

    @ResponseBody
    @RequestMapping("/upload/File")
    public imageResult uploadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile File) throws IOException {

        String name = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println("name:"+name);
        System.out.println("File.getOriginalFilename():"+File.getOriginalFilename());
        String ext = FilenameUtils.getExtension(File.getOriginalFilename());
        File.transferTo(new File("G:\\upload_File\\" + name + "." + ext));

        imageResult Result = new imageResult();
        Result.setCode(0);
        ImageData data = new ImageData();
        data.setSrc(name + "." + ext);
        data.setTitle("上传的附件");
        System.out.println(data.getSrc());
        Result.setData(data);
        return Result;
    }

    @RequestMapping("/down/load")
    public void downloadFile(String fileName,
                             HttpServletRequest request, HttpServletResponse response){
        /*String fileName = "36267fd7c884474fb79c62c2d18955fd.png";*/

        if (fileName != null) {
/*            String realPath = request.getServletContext().getRealPath(
                    "WEB-INF/File/");*/
            String realPath = "G:\\upload_File";
            File file = new File(realPath, fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition",
                        "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @RequestMapping("/uplocal_File")
    public String uplocal_File(){
        System.out.println("进入uplocal_File方法");
        return "uplocal_File";
    }

}