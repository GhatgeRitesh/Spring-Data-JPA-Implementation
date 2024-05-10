package com.example.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDAO {
    /* spring data jpa has overriden every crud operation
    *  as inbuilt function we have to just call it in dao layers
    * */

    @Autowired
    private UserRepository userRepository;

    public void save(UserEntity userEntity)
    {
        userRepository.save(userEntity);
    }

    // traditional way to get the all users with iterator
    /*
    *public void getAll(UserEntity userEntity)
    {
         userRepository.findAll();
    } -- it returns the iterables
    * */

    public List<UserEntity> getAllUserEntities()
    {
     List<UserEntity> list= new ArrayList<UserEntity>();
     Streamable.of(userRepository.findAll())
        .forEach(list::add);
     return list;
    }
    public void delete(UserEntity userEntity)
    {
        userRepository.delete(userEntity);
    }
}
