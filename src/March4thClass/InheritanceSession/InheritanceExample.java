package March4thClass.InheritanceSession;

public class InheritanceExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();
        GrandChild grandChild = new GrandChild();
        grandChild.display();
    }
}
