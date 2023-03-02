package lesson4;

import static java.lang.System.out; 
enum HomersekletSkala {CELSIUS, FAHRENHEIT, KELVIN, RÉAUMUR};

public class classes {
    public static void main(String[] args) { 
        final String Formatum = "%5.2f %s -fok\n"; 
        Homer hom = new Homer(); 
        out.printf(Formatum, hom.getSzam(),hom.getSkala()); 
        hom = new Homer(25.6); 
        out.printf(Formatum, hom.getSzam(),hom.getSkala()); 
        hom = new Homer(HomersekletSkala.FAHRENHEIT); 
        out.printf(Formatum, hom.getSzam(),hom.getSkala()); 
        hom = new Homer(2.73, HomersekletSkala.KELVIN); 
        out.printf(Formatum, hom.getSzam(),hom.getSkala()); 
    }    
} 
class Homer { 
    private double szam; 
    private HomersekletSkala skala; public Homer() { 
        szam = 12.0; skala = HomersekletSkala.CELSIUS; 
    } 
    public Homer(double szam) { 
        this.szam = szam; skala = HomersekletSkala.RÉAUMUR; 
    } 
    public Homer(HomersekletSkala skala) { 
        szam = 9.8; this.skala = skala; 
    } 
    public Homer(double szam, HomersekletSkala skala) { 
        this.szam = szam; this.skala = skala; 
    } 
    public double getSzam() { return szam; } 
    public HomersekletSkala getSkala() { return skala; } 
} 