package com.anurag.repository;

import com.anurag.models.Registration;
import com.anurag.models.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("registrationRepository")
public interface RegistrationRepository extends JpaRepository<Registration,Long> {

    List<RegistrationReport> findAllReports();

}
