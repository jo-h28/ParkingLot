package Model;

public class ParkingLot {
    private Car[] parkingSlots;
    private int availableSlots;

    public ParkingLot(int size){
        parkingSlots = new Car[size];
        availableSlots = size;
        System.out.println("Created a parking lot with " + size + " slots");
    }

    public void allocateSlot(String registrationNumber, String color){
        if(availableSlots == 0){
            System.out.println("Sorry, parking lot is full");
            return;
        }
        Car new_car = new Car(registrationNumber, Color.valueOf(color));
        for(int i = 0; i < parkingSlots.length; ++i){
            if(parkingSlots[i] == null){
                parkingSlots[i] = new_car;
                availableSlots--;
                System.out.println("Allocated slot number: " + i + 1);
                break;
            }
        }
    }

    public void deallocateSlot(int slotNumber){
        parkingSlots[slotNumber - 1] = null;
        availableSlots--;
        System.out.println("Slot number " + 4 + " is free");
    }

    public void status(){
        System.out.println("Slot No.\tRegistration No\tColour");
        for(int i = 0; i < parkingSlots.length; ++i){
            if(parkingSlots[i] != null)
                System.out.println(i + 1
                        + "\t" + parkingSlots[i].getRegistration_number()
                        + "\t" + parkingSlots[i].getColor());
        }
    }

    public void searchRegistrationNumberByColor(String color){
        
    }

    public void searchSlotNumberByRegistrastionNumber(String registrationNumber){

    }

    public void searchSlotNumberByColor(String color){

    }
}
