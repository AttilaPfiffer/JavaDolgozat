package JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek {
    private Babu[][] tabla;
    private int sorrend[];
    private int babuDb;

    public LogikaiJatek() {
        super(3);
        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
    }

    public LogikaiJatek(int babuDb) {
        super(3);
        this.babuDb = babuDb;
    }

    public boolean van8FelettEro() {
        return true;
    }

    public void kezd() {
        this.babuDb = 3;
        System.out.println("Kezdés");
    }

    public void ment() {
        System.out.println("Mentés");

    }

    public void vege() {
        this.babuDb = 10;
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
