package com.epam.brest.model;

import java.util.Date;

public class Animal {

        private Integer AnimalId;

        private String Name;

        private Date DateOfBirth;

        private Integer departmentId;

    public Integer getAnimalId() {
        return AnimalId;
    }

    public void setAnimalId(Integer animalId) {
        AnimalId = animalId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Integer getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(Integer departmentId) {
            this.departmentId = departmentId;
        }
    }
