package MagnesikiZKodem_s549;

//import org.apache.commons.lang3.StringUtils;



public class Sumator {

    private int licznik = 0;
    private int counter = 0;
    private static Sumator s = new Sumator();
    private static Sumator s2 = new Sumator();

    private Sumator() {
        // private constructor
    }

    public static Sumator getSumator() {
        return s;
    }

    public int getCounter() {
        return counter;
    }

    public int getLicznik() {
        return licznik;
    }

    public void aktualizujLicznik(int wart) {
        licznik += wart;
        counter++;
    }



}
