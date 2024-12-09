package model;

import java.util.Collections;

public class Tabla {
    private char[][] t;
    private char uresCella;


    public Tabla(char uresCella) {
        t = new char[8][8];
        this.uresCella = uresCella;

    }

    public void megjelenit() {
        Tabla tabla = new Tabla('#');
        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t.length; j++) {
                System.out.println(t[i][j]);
            }
        }
    }

    public void elhelyez() {

    }
}
