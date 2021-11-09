package com.anurag.services;

import com.anurag.models.Registration;
import com.anurag.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;


    @Override
//    @Transactional
    public void addRegistration(Registration registration) {

        registrationRepository.addRegistration(registration);

    }
}
