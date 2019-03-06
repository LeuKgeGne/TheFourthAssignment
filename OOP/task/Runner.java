package epam.OOP.task;

import epam.OOP.task.PassengerClasses.Passenger;
import epam.OOP.task.TransportClasses.RailCar;
import epam.OOP.task.TransportClasses.Train;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
       /* byte changer = -1;*/
        Train train = null;
        boolean process = true;

        while(process) {
            switch (JustMenu.variants(/*changer*/scanner)) {
                case 1: {
                    train = MyTinyTrainFactory.createTheTrain();
                } break;
                case 2: {
                    if(train != null) {
                        Manipulations.printInfromation(train);
                    }
                    else {
                        System.out.println(Constants.TRAIN_IS_EMPTY);
                    }
                } break;
                case 0: {
                    process = false;
                } break;
            }
            /*Runtime.getRuntime().exec("cls");*/
        }
        scanner.close();





    }
}
