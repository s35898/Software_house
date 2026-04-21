public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;


    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny(){
        double koszt = getStawkaBazowa();
        if (czyAutomatyzujacy){
            koszt += getStawkaBazowa() * 1.10;
        }
        if (liczbaScenariuszy>5){
            koszt += 25.0;
        }
        return koszt;
    }

    @Override
    public String przedstawSie(){
        String rola = czyAutomatyzujacy ? "Tester Automatyzujący" : "Tester Manualny";
        return super.przedstawSie() + "rola: ";
    }

    public void uruchomRaportTestow(){
        System.out.println("Uruchamianie raportu dla: " + liczbaScenariuszy + " scenariuszy testowych");
    }

}
