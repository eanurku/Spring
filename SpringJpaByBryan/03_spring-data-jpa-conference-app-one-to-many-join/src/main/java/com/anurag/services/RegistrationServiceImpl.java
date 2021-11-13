package com.anurag.services;

import com.anurag.models.Course;
import com.anurag.models.Registration;
import com.anurag.repository.CourseRepository;
import com.anurag.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    @Autowired
    CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {

        System.out.println(registration);
        registration = registrationRepository.save(registration);
        System.out.println(registration);


        Course introCourse = new Course();
        introCourse.setName("Intro");
        introCourse.setDescription("this is mandatory intro course");

        introCourse.setRegistration(registration);

        System.out.println(introCourse);
        introCourse = courseRepository.save(introCourse);
        System.out.println(introCourse);

        return registration;

    }
}
