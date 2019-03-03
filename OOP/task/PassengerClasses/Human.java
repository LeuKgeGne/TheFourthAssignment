package epam.OOP.task.PassengerClasses;

import epam.OOP.task.Printable;

import java.util.Optional;

public class Human implements Printable {
    private Optional<String> name;
    private Optional<String> surname;

    public void setSurname(String _surname) {
        this.surname = Optional.ofNullable(_surname);
    }

    public void setName(String _name) {
        this.name = Optional.ofNullable(_name);
    }

    public Optional<String> getSurname() {
        return this.surname;
    }

    public Optional<String> getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.printf("Surname is: %s\nName is: %s\n",
                this.surname, this.name);
    }
}
