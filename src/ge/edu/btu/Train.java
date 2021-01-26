package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final List<Passenger> passengerList = new ArrayList<>();

    public void addPassenger(Passenger passenger){
        if(passenger.haveTicket()){
            passengerList.add(passenger);
        }
    }

    public List<Passenger> getPassengerList(){
        return passengerList;
    }
}
