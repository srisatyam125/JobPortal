package com.satyamCode.jobportal.repository;

import com.satyamCode.jobportal.entity.JobPostActivity;
import com.satyamCode.jobportal.entity.JobSeekerApply;
import com.satyamCode.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply,Integer> {
    List<JobSeekerApply> findByUserId (JobSeekerProfile userId);

    List<JobSeekerApply> findByJob (JobPostActivity job);
}
