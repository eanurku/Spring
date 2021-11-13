package com.anurag.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "REGISTRATION")
@NamedQueries({
        @NamedQuery(name = Registration.REGISTRATION_REPORTS,query = Registration.REGISTRATION_REPORTS_JPQL_QUERY)

})
public class Registration {

    public static final String REGISTRATION_REPORTS="Registration.findAllReports";
    public static final String REGISTRATION_REPORTS_JPQL_QUERY="select  new com.anurag.models.RegistrationReport(r.name,c.name,c.description) " +
            "from Registration r ,Course c " +
            "where r.id=c.registration.id ";
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "registration",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Course> courses=new ArrayList<>();

    public Registration() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", courses=" + courses +
                '}';
    }
}
