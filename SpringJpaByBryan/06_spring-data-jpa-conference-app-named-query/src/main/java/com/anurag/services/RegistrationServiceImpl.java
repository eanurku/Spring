package com.anurag.services;

import com.anurag.models.Registration;
import com.anurag.models.RegistrationReport;
import com.anurag.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service(value = "registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;


    @Override
//    @Transactional
    public Registration addRegistration(Registration registration) {

        return registrationRepository.addRegistration(registration);

    }

    @Override
    public Registration getRegistration(Long id) {
        return registrationRepository.getRegistration(id);
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        return registrationRepository.findAllReports();
    }

    @Override
    public List<RegistrationReport> findAllReportsByNamedQuery() {
        return registrationRepository.findAllReportsByNamedQuery();
    }
}
