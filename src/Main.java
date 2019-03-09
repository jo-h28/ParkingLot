import Model.ParkingLot;

public class Main {
    public static void main(String[] args) {
	    String input = "";
        ParkingLot PL = null;
        do{
            input = System.console().readLine();
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
            }
        }
        while(!input.equals("exit"));
    }
}
