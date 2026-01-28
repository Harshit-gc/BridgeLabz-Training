package scenario_based;
import java.util.Scanner;

class Vehicle {
    int id;
    Vehicle next;
    
    Vehicle(int id) {
        this.id = id;
        this.next = null;
    }
}

class WaitingQueue {
    private int[] arr;
    private int front, rear, capacity, count;
    WaitingQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(int vehicleID) {
        if (isFull()) {
            System.out.println(">> [QUEUE OVERFLOW] Waiting line is full! Vehicle " + vehicleID + " turned away.");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = vehicleID;
        count++;
        System.out.println(">> Vehicle " + vehicleID + " joined the waiting queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println(">> [QUEUE UNDERFLOW] No vehicles waiting to enter.");
            return -1;
        }
        int vehicleID = arr[front];
        front = (front + 1) % capacity;
        count--;
        return vehicleID;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.print("   [Empty]");
        } else {
            int tempFront = front;
            for (int i = 0; i < count; i++) {
                System.out.print("[" + arr[tempFront] + "] ");
                tempFront = (tempFront + 1) % capacity;
            }
        }
        System.out.println();
    }
}

class Roundabout {
    private Vehicle head;
    public Roundabout() {
        head = null;
    }
    public void enterRoundabout(int id) {
        Vehicle newVehicle = new Vehicle(id);
        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        System.out.println(">> Vehicle " + id + " has entered the Roundabout.");
    }

    public void exitRoundabout(int id) {
        if (head == null) {
            System.out.println(">> Roundabout is empty.");
            return;
        }
        Vehicle curr = head;
        Vehicle prev = null;
        if (curr.id == id) {
            if (curr.next == head) {
                head = null;
                System.out.println(">> Vehicle " + id + " exited. Roundabout is now empty.");
                return;
            }
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head = head.next;
            System.out.println(">> Vehicle " + id + " exited the Roundabout.");
            return;
        }

        prev = head;
        curr = head.next;
        while (curr != head) {
            if (curr.id == id) {
                prev.next = curr.next;
                System.out.println(">> Vehicle " + id + " exited the Roundabout.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println(">> Vehicle " + id + " not found in the Roundabout.");
    }

    public void displayRoundabout() {
        System.out.print("Roundabout: ");
        if (head == null) {
            System.out.print("No cars circulating.");
        } else {
            Vehicle temp = head;
            do {
                System.out.print("(" + temp.id + ") -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.print("(Back to Start)");
        }
        System.out.println();
    }
}

public class TrafficManager {
    public static void main(String[] args) {
        WaitingQueue queue = new WaitingQueue(5);
        Roundabout trafficCircle = new Roundabout();
        Scanner input = new Scanner(System.in);
        int choice, id;
        System.out.println("=== SMART TRAFFIC MANAGER SYSTEM ===");

        while (true) {
            System.out.println("1. Car Arrives (Join Queue)");
            System.out.println("2. Move Car from Queue to Roundabout");
            System.out.println("3. Car Exits Roundabout");
            System.out.println("4. View Traffic State");
            System.out.println("5. Exit Simulation");
            System.out.print("Enter choice: ");
            
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle ID: ");
                    id = input.nextInt();
                    queue.enqueue(id);
                    break;
                case 2:
                    id = queue.dequeue();
                    if (id != -1) {
                        trafficCircle.enterRoundabout(id);
                    }
                    break;
                case 3:
                    System.out.print("Enter Vehicle ID to exit: ");
                    id = input.nextInt();
                    trafficCircle.exitRoundabout(id);
                    break;
                case 4:
                    System.out.println("CURRENT STATUS");
                    System.out.print("Waiting Queue: ");
                    queue.displayQueue();
                    trafficCircle.displayRoundabout();
                    break;
                case 5:
                    System.out.println("Shutting down Traffic Manager.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}