package com.ifzer.busi.controller;

import com.alibaba.fastjson.JSON;
import com.xiaoleilu.hutool.util.CollectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nelson on 2017-09-06.
 */
@Controller
@RequestMapping("user/")
public class UserController {

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/list");
        List<User> userList = CollectionUtil.newArrayList();
        mv.addObject("userList", userList);
        userList.add(new User("ls", "sdf", "1"));
        userList.add(new User("ls1", "sdf", "1"));
        userList.add(new User("ls2", "sdf", "1"));
        userList.add(new User("ls3", "sdf", "1"));
        return mv;
    }

    public static class User{
        public User(String name, String mobile, String sex) {
            this.name = name;
            this.mobile = mobile;
            this.sex = sex;
        }

        String name;
        String mobile;
        String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }
}
