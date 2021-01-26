import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {
    @Test
    public void getTrueNameTest(){
        Passenger nika = new Passenger("Nika", true);
        assertEquals("Nika", nika.getName());
    }

    @Test
    public  void getFalseNameTest(){
        Passenger lestamberi = new Passenger("Lestamberi", false);
        assertNotEquals("Elene", lestamberi.getName());
    }

    @Test
    public void haveTicketTest(){
        Passenger nika = new Passenger("Nika", true);
        assertEquals(true, nika.haveTicket());
    }

    @Test
    public void haveNoTicketTest(){
        Passenger lestamberi = new Passenger("Lestamberi", false);
        assertEquals(false, lestamberi.haveTicket());
    }

    @Test
    public void onTheTrainTest(){
        Passenger nika = new Passenger("Nika", true);
        Train train = new Train();
        train.addPassenger(nika);
        assertEquals(true, train.getPassengerList().contains(nika));
    }

    @Test
    public void notOnTheTrainTest(){
        Passenger lestamberi = new Passenger("Lestamberi", false);
        Train train = new Train();
        train.addPassenger(lestamberi);
        assertEquals(false, train.getPassengerList().contains(lestamberi));
    }
}