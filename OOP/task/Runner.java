package epam.OOP.task;

import epam.OOP.task.PassengerClasses.Passenger;

public class Runner {

    public static void main(String[] args) {

    Passenger passenger = MyTinyPassengerFactory.createAPassenger();

    System.out.printf("result:\nID: %s\nTicket: %d", passenger.getNumberOfID().get(), passenger.getTicketNumber().get());
    }
}
