package epam.OOP.task.TransportClasses;

import epam.OOP.task.PassengerClasses.Passenger;
import epam.OOP.task.Printable;

import java.util.List;
import java.util.Optional;

public class RailCar implements Printable {
    private List<Passenger> passengerList;

    public void setAPassengerToList(Passenger _passenger) {
        passengerList.add(_passenger);
    }

    public Passenger getAPassengerFromList(Integer _IndexOfAPassenger) {
        return passengerList.get(_IndexOfAPassenger);
    }

    @Override
    public void print() {
        System.out.printf("Amount of passengers: %d", this.passengerList.size());
    }
}