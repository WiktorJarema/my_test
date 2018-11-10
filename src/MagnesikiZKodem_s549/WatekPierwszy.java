package MagnesikiZKodem_s549;

public class WatekPierwszy implements Runnable {

    Sumator s = Sumator.getSumator();

    @Override
    public void run() {

        for (int x = 0; x < 98; x++) {
            s.aktualizujLicznik(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Counter: " + s.getCounter());
        System.out.println("Pierwszy - " + s.getLicznik());

    }

}
