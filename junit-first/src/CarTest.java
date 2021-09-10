import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @created: 08/09/2021 - 7:39 PM
 * @author: Ganesh
 */


class CarTest {

    Car car;

    @BeforeEach
    void prepareData(){
      car = new Car("Honda","ABC-123", 2021, "GANESH KUMAR");
    }

    @Test
    @DisplayName("Testing how getManufacture() method works")
    void getManufacturer() {
        assertEquals("Honda", car.getManufacturer());
    }

    @Test
    @DisplayName("Testing how getNumber() method works")
    void getNumber() {
        assertEquals("ABC-123", car.getNumber());
    }

    @Test
    @DisplayName("Testing how setNumber() method works")
    void setNumber() {
        car.setNumber("ABC-567");
        assertEquals("ABC-567", car.getNumber());
    }

    @Test
    @DisplayName("Testing how getYear() method works")
    void getYear() {
        assertEquals(2021, car.getYear());
    }

    @Test
    @DisplayName("Testing how getCurrentOwner() method works")
    void getCurrentOwner() {
        assertEquals("GANESH KUMAR", car.getCurrentOwner());
    }

    @Test
    @DisplayName("Testing how setCurrentOwner() method works")
    void setCurrentOwner() {
        car.setCurrentOwner("OWNER");
        assertEquals("OWNER", car.getCurrentOwner());
    }

    @Test
    void getListOfOwners() {
    }
}