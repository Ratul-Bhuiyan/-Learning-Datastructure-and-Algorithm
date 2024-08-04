public class OOPS {
    public static void main(String args[]){
        pen pen1 = new pen();
        pen1.setClr("green");
        System.out.println(pen1.getClr());
       // pen pen2 = new pen();
        Student s1 = new Student("Bhuiyan",4,'b');
        System.out.println(s1.name + s1.grade + s1.sec + s1.CGPA);
        s1.marks[0]=12;
        s1.marks[1]=23;
        s1.marks[2]=34;
        Student s2 = new Student();
        System.out.println(s2.grade);
        Student s3 = new Student(s1);
        System.out.println(s3.name + s3.grade + s3.sec + s3.CGPA);
        System.out.println(s3.marks[0]+ "" + s3.marks[1]+ "" +s3.marks[2]);
        System.out.println(s2.marks[2]);
        Human h1 = new Human();
        h1.legs = 2;
        System.out.println(h1.run(40));
        law48 lw1 = new law48();
        Cat c1 = new Cat();
         System.out.println(c1.legs);
        lw1.meaw();
    }   
}



class pen {
    private String color = "red";
    private int thick = 5;
    String getClr(){
        return this.color;
    }
    int getThk(){
        return this.thick;
    }
    void setClr(String newcolor){
        this.color = newcolor;
    }
    void setThk(int thkNs){
        thick = thkNs;
    }
}

class Student {
    String name = "Ratul";
    int grade = 2;
    char sec = 'A';
    double CGPA = 3.9;
    int marks[] = {1,2,3};
    Student(String nm,int g,char sec){
        this.name = nm;
        grade = g;
        this.sec = sec;
    }
    Student(){

    }
    Student(Student any){
        this.name = any.name;
        this.grade = any.grade;
        this.sec = 'A';
        //shalow copy
        //this.marks = any.marks;
        //deep copy
        for(int i = 0;i<marks.length;i++){
            this.marks[i] = any.marks[i];
        }
    }
}

class Animal{
    int legs = 2;
    int breath;
    int run(int steps){
        steps *= legs;
        return steps;
    }
}

class Human extends Animal {
    Human(){
        super.legs = 4;
    }
    String talk;
}

class Cat extends Animal {
    String says = "meaw";
}

abstract class Book{
    int pages = 100;
    String name;
    String type;
    void meaw(){
        System.out.println("meaw");
    }
    abstract int cost(int cst);
    Book() {
        type = "Novel";
    }
}
class law48 extends Book {
    //{this.type = "novel";}
    void setName(String nm){
        this.name = nm;
    }
    int cost(int cst){
        cst *= this.pages;
        return cst;
    }
}

interface Harniber {
    void grass();
}

interface Carnivar {
    void meat();
}

class Bear implements Harniber, Carnivar {
    public void grass(){
        System.out.println("Eats grass");
    }
    public void meat(){
        System.out.println("Eats meat");
    }
    int weigth;
}
