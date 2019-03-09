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
                        + "\t" + parkingSlots[i].getRegistrationNumber()
                        + "\t" + parkingSlots[i].getColor());
        }
    }

    public void searchRegistrationNumberByColor(String color){
        StringBuilder registrationNumbersBuilder = new StringBuilder();
        for(Car car : parkingSlots){
            if(car != null){
                if(color.equals(car.getColor().name())){
                    if(!registrationNumbersBuilder.toString().equals(""))
                        registrationNumbersBuilder.append(", ");
                    registrationNumbersBuilder.append(car.getRegistrationNumber());
                }
            }
        }
        if(registrationNumbersBuilder.toString().equals(""))
            System.out.println("Not found");
        else
            System.out.println(registrationNumbersBuilder.toString());
    }

    public void searchSlotNumberByRegistrastionNumber(String registrationNumber){
        StringBuilder slotNumbersBuilder = new StringBuilder();
        for(int i = 0; i < parkingSlots.length; ++i){
            if(parkingSlots[i] != null){
                if(registrationNumber.equals(parkingSlots[i].getRegistrationNumber())){
                    if(!slotNumbersBuilder.toString().equals(""))
                        slotNumbersBuilder.append(", ");
                    slotNumbersBuilder.append(i + 1);
                }
            }
        }
        if(slotNumbersBuilder.toString().equals(""))
            System.out.println("Not found");
        else
            System.out.println(slotNumbersBuilder.toString());
    }

    public void searchSlotNumberByColor(String color){
        StringBuilder slotNumbersBuilder = new StringBuilder();
        for(int i = 0; i < parkingSlots.length; ++i){
            if(parkingSlots[i] != null){
                if(color.equals(parkingSlots[i].getColor().name())){
                    if(!slotNumbersBuilder.toString().equals(""))
                        slotNumbersBuilder.append(", ");
                    slotNumbersBuilder.append(i + 1);
                }
            }
        }
        if(slotNumbersBuilder.toString().equals(""))
            System.out.println("Not found");
        else
            System.out.println(slotNumbersBuilder.toString());
    }
}
