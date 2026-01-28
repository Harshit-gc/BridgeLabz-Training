package scenario_based;

import java.util.Scanner;

class Stage {
    String status;
    String location;
    Stage next;

    Stage(String status, String location) {
        this.status = status;
        this.location = location;
        this.next = null;
    }
}

class DeliveryChain {
    private Stage head;

    DeliveryChain() {
        this.head = null;
    }

    public void addStage(String status, String location) {
        Stage newStage = new Stage(status, location);
        if (head == null) {
            head = newStage;
        } else {
            Stage temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStage;
        }
        System.out.println("Update Added: " + status + " at " + location);
    }

    public void insertCheckpoint(String afterStatus, String newStatus, String newLocation) {
        Stage temp = head;
        while (temp != null) {
            if (temp.status.equalsIgnoreCase(afterStatus)) {
                Stage newStage = new Stage(newStatus, newLocation);
                newStage.next = temp.next;
                temp.next = newStage;
                System.out.println("Checkpoint Inserted: " + newStatus + " after " + afterStatus);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Error: Status '" + afterStatus + "' not found.");
    }

    public void trackParcel() {
        System.out.println("PARCEL TRACKING HISTORY");
        if (head == null) {
            System.out.println("No tracking information available.");
            return;
        }

        Stage temp = head;
        while (temp != null) {
            System.out.println(" [ " + temp.status + " ] @ " + temp.location);
            if (temp.next != null) {
                System.out.println("      |");
                System.out.println("      v");
            }
            temp = temp.next;
        }
    }

    public void reportLost() {
        if (head == null) return;
        
        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        if (!temp.status.equalsIgnoreCase("Delivered")) {
            System.out.println("ALERT: Parcel tracking stops at '" + temp.status + "'. Status: LOST/DELAYED.");
        } else {
            System.out.println("Status: Parcel successfully delivered.");
        }
    }
}

public class ParcelTracker {
    public static void main(String[] args) {
        DeliveryChain tracker = new DeliveryChain();
        Scanner input = new Scanner(System.in);
        int choice;
        String status, location, after;

        System.out.println("PARCEL TRACKER SYSTEM");

        tracker.addStage("Packed", "Warehouse A");
        tracker.addStage("Shipped", "Distribution Center");

        while (true) {
            System.out.println("1. Add Tracking Update");
            System.out.println("2. Insert Checkpoint (Intermediate)");
            System.out.println("3. View Tracking Chain");
            System.out.println("4. Check Delivery Status");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Status: ");
                    status = input.nextLine();
                    System.out.print("Enter Location: ");
                    location = input.nextLine();
                    tracker.addStage(status, location);
                    break;
                case 2:
                    System.out.print("Insert after which status? ");
                    after = input.nextLine();
                    System.out.print("Enter New Status: ");
                    status = input.nextLine();
                    System.out.print("Enter New Location: ");
                    location = input.nextLine();
                    tracker.insertCheckpoint(after, status, location);
                    break;
                case 3:
                    tracker.trackParcel();
                    break;
                case 4:
                    tracker.reportLost();
                    break;
                case 5:
                    System.out.println("Exiting Parcel Tracker.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
