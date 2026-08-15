//
class Student{
    String name;
    int age;
    String course;
     Student(String name, int age, String Course){
        this.name=name;
        this.age=age;
        this.course=Course;
        
     }
     static void display(Student s){
        System.out.println("Student name is: "+s.name);
        System.out.println("Age: "+s.age);
        System.out.println("Course: "+ s.course);
        
        }
    public static void main(String[] args) {
        Student s1=new Student("ANKIT",22,"BCA DS & AI");
        display(s1);
    }
}
