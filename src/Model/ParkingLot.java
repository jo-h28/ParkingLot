package Model;

public class ParkingLot {
    private Car[] parkingSlots;
    private int availableSlots;

    public ParkingLot(int size){
        parkingSlots = new Car[size];
        availableSlots = size;
        System.out.println("Created a parking lot with " + size + " slots");
    }

    public void allocateSlot(String registration_number, String color){
        if(availableSlots == 0){
            System.out.println("Sorry, parking lot is full");
            return;
        }
        Car new_car = new Car(registration_number, Color.valueOf(color));
        for(int i = 0; i < parkingSlots.length; ++i){
            if(parkingSlots[i] == null){
                parkingSlots[i] = new_car;
                availableSlots--;
                System.out.println("Allocated slot number: " + i + 1);
                break;
            }
        }
    }

    public void deallocateSlot(int slot_num){
        parkingSlots[slot_num - 1] = null;
        availableSlots--;
        System.out.println("Slot number " + 4 + " is free");
    }
    
}
