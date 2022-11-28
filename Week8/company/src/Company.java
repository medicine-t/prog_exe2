import java.util.ArrayList;

class Person {
    String name;
}

class Employee extends Person {

}

class Manager extends Employee {

}

class Section {
    String section_name;
    ArrayList<Employee> employees;
    Manager manager;
}

public class Company {
    String company_name;
    ArrayList<Section> sections;
}