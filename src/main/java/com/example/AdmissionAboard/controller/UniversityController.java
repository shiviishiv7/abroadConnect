package com.example.AdmissionAboard.controller;

import com.example.AdmissionAboard.dto.UniversityDto;
import com.example.AdmissionAboard.model.University;
import com.example.AdmissionAboard.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/universities")
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @PostMapping
    public University createUniversity(@Valid @RequestBody UniversityDto university) {
        return universityService.createUniversity(university);
    }

    @GetMapping("/{id}")
    public University getUniversityById(@PathVariable Long id) {
        return universityService.getUniversityById(id);
    }

    @GetMapping
    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    @PutMapping("/{id}")
    public University updateUniversity(@PathVariable Long id, @RequestBody University updatedUniversity) {
        return universityService.updateUniversity(id, updatedUniversity);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversity(@PathVariable Long id) {
        universityService.deleteUniversity(id);
    }
}

