package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.UniversityDto;
import com.example.AdmissionAboard.model.University;
import com.example.AdmissionAboard.repo.UniversityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UniversityRepository universityRepository;

    public University createUniversity(UniversityDto university)
    {
        University map = this.modelMapper.map(university, University.class);
        return universityRepository.save(map);
    }

    public University getUniversityById(Long id) {
        return universityRepository.findById(id).orElse(null);
    }

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public University updateUniversity(Long id, University updatedUniversity) {
        University university = universityRepository.findById(id).orElse(null);
        if (university != null) {
            university.setName(updatedUniversity.getName());
           // university.setLocation(updatedUniversity.getLocation());
            // Update other fields as needed
            return universityRepository.save(university);
        }
        return null;
    }

    public void deleteUniversity(Long id) {
        universityRepository.deleteById(id);
    }
}

