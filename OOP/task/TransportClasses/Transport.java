package epam.OOP.task.TransportClasses;

import epam.OOP.task.Printable;

import java.util.Optional;

public class Transport implements Printable {
    private Optional<Integer> numberOfWay;

    public void setNumberOfWay(Integer _numberOfWay) {
        this.numberOfWay = Optional.ofNullable(_numberOfWay);
    }

    public Optional<Integer> getNumberOfWay() {
        return this.numberOfWay;
    }

    @Override
    public void print() {
        System.out.println("Number of way: %d" + this.numberOfWay);
    }
}