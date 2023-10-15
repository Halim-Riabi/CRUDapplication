//package com.mycompany.user;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//    @Autowired private UserService repo;
//
//    public List<User> listAll(){
//        return (List<User>)repo.findAll();
//    }
//
//
//}

package com.mycompany.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository; // Replace UserRepository with your actual repository

    public List<User> listAll(){
        return (List<User>) userRepository.findAll();
    }
}

