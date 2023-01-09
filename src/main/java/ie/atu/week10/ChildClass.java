package ie.atu.week10;

public class ChildClass extends ParentClass{

    public ChildClass() {
        super("Hi there.");
        System.out.println("You are calling the child constructor");
    }

    @Override
    public String toString() {
        return "This is the Child toString";
    }
}
