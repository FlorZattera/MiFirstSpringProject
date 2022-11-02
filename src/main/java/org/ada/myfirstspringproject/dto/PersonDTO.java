package org.ada.myfirstspringproject.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PersonDTO {

    private String id;
    private String name;

    @JsonAlias ("last_name")
    private String lastname;
    private String birthday;
    private char gender;
    @JsonAlias ("civil_status")
    private String civilStatus;

    public PersonDTO(String id, String name, String lastname, String birthday, char gender, String civilStatus) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.gender = gender;
        this.civilStatus = civilStatus;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public char getGender() {
        return gender;
    }

    public String getCivilStatus() {
        return civilStatus;
    }
}
