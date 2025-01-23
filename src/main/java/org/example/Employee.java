package org.example;

public class Employee {
    String name;
    String surname;
    String middleName;
    String position;
    String email;
    int phoneNumber;
    int age;
    int salary;

    public Employee(String name, String surname, String middleName, String position, String email, int phoneNumber, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void printInfo(Employee employee) {
        System.out.println("Name " + employee.getName() + '\n' +
                "Surname " + employee.getSurname() + '\n' +
                "Middle Name " + employee.getMiddleName() + '\n' +
                "Position " + employee.getPosition() + '\n' +
                "Email " + employee.getEmail() + '\n' +
                "Phone Number " + employee.getPhoneNumber() + '\n' +
                "Age " + employee.getAge() + '\n' +
                "Salary " + employee.getSalary() + '\n'
        );
    }
}
