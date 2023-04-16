package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.UserDto;
import com.example.AdmissionAboard.model.User;
import com.example.AdmissionAboard.repo.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;

    public User findByUserName(String username) {
        return new User();
    }

    public User createUser(UserDto user)
    {
        User map = this.modelMapper.map(user, User.class);
        return userRepository.save(map);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User updatedUser) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
           // user.setFirstName(updatedUser.getFirstName());
          //  user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            // Update other fields as needed
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

