package com.company;

public class Main {

    public static void main(String[] args) {

        School school = new School("GeekTech","Amatova 1B");
        School school1 = new School("Deveem", "Bishkek");
        Student student = new Student("Edilbek",37,"Male", Occupation.STUDENT, school);
        System.out.println(student.getInfo());
        student.greeting(37);
        System.out.println("==========================================");
        Student teacher = new Student("Nurgazy",25,"Male", Occupation.TEACHER, school1);
        System.out.println(teacher.getInfo());
        teacher.greeting();
        System.out.println("==========================================");
        Student student1 = new Student("Ulan", 20, "Male", school);
        System.out.println(student1.getInfo());

    }
}
