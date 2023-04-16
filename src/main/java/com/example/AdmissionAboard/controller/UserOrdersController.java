package com.example.AdmissionAboard.controller;

import com.example.AdmissionAboard.dto.UserOrdersDto;
import com.example.AdmissionAboard.model.UserOrders;
import com.example.AdmissionAboard.services.UserOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user-orders")
public class UserOrdersController {
    @Autowired
    private UserOrdersService userOrdersService;

    @PostMapping
    public UserOrders createUserOrders(@Valid @RequestBody UserOrdersDto userOrders) {
        return userOrdersService.createUserOrders(userOrders);
    }

    @GetMapping("/{id}")
    public UserOrders getUserOrdersById(@PathVariable Long id) {
        return userOrdersService.getUserOrdersById(id);
    }

    @GetMapping
    public List<UserOrders> getAllUserOrders() {
        return userOrdersService.getAllUserOrders();
    }

    @PutMapping("/{id}")
    public UserOrders updateUserOrders(@PathVariable Long id, @RequestBody UserOrders updatedUserOrders) {
        return userOrdersService.updateUserOrders(id, updatedUserOrders);
    }

    @DeleteMapping("/{id}")
    public void deleteUserOrders(@PathVariable Long id) {
        userOrdersService.deleteUserOrders(id);
    }
}

