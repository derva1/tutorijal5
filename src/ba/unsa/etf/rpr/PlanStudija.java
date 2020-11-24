package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class PlanStudija {
    ArrayList<Predmet> izbornipredmeti;
    ArrayList<Predmet> obaveznipredmeti;
    public PlanStudija(ArrayList<Predmet> izbornipredmeti,
            ArrayList<Predmet> obaveznipredmeti){
        this.izbornipredmeti=izbornipredmeti;
        this.obaveznipredmeti=obaveznipredmeti;
    }
}
