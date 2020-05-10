package com.church.demo.system;

import com.church.demo.db.ApiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class adminclass {
    @Autowired
    private ApiDao apiDao;

    @RequestMapping(value="/admin")
    public String adminlogin(){
        return "adminpage/adminlogin";
    }

    @RequestMapping(value = "/adminloginsuc", method = RequestMethod.POST)
    public String goStudent(HttpServletRequest httpServletRequest, Model model) {
        String id = httpServletRequest.getParameter("id");
        String password = httpServletRequest.getParameter("password");
        if(apiDao.validate_teacher(id,password)==null){
            return "error";
        }
        //System.out.println(apiDao.validate_teacher());

        //model.addAttribute("email", id);
        model.addAttribute("name",apiDao.selectName());

        return "adminpage/adminloginsuc";
    }
    @RequestMapping(value = "/adminloginsuc",method=RequestMethod.GET)
    public String goStudent2(Model model){
        model.addAttribute("name",apiDao.selectName());

        return "adminpage/adminloginsuc";
    }
}
