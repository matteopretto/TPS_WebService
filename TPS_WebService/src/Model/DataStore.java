package Model;

import java.util.ArrayList;

public class DataStore {

    private static Notizia notizia;

    public static ArrayList<Article> getArticles() {
        return notizia.getArticles();
    }

    public static Notizia getNotizia() {
        return notizia;
    }

    public static void setNotizia(Notizia mynotizia) {
        notizia = mynotizia;
    }

}
