package Feb18thClass;


public class Students {


    String name;

    String phoneNum;
    double maths;
    double science;
    double chem;

    public Students(String name, String phoneNum, double maths, double science, double chem){
        this.phoneNum=phoneNum;
        this.name=name;
        this.chem=chem;
        this.maths=maths;
        this.science=science;

    }
    public Students(double maths, double chem){
        this(null,null, maths,0,chem);

    }
    public Students(String name){
        this(name,null, 0,0,0);
    }
    public Students(String name, double maths){
        this.name=name;
        this.maths=maths;

    }


    public double totalMarks(){

        return (maths+science+chem);

    }
}
