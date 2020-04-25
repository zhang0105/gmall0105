package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }


    @RequestMapping("insertUms")
    @ResponseBody
    public void insertUms(){
        int insert = userService.insertUms();
        System.out.println("保存："+insert);
    }


    @RequestMapping("updateUms")
    @ResponseBody
    public void updateUms(UmsMember id){
        int update = userService.updateUms(id);
        System.out.println("修改："+update);
    }

    @RequestMapping("deleteUms")
    @ResponseBody
    public void deleteUms(UmsMember id){
        int delete = userService.deleteUms(id);
        System.out.println("删除："+delete);
    }

}
