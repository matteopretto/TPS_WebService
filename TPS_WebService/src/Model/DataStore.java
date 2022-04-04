package Model;

import java.util.ArrayList;

public class DataStore {

    private static ArrayList<Article> articles;

    public static ArrayList<Article> getArticles() {
        return articles;
    }

    public static void setArticles(ArrayList<Article> articles) {
        DataStore.articles = articles;
    }
}
