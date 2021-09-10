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
    @DisplayName("Testing for getManufacture() works")
    void getManufacturer() {
        assertEquals("Honda", car.getManufacturer());
    }

    @Test
    void getNumber() {
    }

    @Test
    void setNumber() {
    }

    @Test
    void getYear() {
    }

    @Test
    void getCurrentOwner() {
    }

    @Test
    void setCurrentOwner() {
    }

    @Test
    void getListOfOwners() {
    }
}