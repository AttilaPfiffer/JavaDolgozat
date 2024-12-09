package JatekProgram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
    }

    public Babu(int ero, String szin) {
        this.ero = 1;
        this.szin = szin;

        if (ero >= 1 && ero <= 9) {
            this.ero = ero;
        }
        }  



    }



}
