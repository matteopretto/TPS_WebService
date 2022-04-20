package Controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

import Model.Article;
import Model.Main;
import Model.DataStore;
import Model.Notizia;

import View.view;
import Service.SentAndReceive;

public class Controller implements ActionListener {

	private Article article;
	private Main main;
	// private DataStore dataStore;
	private Notizia notizia;
	private view view;
	private SentAndReceive SentAndReceive;
	private int num = 0;
	private int numPag = 1;

	private HashMap<String, String> Mappa = new HashMap<String, String>();

	public Controller(view view) {
		this.view = view;
		view.registraController(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == view.getBtnHomeAnteprima()) {
			view.cambiaPanel(view.getAnteprima(), view.getHome());
		}
		if (arg0.getSource() == view.getBtnHomenotizia()) {
			view.cambiaPanel(view.getNotizia(), view.getHome());
		}
		
	if(arg0.getSource()==view.getBtnletsread()) {
		view.cambiaPanel(view.getHome(), view.getAnteprima());
	}

		if (arg0.getSource() == view.getBtnsearch()) {
			String ricerca = view.getTextField_search().getText();
			Mappa.put("q", ricerca);
			if (view.getComboBoxLingua().getSelectedItem().equals("francese")) {
				Mappa.put("language", "fr");
			}
			if (view.getComboBoxLingua().getSelectedItem().equals("tedesco")) {
				Mappa.put("language", "de");
			}
			if (view.getComboBoxLingua().getSelectedItem().equals("inglese")) {
				Mappa.put("language", "en");
			}
			if (view.getComboBoxLingua().getSelectedItem().equals("spagnolo")) {
				Mappa.put("language", "es");
			}
			if (view.getComboBoxLingua().getSelectedItem().equals("italiano")) {
				Mappa.put("language", "it");
			}
			if (view.getComboBoxLingua().getSelectedItem().equals("portoghese")) {
				Mappa.put("language", "pt");
			}
			if (view.getComboBoxNews().getSelectedItem().equals("pertinenza")) {
				Mappa.put("sortBy", "relevancy");
			}
			if (view.getComboBoxNews().getSelectedItem().equals("pertinenza")) {
				Mappa.put("sortBy", "popolarity");
			}

			SentAndReceive.sentRequestAndReceiveEverything(Mappa);
			// DataStore.getArticles().get(0);
			view.getLblNot1().setText(DataStore.getArticles().get(0).getTitle());
			view.getLblNot2().setText(DataStore.getArticles().get(1).getTitle());
			view.getLblNot3().setText(DataStore.getArticles().get(2).getTitle());
			view.getLblNot4().setText(DataStore.getArticles().get(3).getTitle());
			view.getLblNot5().setText(DataStore.getArticles().get(4).getTitle());
			view.getLblNot6().setText(DataStore.getArticles().get(5).getTitle());

			/*
			 * Discutere su quante notizie si vogliono mettere Basta fare copia e incolla
			 * per ogni notizia in piu
			 */

		}

		if (arg0.getSource() == view.getBtnPrecedente()) {
			if (num != 0) {
				num = num - 6;
				numPag -= 1;
				view.getLblNot1().setText(DataStore.getArticles().get(num).getTitle());
				view.getLblNot2().setText(DataStore.getArticles().get(num + 1).getTitle());
				view.getLblNot3().setText(DataStore.getArticles().get(num + 2).getTitle());
				view.getLblNot4().setText(DataStore.getArticles().get(num + 3).getTitle());
				view.getLblNot5().setText(DataStore.getArticles().get(num + 4).getTitle());
				view.getLblNot6().setText(DataStore.getArticles().get(num + 5).getTitle());
			}
		}

		if (arg0.getSource() == view.getBtnSuccessivo()) {
			if (num < Integer.parseInt(DataStore.getNotizia().getTotalResults()) - 6) {
				numPag += 1;
				num = num + 6;
				view.getLblNot1().setText(DataStore.getArticles().get(num).getTitle());
				view.getLblNot2().setText(DataStore.getArticles().get(num + 1).getTitle());
				view.getLblNot3().setText(DataStore.getArticles().get(num + 2).getTitle());
				view.getLblNot4().setText(DataStore.getArticles().get(num + 3).getTitle());
				view.getLblNot5().setText(DataStore.getArticles().get(num + 4).getTitle());
				view.getLblNot6().setText(DataStore.getArticles().get(num + 5).getTitle());
			}
		}
		
		
		if (arg0.getSource() == view.getBtnNotizia1()) {

			int n = num;
			String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
			String url = "" + DataStore.getArticles().get(n).getUrl();
			String descrizione = "" + DataStore.getArticles().get(n).getDescription();
			String data = "" + DataStore.getArticles().get(n).getPublishedAt();
			String fonte = "" + DataStore.getArticles().get(n).getSource();
			String urlImg = "" + DataStore.getArticles().get(n).getUrlImage();
			String title = "" + DataStore.getArticles().get(n).getTitle();

			view.getTextAutore().setText(autore);
			view.getTextField_Fonte().setText(fonte);
			view.getTextField_Data().setText(data);
			view.getTextArea_Descrizione().setText(descrizione);
			view.getTextField_Title().setText(title);

			ImageIcon imgThisImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImg));
			view.getLblImg().setIcon(imgThisImg);
			
