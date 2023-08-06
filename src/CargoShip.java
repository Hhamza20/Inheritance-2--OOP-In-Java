public class CargoShip extends Ship{
    private int cargo_capacity;
    public CargoShip(String name_of_ship,String year_of_ship,int cargo_capacity){
        super(name_of_ship, year_of_ship);
        this.cargo_capacity=cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }
    public void print(){
        System.out.println("Name of Ship:"+getName_of_ship()+"\tShip Cargo capacity: "+getCargo_capacity());
    }
}
