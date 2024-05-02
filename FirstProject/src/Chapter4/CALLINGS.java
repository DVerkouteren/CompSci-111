// package Chapter4;


// class Student {
//     private String firstName;
//     private String lastName;
//     public Student(String firstName, String lastName) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }
    
//     public void printFullName() {
//         System.out.println (this.firstName+" "+this.lastName);
       
//     }
// }

// class Grades{
//     private int LA;
//     private int DE;
//     private int CompSci;
//     private int Physics;
    

//     public void newGrades(int LA, int DE, int CompSci, int Physics){
//         this.LA = LA;
//         this.DE = DE;
//         this.CompSci = CompSci;
//         this.Physics = Physics;
//     }
//     public void calculate(){
//     }
// }


// public class CALLINGS {

//     public int TotalLA;
//     public int TotalDE;
//     public int TotalCompSci;
//     public int TotalPhysics;

//     public static void main(String[] args) {
//         Grades Homework = new Grades();
//         Grades Exams = new Grades();

//         Homework.newGrades(80, 75, 90, 50);
//         Exams.newGrades(90, 80, 70, 64);
        
    

//         Student[] students = new Student[] {
//             new Student("Morgan", "Freeman"),
//             new Student("Brad", "Pitt"),
//             new Student("Kevin", "Spacey"),
//         };

//         for (Student s : students) {
//             s.printFullName();
//         }
//     }
// }