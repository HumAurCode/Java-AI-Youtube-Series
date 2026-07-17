package controller;

public class Student{

    //properties
    private String name;
    private int age;
    private int rollno;
    private String address;

    public Student(String name, int age, int rollno, String address) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.address = address;
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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}