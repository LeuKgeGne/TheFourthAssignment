package epam.OOP.task.TransportClasses;
import java.util.ArrayList;
import java.util.List;


public class Train extends Transport{
    private ArrayList<RailCar> railCarList = new ArrayList();

    public void setARailCarElement(RailCar _railCar) {
        this.railCarList.add(_railCar);
    }

    public void setRailCarList(ArrayList<RailCar> _railCarList) {
        this.railCarList = _railCarList;
    }

    public void setARailCarElementByIndex(int index, RailCar _railCar) {
        this.railCarList.add(index, _railCar);
    }

    public RailCar getARailCarElement(Integer _IndexOfACar) {
        return this.railCarList.get(_IndexOfACar);
    }

    public byte getAmountOfRailCars() {
        return (byte)railCarList.size();
    }

    @Override
    public void print() {
        System.out.printf("Amount of rail cars: %d\n", this.railCarList.size());
    }
}