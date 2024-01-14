package javanewfeatureinterface;

public class JavaDeveloper implements Developer{

    @Override
    public void start() {
        System.out.println("I am Java Developer with database");
    }

    @Override
    public void develop() {
        System.out.println("Java developer");
    }

    public void endOf() {
       Developer.end();
    }

}
