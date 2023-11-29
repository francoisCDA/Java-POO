package org.example.Exercices.Papeterie;

import java.util.HashMap;

public abstract class Article {

    private static HashMap<String,Article> collection = new HashMap<>() ;
    private static HashMap<String,ArticleUnitaire> produits = new HashMap<>();

    public static boolean addArticle(String ref, Article article) {
        if (collection.containsKey(ref)) {
            collection.put(ref, article);
            return true;
        } else {
            return false;
        }

    }

    public static Article getArticle(String ref) {
        return collection.get(ref);
    }

    public static boolean newProduit(String nom,Double prix) {
        if (!produits.containsKey(nom)) {
            produits.put(nom,new ArticleUnitaire(nom,prix));
            return true;
        }
        return false;
    }


}
