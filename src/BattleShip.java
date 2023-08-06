public class BattleShip extends Ship{
    private int total_number_of_missiles;
    public BattleShip(String name_of_ship,String year_of_ship,int total_number_of_missiles){
        super(name_of_ship, year_of_ship);
        this.total_number_of_missiles=total_number_of_missiles;
    }

    public void setTotal_number_of_missiles(int total_number_of_missiles) {
        this.total_number_of_missiles = total_number_of_missiles;
    }

    public int getTotal_number_of_missiles() {
        return total_number_of_missiles;
    }
    public void print(){
        System.out.println("Name of Ship:"+getName_of_ship()+"\tShip Missile capacity: "+getTotal_number_of_missiles());
    }
}
