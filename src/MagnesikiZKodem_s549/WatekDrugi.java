package MagnesikiZKodem_s549;

public class WatekDrugi implements Runnable {

    Sumator s = Sumator.getSumator();

    @Override
    public void run() {

        for (int x = 0; x < 99; x++) {
            s.aktualizujLicznik(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Drugi - " + s.getLicznik());

    }

}
