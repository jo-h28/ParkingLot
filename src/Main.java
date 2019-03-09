import Model.ParkingLot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        File fileInput;
        String input = null;
        ParkingLot PL = null;
        if(args.length == 0) {
            scanner = new Scanner(System.in);
        }
        else{
            fileInput = new File(args[0]);
            try {
                scanner = new Scanner(fileInput);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        do {
            if(scanner.hasNextLine())
                input = scanner.nextLine();
            else{
                if(args.length != 0)
                    break;
                while(!scanner.hasNextLine());
            }
            String[] params = input.split(" ");
            switch (params[0]) {
                case "create_parking_lot":
                    PL = new ParkingLot(Integer.parseInt(params[1]));
                    break;
                case "park":
                    if (PL != null)
                        PL.allocateSlot(params[1], params[2]);
                    break;
                case "leave":
                    if (PL != null)
                        PL.deallocateSlot(Integer.parseInt(params[1]));
                    break;
                case "status":
                    if (PL != null)
                        PL.status();
                    break;
                case "registration_numbers_for_cars_with_colour":
                    if (PL != null)
                        PL.searchRegistrationNumberByColor(params[1]);
                    break;
                case "slot_numbers_for_cars_with_colour":
                    if (PL != null)
                        PL.searchSlotNumberByColor(params[1]);
                    break;
                case "slot_number_for_registration_number":
                    if (PL != null)
                        PL.searchSlotNumberByRegistrastionNumber(params[1]);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Command not recognized.");
                    break;
            }
        }
        while (!input.equals("exit"));
    }
}
