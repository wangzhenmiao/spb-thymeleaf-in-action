package com.wangzhen.spb.spbthymeleafinaction.repository;

import com.wangzhen.spb.spbthymeleafinaction.domain.User;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Description
 * @Author wangzhen
 * @Date 2018/10/28 下午4:31
 **/
public interface UserRepository {
    /**
     * 新增或者修改用户
     * @param user
     * @return
     */
    User saveOrUpateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     * @return
     */
    List<User> listUser();
}

