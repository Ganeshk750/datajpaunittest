import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @created: 07/09/2021 - 12:38 PM
 * @author: Ganesh
 */


class MyFirstTest {

    @Test
    void getMessage() {

        MyFirst first = new MyFirst();
        assertEquals("WEL COME TO JUNIT5", first.getMessage());
    }

}