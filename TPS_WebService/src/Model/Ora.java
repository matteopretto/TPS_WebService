package Model;

import View.view;

/**
 * @author Oniichan
 * @data 21/04/2022
 * @project TPS_WebService
 */
public class Ora implements Runnable{

        private view view;
        public Ora(view view){
            this.view = view;
        }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                view.cambiaOra();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
