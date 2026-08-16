package com.satyamCode.jobportal.services;

import com.satyamCode.jobportal.entity.RecruiterProfile;
import com.satyamCode.jobportal.repository.RecruiterProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RecruiterProfileService {
    private final RecruiterProfileRepository recruiterProfileRepository;
    @Autowired
    public RecruiterProfileService(RecruiterProfileRepository recruiterProfileRepository) {
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Optional<RecruiterProfile> getOne (Integer id){
        return recruiterProfileRepository.findById(id);
    }
}
