package Model;

public class ParkingLot {
    private Car[] parking_slots;
    private int available_slots;

    public ParkingLot(int size){
        parking_slots = new Car[size];
        available_slots = size;
        System.out.println("Created a parking lot with " + size + " slots");
    }

    public void allocateSlot(String registration_number, String color){
        if(available_slots == 0){
            System.out.println("Sorry, parking lot is full");
            return;
        }
        Car new_car = new Car(registration_number, Color.valueOf(color));
        for(int i = 0; i < parking_slots.length; ++i){
            if(parking_slots[i] == null){
                parking_slots[i] = new_car;
                available_slots--;
                System.out.println("Allocated slot number: " + i + 1);
                break;
            }
        }
    }

    public void deallocateSlot(int slot_num){
        parking_slots[slot_num - 1] = null;
        available_slots--;
        System.out.println("Slot number " + 4 + " is free");
    }
}
