package Model;

import java.util.ArrayList;

public class DataStore {

    private static ArrayList<Article> articles;
    private static Notizia notizia;

    public static ArrayList<Article> getArticles() {
        return articles;
    }

    public static void setArticles(ArrayList<Article> articles) {
        DataStore.articles = articles;
    }

    	public static Notizia getNotizia() {
    		return notizia;
    	}

    public static void setNotizia(Notizia mynotizia) {
        notizia = mynotizia;
    }

}
