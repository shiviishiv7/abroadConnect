package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.DepartmentDto;
import com.example.AdmissionAboard.model.Department;
import com.example.AdmissionAboard.repo.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(DepartmentDto department) {
        Department map = this.modelMapper.map(department, Department.class);
        return departmentRepository.save(map);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department updateDepartment(Long id, Department updatedDepartment) {
        Department department = departmentRepository.findById(id).orElse(null);
        if (department != null) {
            department.setName(updatedDepartment.getName());
            // Update other fields as needed
            return departmentRepository.save(department);
        }
        return null;
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}

