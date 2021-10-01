package com.company;

public class Human {

    private Occupation occupation;
    private School school;


    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getInfo(){
        if (occupation != null){
            return "Name: " + school.getName() +
                    "\nAddress: " + school.getAddress() +
                    "\nOccupation: " + occupation;
        } else {
            return "Name: " + school.getName() +
                    "\nAddress: " + school.getAddress();
        }

    }
}
