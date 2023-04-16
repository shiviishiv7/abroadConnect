package com.example.AdmissionAboard.services;
import org.modelmapper.ModelMapper;
import com.example.AdmissionAboard.dto.BranchDto;
import com.example.AdmissionAboard.model.Branch;
import com.example.AdmissionAboard.repo.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Branch createBranch(BranchDto branch) {
        ModelMapper modelMapper;
        Branch map = this.modelMapper.map(branch, Branch.class);
        return branchRepository.save(map);
    }

    public Branch getBranchById(Long id) {
        return branchRepository.findById(id).orElse(null);
    }

    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    public Branch updateBranch(Long id, Branch updatedBranch) {
        Branch branch = branchRepository.findById(id).orElse(null);
        if (branch != null) {
            branch.setName(updatedBranch.getName());
            // Update other fields as needed
            return branchRepository.save(branch);
        }
        return null;
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }
}
