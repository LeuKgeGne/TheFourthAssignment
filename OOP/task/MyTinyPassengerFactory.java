package epam.OOP.task;

import epam.OOP.task.PassengerClasses.Passenger;
import epam.OOP.task.TransportClasses.RailCar;

import java.util.Random;

public class MyTinyPassengerFactory {
    //optional return or not??
    public static Passenger createAPassenger() {
        Passenger factoryPassenger = new Passenger();
        Random random = new Random();
        factoryPassenger.setTicketNumber(randomTicketNumber());
        factoryPassenger.setNumberOfID(convertToString());

        return factoryPassenger;
    }

    public static char randomSymbol() {
        Random random = new Random();
        return (char)(Constants.MIN_SYMBOL_NUMBER + random.nextInt(
                Constants.MAX_SYMBOL_NUMBER - Constants.MIN_SYMBOL_NUMBER));
    }

    public static int randomIDNumber() {
            Random random = new Random();
            return (int)(Constants.MIN_ID_NUMBER + random.nextInt(
                    Constants.MAX_ID_NUMBER - Constants.MIN_ID_NUMBER));
    }

    public static String convertToString() {
        return new String(String.valueOf(randomSymbol())
                + String.valueOf(randomSymbol()) + String.valueOf(randomIDNumber()));
    }

    public static int randomTicketNumber() {
        Random random = new Random();
        return (int)(Constants.MIN_TICKET_NUMBER + random.nextInt(
                Constants.MAX_TICKET_NUMBER - Constants.MIN_TICKET_NUMBER));
    }
}
