package com.mytest.provider;

import com.mytest.sharedlib.DemoService;
import com.mytest.sharedlib.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 329757 on 2017/11/12.
 */
@Service
public class DemoServiceImpl implements DemoService {
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setName("name is u1");
        u1.setAge(10);
        users.add(u1);
        User u2 = new User();
        u2.setName("name is u2");
        u2.setAge(20);
        users.add(u2);
        return users;
    }
}

