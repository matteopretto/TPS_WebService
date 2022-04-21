package Controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.swing.*;

import java.awt.Toolkit;

import Model.Article;
import Model.DataStore;
import Model.ImageTool;
import Model.Notizia;

import View.view;
import Service.SentAndReceive;

public class Controller implements ActionListener {

    private Article article;
    // private DataStore dataStore;
    private Notizia notizia;
    private view view;
    private SentAndReceive SentAndReceive;
    private int num = 0;
    private int numPag = 1;
    private boolean checked = false;

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

        if (arg0.getSource() == view.getBtnletsread()) {
            view.cambiaPanel(view.getHome(), view.getAnteprima());
        }

        if (arg0.getSource() == view.getBtnsearch()) {
        	view.cambiaOra();
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
            if (!DataStore.getNotizia().getTotalResults().equals("0")) {
                if (DataStore.getArticles().size() > 0)
                    view.getLblNot1().setText(DataStore.getArticles().get(0).getTitle());
                else{
                    view.getLblNot1().setText("");
                    view.getLblNot1().setEnabled(false);
                }
                if (DataStore.getArticles().size() > 1)
                    view.getLblNot2().setText(DataStore.getArticles().get(1).getTitle());
                else{
                    view.getLblNot2().setText("");
                    view.getLblNot2().setEnabled(false);
                }
                if (DataStore.getArticles().size() > 2)
                    view.getLblNot3().setText(DataStore.getArticles().get(2).getTitle());
                {
                    view.getLblNot3().setText("");
                    view.getLblNot3().setEnabled(false);
                }
                if (DataStore.getArticles().size() > 3)
                    view.getLblNot4().setText(DataStore.getArticles().get(3).getTitle());
                else{
                    view.getLblNot4().setText("");
                    view.getLblNot4().setEnabled(false);
                }
                if (DataStore.getArticles().size() > 4)
                    view.getLblNot5().setText(DataStore.getArticles().get(4).getTitle());
                else{
                    view.getLblNot5().setText("");
                    view.getLblNot5().setEnabled(false);
                }
                if (DataStore.getArticles().size() > 5)
                    view.getLblNot6().setText(DataStore.getArticles().get(5).getTitle());
                else{
                    view.getLblNot6().setText("");
                    view.getLblNot6().setEnabled(false);
                }
                checked = true;
            } else {
                JOptionPane.showMessageDialog(null, "Articolo non trovato !!!!");
                checked = false;
            }
            /*
             * Discutere su quante notizie si vogliono mettere Basta fare copia e incolla
             * per ogni notizia in piu
             */

        }
        if (checked) {
            if (arg0.getSource() == view.getBtnPrecedente()) {
                if (numPag > 1) {
                    numPag -= 1;
                    view.getTextField_NumPagina().setText("" + (numPag));
                    view.getLblNot1().setText(DataStore.getArticles().get((numPag - 1) * 6).getTitle());
                    view.getBtnNotizia2().setEnabled(true);
                    view.getLblNot2().setText(DataStore.getArticles().get((numPag - 1) * 6 + 1).getTitle());
                    view.getBtnNotizia3().setEnabled(true);
                    view.getLblNot3().setText(DataStore.getArticles().get((numPag - 1) * 6 + 2).getTitle());
                    view.getBtnNotizia4().setEnabled(true);
                    view.getLblNot4().setText(DataStore.getArticles().get((numPag - 1) * 6 + 3).getTitle());
                    view.getBtnNotizia5().setEnabled(true);
                    view.getLblNot5().setText(DataStore.getArticles().get((numPag - 1) * 6 + 4).getTitle());
                    view.getBtnNotizia6().setEnabled(true);
                    view.getLblNot6().setText(DataStore.getArticles().get((numPag - 1) * 6 + 5).getTitle());
                }
                view.cambiaOra();
            }

            if (arg0.getSource() == view.getBtnSuccessivo()) {
                if ((numPag) * 6 < DataStore.getNotizia().getArticles().size()) {
                    System.out.println(DataStore.getNotizia().getArticles().size());
                    view.getLblNot1().setText(DataStore.getArticles().get((numPag) * 6).getTitle());
                    if (numPag * 6 + 1 < DataStore.getNotizia().getArticles().size()) {
                        view.getLblNot2().setText(DataStore.getArticles().get((numPag) * 6 + 1).getTitle());
                        view.getBtnNotizia2().setEnabled(true);
                    } else {
                        view.getLblNot2().setText("");
                        view.getBtnNotizia2().setEnabled(false);
                    }

                    if (numPag * 6 + 2 < DataStore.getNotizia().getArticles().size()) {
                        view.getLblNot3().setText(DataStore.getArticles().get((numPag) * 6 + 2).getTitle());
                        view.getBtnNotizia3().setEnabled(true);
                    } else {
                        view.getLblNot3().setText("");
                        view.getBtnNotizia3().setEnabled(false);
                    }
                    if (numPag * 6 + 3 < DataStore.getNotizia().getArticles().size()) {
                        view.getLblNot4().setText(DataStore.getArticles().get((numPag) * 6 + 3).getTitle());
                        view.getBtnNotizia4().setEnabled(true);
                    } else {
                        view.getLblNot4().setText("");
                        view.getBtnNotizia4().setEnabled(false);
                    }
                    if (numPag * 6 + 4 < DataStore.getNotizia().getArticles().size()) {
                        view.getLblNot5().setText(DataStore.getArticles().get((numPag) * 6 + 4).getTitle());
                        view.getBtnNotizia5().setEnabled(true);
                    } else {
                        view.getLblNot5().setText("");
                        view.getBtnNotizia5().setEnabled(false);
                    }
                    if (numPag * 6 + 5 < DataStore.getNotizia().getArticles().size()) {
                        view.getLblNot6().setText(DataStore.getArticles().get((numPag) * 6 + 5).getTitle());
                        view.getBtnNotizia6().setEnabled(true);
                    } else {
                        view.getLblNot6().setText("");
                        view.getBtnNotizia6().setEnabled(false);
                    }
                    numPag += 1;
                    view.getTextField_NumPagina().setText("" + numPag);
                }
                view.cambiaOra();
            }


            if (arg0.getSource() == view.getBtnNotizia1()) {

                int n = numPag * 6;
                String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
                String url = "" + DataStore.getArticles().get(n).getUrl();
                String descrizione = "" + DataStore.getArticles().get(n).getDescription();
                String data = "" + DataStore.getArticles().get(n).getPublishedAt();
                String fonte = "" + DataStore.getArticles().get(n).getSource().getName();
                String urlImg = "" + DataStore.getArticles().get(n).getUrlToImage();
                System.out.println(urlImg);
                String title = "" + DataStore.getArticles().get(n).getTitle();

                view.getTextAutore().setText(autore);
                view.getTextField_Fonte().setText(fonte);
                view.getTextField_Data().setText(data);
                view.getTextArea_Descrizione().setText(descrizione);
                view.getTextField_Title().setText(title);
                ImageIcon imgThisImg = null;
                try {
                    imgThisImg = ImageTool.createAutoAdjustIcon(new URL(urlImg), true);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                view.getLblImg().setIcon(imgThisImg);

                view.cambiaPanel(view.getAnteprima(), view.getNotizia());
                view.cambiaOra();
            }


            if (arg0.getSource() == view.getBtnNotizia2()) {

                int n = numPag * 6 + 1;
                String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
                String url = "" + DataStore.getArticles().get(n).getUrl();
                String descrizione = "" + DataStore.getArticles().get(n).getDescription();
                String data = "" + DataStore.getArticles().get(n).getPublishedAt();
                String fonte = "" + DataStore.getArticles().get(n).getSource().getName();
                String urlImg = "" + DataStore.getArticles().get(n).getUrlToImage();
                System.out.println(urlImg);
                String title = "" + DataStore.getArticles().get(n).getTitle();

                view.getTextAutore().setText(autore);
                view.getTextField_Fonte().setText(fonte);
                view.getTextField_Data().setText(data);
                view.getTextArea_Descrizione().setText(descrizione);
                view.getTextField_Title().setText(title);

                ImageIcon imgThisImg = null;
                try {
                    imgThisImg = ImageTool.createAutoAdjustIcon(new URL(urlImg), true);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                view.getLblImg().setIcon(imgThisImg);
                view.cambiaPanel(view.getAnteprima(), view.getNotizia());
                view.cambiaOra();
            }


            if (arg0.getSource() == view.getBtnNotizia3()) {

                int n = numPag * 6 + 2;
                String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
                String url = "" + DataStore.getArticles().get(n).getUrl();
                String descrizione = "" + DataStore.getArticles().get(n).getDescription();
                String data = "" + DataStore.getArticles().get(n).getPublishedAt();
                String fonte = "" + DataStore.getArticles().get(n).getSource().getName();
                String urlImg = "" + DataStore.getArticles().get(n).getUrlToImage();
                String title = "" + DataStore.getArticles().get(n).getTitle();

                view.getTextAutore().setText(autore);
                view.getTextField_Fonte().setText(fonte);
                view.getTextField_Data().setText(data);
                view.getTextArea_Descrizione().setText(descrizione);
                view.getTextField_Title().setText(title);

                ImageIcon imgThisImg = null;
                try {
                    imgThisImg = ImageTool.createAutoAdjustIcon(new URL(urlImg), true);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                view.getLblImg().setIcon(imgThisImg);
                view.cambiaPanel(view.getAnteprima(), view.getNotizia());
                view.cambiaOra();
            }


            if (arg0.getSource() == view.getBtnNotizia4()) {

                int n = numPag * 6 + 3;
                String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
                String url = "" + DataStore.getArticles().get(n).getUrl();
                String descrizione = "" + DataStore.getArticles().get(n).getDescription();
                String data = "" + DataStore.getArticles().get(n).getPublishedAt();
                String fonte = "" + DataStore.getArticles().get(n).getSource().getName();
                String urlImg = "" + DataStore.getArticles().get(n).getUrlToImage();
                String title = "" + DataStore.getArticles().get(n).getTitle();

                view.getTextAutore().setText(autore);
                view.getTextField_Fonte().setText(fonte);
                view.getTextField_Data().setText(data);
                view.getTextArea_Descrizione().setText(descrizione);
                view.getTextField_Title().setText(title);

                ImageIcon imgThisImg = null;
                try {
                    imgThisImg = ImageTool.createAutoAdjustIcon(new URL(urlImg), true);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                view.getLblImg().setIcon(imgThisImg);
                view.cambiaPanel(view.getAnteprima(), view.getNotizia());
                view.cambiaOra();
            }


            if (arg0.getSource() == view.getBtnNotizia5()) {

                int n = numPag * +6 + 4;
                String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
                String url = "" + DataStore.getArticles().get(n).getUrl();
                String descrizione = "" + DataStore.getArticles().get(n).getDescription();
                String data = "" + DataStore.getArticles().get(n).getPublishedAt();
                String fonte = "" + DataStore.getArticles().get(n).getSource().getName();
                String urlImg = "" + DataStore.getArticles().get(n).getUrlToImage();
                String title = "" + DataStore.getArticles().get(n).getTitle();

                view.getTextAutore().setText(autore);
                view.getTextField_Fonte().setText(fonte);
                view.getTextField_Data().setText(data);
                view.getTextArea_Descrizione().setText(descrizione);
                view.getTextField_Title().setText(title);

                ImageIcon imgThisImg = null;
                try {
                    imgThisImg = ImageTool.createAutoAdjustIcon(new URL(urlImg), true);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                view.getLblImg().setIcon(imgThisImg);
                view.cambiaPanel(view.getAnteprima(), view.getNotizia());
                view.cambiaOra();
            }


            if (arg0.getSource() == view.getBtnNotizia6()) {

                int n = numPag * 6 + 5;
                String autore = "Autore: " + DataStore.getArticles().get(n).getAuthor();
                String url = "" + DataStore.getArticles().get(n).getUrl();
                String descrizione = "" + DataStore.getArticles().get(n).getDescription();
                String data = "" + DataStore.getArticles().get(n).getPublishedAt();
                String fonte = "" + DataStore.getArticles().get(n).getSource().getName();
                String urlImg = "" + DataStore.getArticles().get(n).getUrlToImage();
                String title = "" + DataStore.getArticles().get(n).getTitle();

                view.getTextAutore().setText(autore);
                view.getTextField_Fonte().setText(fonte);
                view.getTextField_Data().setText(data);
                view.getTextArea_Descrizione().setText(descrizione);
                view.getTextField_Title().setText(title);

                ImageIcon imgThisImg = null;
                try {
                    imgThisImg = ImageTool.createAutoAdjustIcon(new URL(urlImg), true);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                view.getLblImg().setIcon(imgThisImg);
                view.cambiaPanel(view.getAnteprima(), view.getNotizia());
                view.cambiaOra();
            }
        }
    }
}