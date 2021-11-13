package com.anurag.services;

import com.anurag.models.Registration;
import com.anurag.models.RegistrationReport;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    Registration getRegistration(Long id);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();

    List<RegistrationReport> findAllReportsByNamedQuery();

    Registration updateRegistration(Registration registration);
}
