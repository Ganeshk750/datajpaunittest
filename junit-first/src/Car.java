import java.util.ArrayList;

/**
 * @created: 07/09/2021 - 1:00 PM
 * @author: Ganesh
 */


public class Car {

    private String manufacturer;
    private String number;
    private int year;
    private String currentOwner;
    private ArrayList<String> listOfOwners = new ArrayList<String>();

    public Car(String manufacturer, String number, int year, String currentOwner) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.year = year;
        this.currentOwner = currentOwner;
        listOfOwners.add(currentOwner);
    }

    public String getManufacturer() { return manufacturer; }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }


    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
        listOfOwners.add(currentOwner);
    }

    public ArrayList<String> getListOfOwners() {
        return listOfOwners;
    }

}
