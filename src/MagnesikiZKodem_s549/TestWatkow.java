package MagnesikiZKodem_s549;

public class TestWatkow {

    public static void main(String[] args) {

        WatekPierwszy w1 = new WatekPierwszy();
        WatekDrugi w2 = new WatekDrugi();

        Thread pierwszy = new Thread(w1);
        Thread drugi = new Thread(w2);
        pierwszy.start();
        drugi.start();

    }

}
