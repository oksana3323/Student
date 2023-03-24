package model;

import enam.Gender;

public class Student {
    private String fullName;
    private int age;
    private Gender gender;

    public Student() {
    }

    public Student(String fullName, int age, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " Student" +
                " fullName:" + fullName +
                " age :" + age +
                " gender : " + gender;

    }
}
