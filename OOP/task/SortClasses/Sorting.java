package epam.OOP.task.SortClasses;

import epam.OOP.task.Constants;
import epam.OOP.task.PassengerClasses.Passenger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Sorting {
    public static ArrayList<Passenger> sortPassengers(ArrayList<Passenger> objectsList, int first_index, int second_index) {
        Iterator<Passenger> first = objectsList.listIterator(first_index);
        Iterator<Passenger> second;
        Iterator<Passenger> comparing = first;
        Passenger passenger;
        
        boolean flag;

        try {
            while(first.hasNext()) {
                int max_Ticket = first.next().getTicketNumber().get();

                flag = false;
                second = first;
                while(second.hasNext()) {
                    if(max_Ticket < (second.next().getTicketNumber().get())) {
                        comparing = second;
                        max_Ticket = (second.next().getTicketNumber().get());
                        flag = true;
                    }
                }
                if(flag) {
                    passenger = first.next();
                    ((ListIterator<Passenger>) first).set(comparing.next());
                    ((ListIterator<Passenger>) comparing).set(passenger);
                }
            }
        } catch (NoSuchElementException ex) {
            System.out.println(Constants.CATCH_END);
        }
        return objectsList;
    }
}
