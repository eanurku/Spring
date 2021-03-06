package com.anurag.repository;

import com.anurag.models.Registration;
import com.anurag.models.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    Registration getRegistration(Long id);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();

    List<RegistrationReport> findAllReportsByNamedQuery();
}
