package com.lianxi.Test01;

import com.lianxi.entity.User01;
import com.lianxi.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class TestUser {
    @Autowired
    UserRepository userRepository;
    @Test
    public void  findUser(Integer id){
//        Optional<User01> byId = userRepository.findById(id);
//        System.out.println(byId);
        User01 user01 = new User01();
    }
}
