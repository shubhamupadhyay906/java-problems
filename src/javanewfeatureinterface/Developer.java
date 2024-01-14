package javanewfeatureinterface;

public interface Developer {

    default void start(){
        System.out.println("I am Developer");
    }

    static void end(){
        System.out.println("Coding is completed");
    }

    void develop();
}

