package com.example.AdmissionAboard.controller;

import com.example.AdmissionAboard.dto.UserReviewDto;
import com.example.AdmissionAboard.model.UserReview;
import com.example.AdmissionAboard.services.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-reviews")
public class UserReviewController {
    @Autowired
    private UserReviewService userReviewService;

    @PostMapping
    public UserReview createUserReview(@RequestBody UserReviewDto userReview) {
        return userReviewService.createUserReview(userReview);
    }

    @GetMapping("/{id}")
    public UserReview getUserReviewById(@PathVariable Long id) {
        return userReviewService.getUserReviewById(id);
    }

    @GetMapping
    public List<UserReview> getAllUserReviews() {
        return userReviewService.getAllUserReviews();
    }

    @PutMapping("/{id}")
    public UserReview updateUserReview(@PathVariable Long id, @RequestBody UserReview updatedUserReview) {
        return userReviewService.updateUserReview(id, updatedUserReview);
    }

    @DeleteMapping("/{id}")
    public void deleteUserReview(@PathVariable Long id) {
        userReviewService.deleteUserReview(id);
    }
}

