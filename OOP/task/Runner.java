package epam.OOP.task;

import epam.OOP.task.SortClasses.Sorting;
import epam.OOP.task.TransportClasses.Train;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Runner {

    private static final Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Train train = null;
        boolean process = true;

        while(process) {
            switch (JustMenu.variants(scanner)) {
                case 1: {
                    train = MyTinyTrainFactory.createTheTrain();
                    logger.info(Constants.CREAT_TEXT);
                } break;
                case 2: {
                    if(train != null) {
                        Manipulations.printInfromation(train);
                        logger.info(Constants.PRINT_TEXT);
                    }
                    else {
                        System.out.println(Constants.TRAIN_IS_EMPTY);
                        logger.warning(Constants.PRINT_E_TEXT);
                    }
                } break;
                case 3: {
                    if(train != null) {
                        Manipulations.completePassengerSorting(train);
                        logger.info(Constants.SORT_TEXT);
                        ;
                    }
                    else {
                        System.out.println(Constants.TRAIN_IS_EMPTY);
                        logger.info(Constants.SORT_E_TEXT);
                    }
                } break;
                case 0: {
                    process = false;
                    logger.info(Constants.END_TEXT);
                } break;
            }
        }
        scanner.close();
    }
}
