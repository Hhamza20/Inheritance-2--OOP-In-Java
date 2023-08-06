public class CruiseShip extends Ship{
    private int number_of_passengers;
    public CruiseShip(String name_of_ship,String year_of_ship,int number_of_passengers){
        super(name_of_ship, year_of_ship);
        this.number_of_passengers=number_of_passengers;
    }

    public void setNumber_of_passengers(int number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    public int getNumber_of_passengers() {
        return number_of_passengers;
    }
    public void print(){
        super.print();
        System.out.println("Maximum Number of passengers: "+number_of_passengers);
    }
}
