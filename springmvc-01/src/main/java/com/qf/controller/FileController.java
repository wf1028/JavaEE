package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;
@Controller
@RequestMapping("file")
public class FileController {
    @RequestMapping(path = "uoFile",method = RequestMethod.POST)
    public String uoFile(MultipartFile photo)throws Exception{
        File file = new File("http://localhost:8081/uploadfile/images2/1.jpg");
        if(!file.exists()){
            file.mkdirs();
        }
        String filename = photo.getOriginalFilename();
        System.out.println(filename);
        String uuid = UUID.randomUUID().toString().replace("-", "");
        photo.transferTo(new File(file,uuid+filename));


        System.out.println("upDatio...");

        return "/success.jsp";
    }
}
