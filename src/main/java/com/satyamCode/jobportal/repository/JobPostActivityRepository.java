package com.satyamCode.jobportal.repository;

import com.satyamCode.jobportal.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostActivityRepository extends JpaRepository<JobPostActivity,Integer> {

}
