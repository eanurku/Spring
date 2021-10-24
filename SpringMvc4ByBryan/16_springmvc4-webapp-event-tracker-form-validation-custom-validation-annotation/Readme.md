1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test
   -hibernate-validator

`    <properties>
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.0.2.RELEASE</version>
        <relativePath/>
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>5.0.3.Final</version>
        </dependency>
    </dependencies>
`

2. create a  @Phone annotation using @interface
   
`  
   @Documented
   @Constraint(validatedBy = PhoneConstraintValidator.class)
   @Target({ElementType.METHOD, ElementType.FIELD})
   @Retention(RetentionPolicy.RUNTIME)
   public @interface Phone {
      String message() default "{Phone}";
      Class<?>[] groups() default {};
      Class<? extends Payload>[] payload() default {};
   }
`

4. create a PhoneConstraintValidator class which implements ConstraintValidator<Phone, String>

`
public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {
    @Override
    public void initialize(Phone phone) {
    }
    @Override
    public boolean isValid(String phoneValue, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneValue == null) {
            return false;
        }
        return phoneValue.matches("[0-9]*");
    }
}
`
5. now apply @Phone annotation to validate a field
`   
   @NotEmpty
   @Phone
   private String phoneNumber;
`
6. add custom error message for @Phone annotation in message properties files.
-messages.properties
    -Phone.attendee.phoneNumber=not a valid phone number
-messages_es.properties
   -Phone.attendee.phoneNumber=no es un número de teléfono válido    