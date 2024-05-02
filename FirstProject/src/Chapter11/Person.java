package Chapter11;

public class Person {
    String name = "Dane Verkouteren";
    String address = "26459 Partridge Dr.";
    long phoneNumber = 6616709025l;
    String email = "dane.verkouteren@gmail.com";
    
    public String toString(){
        return "Person: " + name;
    }

}
class Student extends Person{
    String status = "Freshman";

    @Override
    public String toString(){
        return "Student: " + this.name;
    }

}
class Employee extends Person{
    double salary = 500000;
    @Override
    public String toString(){
        return "Employee: " + this.name;
    }

}