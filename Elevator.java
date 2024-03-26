package elevador;

public class Elevator {
    // Encapsulated attributes
    private int currentFloor;
    private int totalFloors;
    private int capacity;
    private int peoplePresent;

    // Constructor with parameters
    public Elevator(int totalFloors, int capacity) {
        this.currentFloor = 0;
        this.totalFloors = totalFloors;
        this.capacity = capacity;
        this.peoplePresent = 0;
    }

    // Enter method
    public void enter() {
        if (peoplePresent < capacity) {
            peoplePresent++;
        }
    }

    // Exit method
    public void exit() {
        if (peoplePresent > 0) {
            peoplePresent--;
        }
    }

    // Go up method
    public void goUp() {
        if (currentFloor < totalFloors - 1) {
            currentFloor++;
        }
    }

    // Go down method
    public void goDown() {
        if (currentFloor > 0) {
            currentFloor--;
        }
    }

    // Setters and getters for all attributes
    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPeoplePresent() {
        return peoplePresent;
    }

    public void setPeoplePresent(int peoplePresent) {
        this.peoplePresent = peoplePresent;
    }
}