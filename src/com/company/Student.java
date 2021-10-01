package com.company;

public final class Student extends Human{

    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex, Occupation occupation, School school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        super.setSchool(school);
        super.setOccupation(occupation);
    }

    public Student(String name, int age, String sex, School school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        super.setSchool(school);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nName: " + name + "\nAge: " + age;
    }
}
