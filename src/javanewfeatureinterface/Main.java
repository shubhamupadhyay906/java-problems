package javanewfeatureinterface;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper java = new JavaDeveloper();
        WebDeveloper web = new WebDeveloper();
        java.start();
        java.develop();
        web.develop();
        web.start();
    }
}
