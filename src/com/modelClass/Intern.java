package com.modelClass;

class Intern extends Employee {
    private String universityName;

    public Intern(String name, double salary, String stateUniversity) {
        super(name, salary);
        this.universityName = stateUniversity;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", University: " + universityName;
    }
}

