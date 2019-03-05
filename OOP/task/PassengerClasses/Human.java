package epam.OOP.task.PassengerClasses;

import epam.OOP.task.Printable;

import java.util.Optional;

public class Human implements Printable {
    private Optional<String> numberOfID;

    public void setNumberOfID(String _numberOfID) {
        this.numberOfID = Optional.ofNullable(_numberOfID);
    }

    public Optional<String> getNumberOfID() {
        return this.numberOfID;
    }

    @Override
    public void print() {
        System.out.printf("Number of ID is: %s", this.numberOfID.get());
    }
}
