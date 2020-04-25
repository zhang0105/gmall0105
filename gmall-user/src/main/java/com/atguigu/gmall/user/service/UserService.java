package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<UmsMember> getAllUser();

    /**
     * 根据id查询
     * @param memberId
     * @return
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    /**
     * 新增
     * @return
     */
    int insertUms();

    /**
     * 更新操作
     * @param id
     * @return
     */
    int updateUms(UmsMember id);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteUms(UmsMember id);
}
