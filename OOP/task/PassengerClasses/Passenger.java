package epam.OOP.task.PassengerClasses;

import java.util.Optional;

public class Passenger extends Human {
    private Optional<Integer> ticketNumber;

    public void setTicketNumber(Integer _ticketNumber) {
        this.ticketNumber = Optional.ofNullable(_ticketNumber);
    }

    public Optional<Integer> getTicketNumber() {
        return this.ticketNumber;
    }

    @Override
    public void print() {
        System.out.printf("Ticket number: %d", this.ticketNumber);
    }
}