			view.cambiaPanel(view.getAnteprima(), view.getNotizia());
		}
		
		
		if (arg0.getSource() == view.getBtnNotizia2()) {

			int n = num + 1;
			String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
			String url = "" + DataStore.getArticles().get(n).getUrl();
			String descrizione = "" + DataStore.getArticles().get(n).getDescription();
			String data = "" + DataStore.getArticles().get(n).getPublishedAt();
			String fonte = "" + DataStore.getArticles().get(n).getSource();
			String urlImg = "" + DataStore.getArticles().get(n).getUrlImage();
			String title = "" + DataStore.getArticles().get(n).getTitle();

			view.getTextAutore().setText(autore);
			view.getTextField_Fonte().setText(fonte);
			view.getTextField_Data().setText(data);
			view.getTextArea_Descrizione().setText(descrizione);
			view.getTextField_Title().setText(title);

			ImageIcon imgThisImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImg));
			view.getLblImg().setIcon(imgThisImg);
			view.cambiaPanel(view.getAnteprima(), view.getNotizia());
		}
		
		
		if (arg0.getSource() == view.getBtnNotizia3()) {

			int n = num + 2;
			String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
			String url = "" + DataStore.getArticles().get(n).getUrl();
			String descrizione = "" + DataStore.getArticles().get(n).getDescription();
			String data = "" + DataStore.getArticles().get(n).getPublishedAt();
			String fonte = "" + DataStore.getArticles().get(n).getSource();
			String urlImg = "" + DataStore.getArticles().get(n).getUrlImage();
			String title = "" + DataStore.getArticles().get(n).getTitle();

			view.getTextAutore().setText(autore);
			view.getTextField_Fonte().setText(fonte);
			view.getTextField_Data().setText(data);
			view.getTextArea_Descrizione().setText(descrizione);
			view.getTextField_Title().setText(title);

			ImageIcon imgThisImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImg));
			view.getLblImg().setIcon(imgThisImg);
			view.cambiaPanel(view.getAnteprima(), view.getNotizia());
		}
		
		
		if (arg0.getSource() == view.getBtnNotizia4()) {

			int n = num + 3;
			String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
			String url = "" + DataStore.getArticles().get(n).getUrl();
			String descrizione = "" + DataStore.getArticles().get(n).getDescription();
			String data = "" + DataStore.getArticles().get(n).getPublishedAt();
			String fonte = "" + DataStore.getArticles().get(n).getSource();
			String urlImg = "" + DataStore.getArticles().get(n).getUrlImage();
			String title = "" + DataStore.getArticles().get(n).getTitle();

			view.getTextAutore().setText(autore);
			view.getTextField_Fonte().setText(fonte);
			view.getTextField_Data().setText(data);
			view.getTextArea_Descrizione().setText(descrizione);
			view.getTextField_Title().setText(title);

			ImageIcon imgThisImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImg));
			view.getLblImg().setIcon(imgThisImg);
			view.cambiaPanel(view.getAnteprima(), view.getNotizia());
		}
		
		
		if (arg0.getSource() == view.getBtnNotizia5()) {

			int n = num + 4;
			String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
			String url = "" + DataStore.getArticles().get(n).getUrl();
			String descrizione = "" + DataStore.getArticles().get(n).getDescription();
			String data = "" + DataStore.getArticles().get(n).getPublishedAt();
			String fonte = "" + DataStore.getArticles().get(n).getSource();
			String urlImg = "" + DataStore.getArticles().get(n).getUrlImage();
			String title = "" + DataStore.getArticles().get(n).getTitle();

			view.getTextAutore().setText(autore);
			view.getTextField_Fonte().setText(fonte);
			view.getTextField_Data().setText(data);
			view.getTextArea_Descrizione().setText(descrizione);
			view.getTextField_Title().setText(title);

			ImageIcon imgThisImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImg));
			view.getLblImg().setIcon(imgThisImg);
			view.cambiaPanel(view.getAnteprima(), view.getNotizia());
		}
		
		
		if (arg0.getSource() == view.getBtnNotizia6()) {

			int n = num + 5;
			String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
			String url = "" + DataStore.getArticles().get(n).getUrl();
			String descrizione = "" + DataStore.getArticles().get(n).getDescription();
			String data = "" + DataStore.getArticles().get(n).getPublishedAt();
			String fonte = "" + DataStore.getArticles().get(n).getSource();
			String urlImg = "" + DataStore.getArticles().get(n).getUrlImage();
			String title = "" + DataStore.getArticles().get(n).getTitle();

			view.getTextAutore().setText(autore);
			view.getTextField_Fonte().setText(fonte);
			view.getTextField_Data().setText(data);
			view.getTextArea_Descrizione().setText(descrizione);
			view.getTextField_Title().setText(title);

			ImageIcon imgThisImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImg));
			view.getLblImg().setIcon(imgThisImg);
			view.cambiaPanel(view.getAnteprima(), view.getNotizia());
		}
	}
}