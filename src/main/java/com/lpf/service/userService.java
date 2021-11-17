package com.lpf.service;

import com.lpf.dao.userDao;
import com.lpf.dto.userDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private userDao userDao;

    public userDto getUserInfo(int id) {
        return userDao.getUserInfo(id);
    }
}
