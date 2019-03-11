package epam.OOP.task;

import epam.OOP.task.PassengerClasses.Passenger;
import epam.OOP.task.SortClasses.Sorting;
import epam.OOP.task.TransportClasses.RailCar;
import epam.OOP.task.TransportClasses.Train;

import java.util.ArrayList;

public class Manipulations {
    public static void printInfromation(Train train) {
        RailCar railCar;
        Passenger passenger;
        for(int i = 0; i < train.getAmountOfRailCars(); i++) {
            railCar = train.getARailCarElement(i);
            System.out.println("\n========Car's number is: " + (i + 1) + "========");
            for(int j = 0; j < railCar.getAmountOfPassengers(); j++) {
                passenger = railCar.getAPassengerFromList(j);

                System.out.println("\n___Passanger [" + (j + 1) + "]: " + "___");
                System.out.printf("[%d] Number of ID: ", i+1);
                System.out.println(passenger.getNumberOfID().get());
                System.out.printf("[%d] Number of Ticket: ", i+1);
                System.out.println(passenger.getTicketNumber().get());
            }
        }
    }

    public static Train completePassengerSorting(Train train) {
        RailCar railCar;
        for(int i = 0; i < train.getAmountOfRailCars(); i++) {
            railCar = train.getARailCarElement(i);
            Sorting.sortByTicket(railCar.getPassengerList());
            /*train.setARailCarElementByIndex(i, Sorting.sortPassengers(railCar, Constants.FIRST_INDEX, railCar.getAmountOfPassengers() - 1));*/
            train.setARailCarElementByIndex(i, railCar);
        }

        return train;
    }
}
