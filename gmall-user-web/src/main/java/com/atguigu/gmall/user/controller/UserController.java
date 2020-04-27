package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
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

        System.out.println("保存了:"+insert);
    }

    @RequestMapping("updateUms")
    @ResponseBody
    public void updateUms(UmsMember umsMemberId){

        int updateUms = userService.updateUms(umsMemberId);

        System.out.println("更新:"+updateUms);
    }

    @RequestMapping("deleteUms")
    @ResponseBody
    public void deleteUms(UmsMember umsMemberId){

        int deleteUms = userService.deleteUms(umsMemberId);

        System.out.println("删除了:"+deleteUms);
    }

}
