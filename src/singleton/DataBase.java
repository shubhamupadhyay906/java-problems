package singleton;

import java.util.Objects;

public class DataBase {
    private static DataBase INSTANCE;

    private DataBase() {
    }

    public static synchronized DataBase getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new DataBase();
        }
        return INSTANCE;
    }
}
