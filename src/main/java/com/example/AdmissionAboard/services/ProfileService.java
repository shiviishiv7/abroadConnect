package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.ProfileDto;
import com.example.AdmissionAboard.model.Profile;
import com.example.AdmissionAboard.repo.ProfileRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProfileRepository profileRepository;

    public Profile createProfile(ProfileDto profile)
    {
        Profile map = this.modelMapper.map(profile, Profile.class);
        return profileRepository.save(map);
    }

    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Profile updateProfile(Long id, Profile updatedProfile) {
        Profile profile = profileRepository.findById(id).orElse(null);
        if (profile != null) {
            profile.setFirstName(updatedProfile.getFirstName());
            profile.setLastName(updatedProfile.getLastName());
            // Update other fields as needed
            return profileRepository.save(profile);
        }
        return null;
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}

