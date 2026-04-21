import java.sql.SQLOutput;
import java.util.ArrayList;
public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik){
        pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu(){
        System.out.println("------ Skład Zespołu ------");
        for (Pracownik p : pracownicy){
            System.out.println(p.toString());
        }
    }

    public double policzLacznyKoszt(){
        double suma = 0;
        for (Pracownik p : pracownicy){
            suma += p.obliczKosztMiesieczny();
        }
        return suma;
    }

    public void wypiszProgramistow(){
        System.out.println("------ Lista Programistow ------");
        for (Pracownik p : pracownicy) {
            if (p instanceof Programista) {
                Programista prog = (Programista) p;
                System.out.print(prog.getImie() + " " + prog.getNazwisko());
            }
        }
    }



}
