import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Ship S1 = new Ship("Titanic", "2023");
        CruiseShip C1 = new CruiseShip("OceanGate", "1999", 200);
        CargoShip CS = new CargoShip("Nawaz Sharif", "1990", 299);
        BattleShip BS = new BattleShip("Zardari", "1000", 22);
        ArrayList<Ship> al = new ArrayList<>();
        al.add(S1);
        al.add(C1);
        al.add(CS);
        al.add(BS);
        Iterator<Ship> iterator = al.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }

    }
}
