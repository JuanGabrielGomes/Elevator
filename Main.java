package elevador;

public class Main {
    public static void main(String[] args) {
        // Create an elevator with 10 floors and capacity of 4
        Elevator elevator = new Elevator(10, 4);

        // Go to the 5th floor
        for (int i = 0; i < 5; i++) {
            elevator.goUp();
        }
        System.out.println("Current floor: " + elevator.getCurrentFloor());

        // Let 4 people in the elevator
        for (int i = 0; i < 4; i++) {
            elevator.enter();
        }
        System.out.println("People present: " + elevator.getPeoplePresent());

        // Go to the 4th floor
        elevator.goDown();
        System.out.println("Current floor: " + elevator.getCurrentFloor());

        // Let 1 person out
        elevator.exit();
        System.out.println("People present: " + elevator.getPeoplePresent());
    }
}
