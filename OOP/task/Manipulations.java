package epam.OOP.task;

import epam.OOP.task.PassengerClasses.Passenger;
import epam.OOP.task.TransportClasses.RailCar;
import epam.OOP.task.TransportClasses.Train;

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
}
