package singleton;

public class Main {
    public static void main(String[] args) {
        //obj ref are same
        DataBase dataBase = DataBase.getInstance();
        DataBase dataBase1 = DataBase.getInstance();
        System.out.println(dataBase.hashCode());
        System.out.println(dataBase1.hashCode());

        //object ref are different
        Information information1 = new Information();
        Information information2 = new Information();
        System.out.println(information1.hashCode());
        System.out.println(information2.hashCode());
    }
}
