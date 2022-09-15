package hu.petrik.pontoop;

import hu.petrik.pontoop.pont.Circle;
import hu.petrik.pontoop.pont.Pont;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(1,2);
        Pont p3 = new Pont(-2,-1);
        Pont p4 = new Pont(100);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }
        for (Pont malacka: pontok) {
            System.out.println(malacka);
        }
        int legtavolabbesopontIndex = 0;
        for (int i = 0; i < pontok.length; i++) {
            if (pontok[legtavolabbesopontIndex].getOrigotolMertTavolsag() <pontok[i].getOrigotolMertTavolsag()) {
                legtavolabbesopontIndex = i;
            }
        }
        System.out.printf("A legtavolabbi pont az origotól a(z) %d, kordinátái: %s. origótól mért távolsága: %3f",
                (legtavolabbesopontIndex+1),pontok[legtavolabbesopontIndex],
                pontok[legtavolabbesopontIndex].getOrigotolMertTavolsag());

        Pont pontocska1 = new Pont(3,-5);
        Pont pontocska2 = new Pont(3,2);
        System.out.println(" ");
        System.out.println(pontocska1.ketPontTavolsag(pontocska2));
        System.out.println(pontocska1.elhelyezkedes());
        Circle kor1 = new Circle(p1, 4);
        System.out.println(kor1);
    }
}
