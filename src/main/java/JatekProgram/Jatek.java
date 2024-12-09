package JatekProgram;

public abstract class Jatek{
    private static int jatekDb = 0;


    public Jatek(int jatekDb) {
        this.jatekDb = jatekDb + 1;
    }

    public static int getJatekDb() {
        return jatekDb;
    }

    public void kezd() {

    }

    public void ment() {

    }

    public void vege() {


    }
}
