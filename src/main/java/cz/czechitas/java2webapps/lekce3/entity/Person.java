package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    private String firstname;
    private String lastName;
    private LocalDate birthDate;
    private String profileImageUrl;

    public Person(String firstname, String lastName, LocalDate birthDate, String profileImageUrl) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.profileImageUrl = profileImageUrl;
    }

    public Person() {
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }
}
