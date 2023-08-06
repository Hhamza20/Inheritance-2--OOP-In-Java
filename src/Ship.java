public class Ship {
    private String name_of_ship;
    private String year_of_ship;
    public Ship(){

    }
    public Ship(String name_of_ship,String year_of_ship){
        this.name_of_ship=name_of_ship;
        this.year_of_ship=year_of_ship;
    }
    public void setName_of_ship(){
        this.name_of_ship=name_of_ship;
    }

    public void setYear_of_ship(String year_of_ship) {
        this.year_of_ship = year_of_ship;
    }

    public String getName_of_ship() {
        return name_of_ship;
    }

    public String getYear_of_ship() {
        return year_of_ship;
    }
    public void print(){
        System.out.println("Name of Ship: "+name_of_ship+"\tYear of Ship build: "+year_of_ship);
    }
}
