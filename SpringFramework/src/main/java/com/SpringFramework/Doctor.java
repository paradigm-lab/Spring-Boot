package com.SpringFramework;

public class Doctor implements Staff {

    private String qualification;

    public void assist() {
        System.out.println("Doctor is Assisting");
    }

    // Getter and Setter Method
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
