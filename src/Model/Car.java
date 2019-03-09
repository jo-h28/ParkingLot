package Model;

public class Car {
    private String registration_number;
    private Color color;

    public Car(String registration_number, Color color) {
        this.registration_number = registration_number;
        this.color = color;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
