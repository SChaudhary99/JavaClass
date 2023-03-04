package Feb28thClass;

public class Counter {

    static int count =0;
    int instanceCount = 0;


    public void incrementInstance(){
        instanceCount++;
        count++;
    }
    public void printInstance(){
        System.out.println(instanceCount);
        System.out.println(count);
    }

}
