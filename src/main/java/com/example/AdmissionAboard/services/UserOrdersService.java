package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.UserOrdersDto;
import com.example.AdmissionAboard.model.UserOrders;
import com.example.AdmissionAboard.repo.UserOrdersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOrdersService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserOrdersRepository userOrdersRepository;

    public UserOrders createUserOrders(UserOrdersDto userOrders) {
        UserOrders map = this.modelMapper.map(userOrders, UserOrders.class);
        return userOrdersRepository.save(map);
    }

    public UserOrders getUserOrdersById(Long id) {
        return userOrdersRepository.findById(id).orElse(null);
    }

    public List<UserOrders> getAllUserOrders() {
        return userOrdersRepository.findAll();
    }

    public UserOrders updateUserOrders(Long id, UserOrders updatedUserOrders) {
        UserOrders userOrders = userOrdersRepository.findById(id).orElse(null);
        if (userOrders != null) {
//            userOrders.setProductName(updatedUserOrders.getProductName());
//            userOrders.setPrice(updatedUserOrders.getPrice());
//            userOrders.setUser(updatedUserOrders.getUser());
//            // Update other fields as needed
            return userOrdersRepository.save(userOrders);
        }
        return null;
    }

    public void deleteUserOrders(Long id) {
        userOrdersRepository.deleteById(id);
    }
}

