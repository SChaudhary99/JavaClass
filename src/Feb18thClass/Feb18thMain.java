package Feb18thClass;

public class Feb18thMain {
    public static void main(String[]args){

        Students newStudent = new Students("Samuel", "6132224444",90,100,80);
        Students newStudent1 = new Students("James", "6135557777",80,60.5,80.70);
        Students newStudent2 = new Students("Lexi", "6139996666",90.60,70.5,84.6);



        System.out.println(newStudent.name+" is having total marks of: "+ newStudent.totalMarks());
        System.out.println(newStudent1.name+" is having total marks of: "+ newStudent1.totalMarks());
        System.out.println(newStudent2.name+" is having total marks of: "+ newStudent2.totalMarks());


    }
}
