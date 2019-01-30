package com.example.demo.services;

import com.example.demo.dto.User;
import com.example.demo.filter.UserFilter;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService extends ServiceBase<User, Long, UserFilter> {

    private UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User getUserById(long userId)
    {
        User user = userRepository.findOne(userId);
        return user;
    }

    public List<User> getAllUsers()
    {
        List <User> users = userRepository.findAll();
        return users;
    }
    @Override
    protected CrudRepository<User, Long> getRepository() {
        return userRepository;
    }
}
