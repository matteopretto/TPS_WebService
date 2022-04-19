package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import Model.Article;
import Model.Main;
import Model.DataStore;
import Model.Notizia;

import View.view;
import Service.SentAndReceive;

public class Controller implements ActionListener {
	
	private Article article;
	private Main main;
	//private DataStore dataStore;
	private Notizia notizia; 
	private view view;
	private SentAndReceive SentAndReceive;

	
	private HashMap<String, String> Mappa = new HashMap<String, String>();
	
	public Controller(view view) {
		this.view = view;
		view.registraController(this);
	}

    public void actionPerformed(ActionEvent arg0) {
    	if(arg0.getSource()==view.getBtnHomeAnteprima()) {
    		view.cambiaPanel(view.getAnteprima(), view.getHome());
    	}
    	if(arg0.getSource()==view.getBtnHomenotizia()) {
    		view.cambiaPanel(view.getNotizia(), view.getHome());
    	}
    	
    	if(arg0.getSource()==view.getBtnsearch()) {
    		String ricerca= view.getTextField_search().getText();
    		Mappa.put("q", ricerca);
    		if(view.getComboBoxLingua().getSelectedItem().equals("francese")) {
    			Mappa.put("language", "fr");
    		}
    		if(view.getComboBoxLingua().getSelectedItem().equals("tedesco")) {
    			Mappa.put("language", "de");
    		}
    		if(view.getComboBoxLingua().getSelectedItem().equals("inglese")) {
    			Mappa.put("language", "en");
    		}
    		if(view.getComboBoxLingua().getSelectedItem().equals("spagnolo")) {
    			Mappa.put("language", "es");
    		}
    		if(view.getComboBoxLingua().getSelectedItem().equals("italiano")) {
    			Mappa.put("language", "it");
    		}
    		if(view.getComboBoxLingua().getSelectedItem().equals("portoghese")) {
    			Mappa.put("language", "pt");
    		}
    		if(view.getComboBoxNews().getSelectedItem().equals("pertinenza")) {
    			Mappa.put("sortBy", "relevancy");
    		}
    		if(view.getComboBoxNews().getSelectedItem().equals("pertinenza")) {
    			Mappa.put("sortBy", "popolarity");
    		}
    		
    		SentAndReceive.sentRequestAndReceiveEverything(Mappa);
    		//DataStore.getArticles().get(0);
    		view.getTextNotizia1().setText(DataStore.getArticles().get(0).getTitle());
    		
    		/*
    		 * Discutere su quante notizie si vogliono mettere
    		 * Basta fare copia e incolla per ogni notizia in piu
    		 */
    		
    		if(/*Cliccare sulla textField*/false){
    				int n=3; //ho messo 3 ma n sarà il numero di notizia cliccata
    				String autore="Autore: "+ DataStore.getArticles().get(n).getAuthor();
    				String url= ""+ DataStore.getArticles().get(n).getUrl();
    				String descrizione=""+DataStore.getArticles().get(n).getDescription();
    				String data= ""+DataStore.getArticles().get(n).getPublishedAt();
    				String fonte=""+DataStore.getArticles().get(n).getSource();
    				String urlImg=""+DataStore.getArticles().get(n).getUrlImage();
    				String title= ""+DataStore.getArticles().get(n).getTitle();
    				
    				//Popolo le text field del Panel Notizie
    				
    				view.getTextAutore().setText(autore);
    				view.getTextField_Fonte().setText(fonte);
    				view.getTextField_Data().setText(data);
    				view.getTextArea_Descrizione().setText(descrizione);
    				view.getTextField_Title().setText(title);
    				// view.getTextField_Immagine().set
    				// Da vedere come inserire immagine
    	}
    }
}
}