package com.anurag.repository;

import com.anurag.models.Registration;
import com.anurag.models.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository(value = "registrationRepository")
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Registration addRegistration(Registration registration) {

        entityManager.persist(registration);

        return registration;
    }

    @Override
    public Registration getRegistration(Long id) {
        return entityManager.find(Registration.class,id);
    }

    @Override
    public List<Registration> findAll() {
        List<Registration> registrations = entityManager.createQuery("select r from Registration r").getResultList();

        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {

        String jpql_query="select  new com.anurag.models.RegistrationReport(r.name,c.name,c.description) " +
                "from Registration r ,Course c " +
                "where r.id=c.registration.id ";
        List<RegistrationReport> reports = entityManager.createQuery(jpql_query).getResultList();

        return reports;
    }

    @Override
    public List<RegistrationReport> findAllReportsByNamedQuery() {
        List<RegistrationReport> reports = entityManager.createNamedQuery(Registration.REGISTRATION_REPORTS).getResultList();

        return reports;
    }

    @Override
    public Registration save(Registration registration) {
        if(registration.getId()==null){
            entityManager.persist(registration);
        }
        else{
            registration=entityManager.merge(registration);
        }
        return registration;
    }
}
