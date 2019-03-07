package epam.OOP.task.SortClasses;

import epam.OOP.task.Constants;
import epam.OOP.task.PassengerClasses.Passenger;
import epam.OOP.task.TransportClasses.RailCar;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Sorting {
    public static RailCar sortPassengers(RailCar railCar, /*ArrayList<Passenger> objectsList,*/ int first_index, int second_index) {
        ListIterator<Passenger> first = railCar.getPassengerList().listIterator(first_index);
        ListIterator<Passenger> second  = railCar.getPassengerList().listIterator(first_index);
        ListIterator<Passenger> comparing = null;
        Passenger passenger;
        int amount = railCar.getPassengerList().size();

        boolean flag;

        try {
            while(amount > 0) {
                int max_Ticket = first.next().getTicketNumber().get(); // added previous
                first = railCar.getPassengerList().listIterator(first.previousIndex());
                flag = false;

                second = railCar.getPassengerList().listIterator(first.nextIndex() + 1);

                while(second.hasNext()) {
                    if(max_Ticket < (second.next().getTicketNumber().get())) {
                        second = railCar.getPassengerList().listIterator(second.previousIndex());
                        comparing = second;
                        max_Ticket = (second.next().getTicketNumber().get());
                        second = railCar.getPassengerList().listIterator(second.previousIndex());
                        flag = true;
                    }
                }
                if(flag && first.hasNext() && comparing.hasNext()) {
                    passenger = first.next();
                    /*first = railCar.getPassengerList().listIterator(first.previousIndex());*/
                    first.previous();
                    first.set(comparing.next());
                    /*comparing = railCar.getPassengerList().listIterator(comparing.previousIndex());*/
                    comparing.previous();
                    comparing.set(passenger);
                }
                amount--;
            }
        } catch (NoSuchElementException ex) {
            System.out.println(Constants.CATCH_END);
        }
        return railCar;
    }
}
