package com.example.service;

import com.example.been.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PVer on 2017/4/18.
 */
@Service
public interface UserService {

    public List<User> getUser();
}
