package cz.czechitas.ukol3;
import cz.czechitas.ukol3.model.*;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
        Pocitac martininPocitac = new Pocitac();
        System.out.println(martininPocitac);
        //martininPocitac.zapniSe(); //vypise sa chyba

        Procesor martininProcesor = new Procesor();
        martininProcesor.setRychlost(5_500_000_000L);
        martininProcesor.setVyrobce("Apple");

        Pamet martininaPamet = new Pamet();
        martininaPamet.setKapacita(30_000_000_000L);

        Disk martininDisk = new Disk();
        martininDisk.setKapacita(900_662_584_320L);

        martininPocitac.setCpu(martininProcesor);
        martininPocitac.setRam(martininaPamet);
        martininPocitac.setPevnyDisk(martininDisk);
        //System.out.println(martininPocitac);
        martininPocitac.zapniSe();
        //martininPocitac.zapniSe(); //vypise ze je uz zapnuty
        //System.out.println(martininPocitac);
        martininPocitac.vypniSe();
        System.out.println(martininPocitac.toString());
    }
    }
