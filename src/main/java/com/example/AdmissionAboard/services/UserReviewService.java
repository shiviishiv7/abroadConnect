package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.UserReviewDto;
import com.example.AdmissionAboard.model.UserReview;
import com.example.AdmissionAboard.repo.UserReviewRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserReviewService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserReviewRepository userReviewRepository;

    public UserReview createUserReview(UserReviewDto userReview)
    {
        UserReview map = this.modelMapper.map(userReview, UserReview.class);
        return userReviewRepository.save(map);
    }

    public UserReview getUserReviewById(Long id) {
        return userReviewRepository.findById(id).orElse(null);
    }

    public List<UserReview> getAllUserReviews() {
        return userReviewRepository.findAll();
    }

    public UserReview updateUserReview(Long id, UserReview updatedUserReview) {
        UserReview userReview = userReviewRepository.findById(id).orElse(null);
        if (userReview != null) {
//            userReview.setComment(updatedUserReview.getComment());
//            userReview.setRating(updatedUserReview.getRating());
//            userReview.setUser(updatedUserReview.getUser());
            // Update other fields as needed
            return userReviewRepository.save(userReview);
        }
        return null;
    }

    public void deleteUserReview(Long id) {
        userReviewRepository.deleteById(id);
    }
}

