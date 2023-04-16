package com.example.AdmissionAboard.controller;

import com.example.AdmissionAboard.dto.BranchDto;
import com.example.AdmissionAboard.model.Branch;
import com.example.AdmissionAboard.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchController {
    @Autowired
    private BranchService branchService;

    @PostMapping
    public Branch createBranch(@Valid @RequestBody BranchDto branch) {
        return branchService.createBranch(branch);
    }

    @GetMapping("/{id}")
    public Branch getBranchById(@PathVariable Long id) {
        return branchService.getBranchById(id);
    }

    @GetMapping
    public List<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }

    @PutMapping("/{id}")
    public Branch updateBranch(@PathVariable Long id,@Valid @RequestBody Branch updatedBranch) {
        return branchService.updateBranch(id, updatedBranch);
    }

    @DeleteMapping("/{id}")
    public void deleteBranch(@PathVariable Long id) {
        branchService.deleteBranch(id);
    }
}
