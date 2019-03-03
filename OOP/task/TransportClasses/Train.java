package epam.OOP.task.TransportClasses;
import java.util.List;


public class Train extends Transport{
    private List<RailCar> railCarList;

    public void setARailCarElement(RailCar _railCar) {
        this.railCarList.add(_railCar);
    }

    public RailCar getARailCarElement(Integer _IndexOfACar) {
        return this.railCarList.get(_IndexOfACar);
    }

    @Override
    public void print() {
        System.out.printf("Amount of rail cars: %d\n", this.railCarList.size());
    }
}