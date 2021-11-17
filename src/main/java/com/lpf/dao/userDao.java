package com.lpf.dao;

import com.lpf.dto.userDto;

public interface userDao {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    userDto getUserInfo(int id);
}
