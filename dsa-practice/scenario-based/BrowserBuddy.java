package scenario_based;
import java.util.Stack;
import java.util.Scanner;

class Page {
    String url;
    Page prev;
    Page next;

    Page(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

class Tab {
    private Page current;
    private String tabName; 

    Tab(String startUrl) {
        this.current = new Page(startUrl);
        this.tabName = "Tab-" + System.currentTimeMillis() % 1000; 
    }

    public void visit(String url) {
        Page newPage = new Page(url);
        newPage.prev = current;
        if (current != null) {
            current.next = newPage;
        }
        current = newPage;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("Cannot go back. Start of history.");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("Cannot go forward. End of history.");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    public void displayCurrentPage() {
        if (current == null) {
            System.out.println("Empty Tab");
        } else {
            System.out.println("Current Page: " + current.url + " (" + tabName + ")");
        }
    }

    public String getCurrentUrl() {
        return (current != null) ? current.url : "Empty";
    }
}

public class BrowserBuddy {
    private Tab activeTab;
    private Stack<Tab> closedTabs;
    
    BrowserBuddy() {
        activeTab = new Tab("google.com"); 
        closedTabs = new Stack<>();
    }

    public void visitPage(String url) {
        activeTab.visit(url);
    }

    public void goBack() {
        activeTab.back();
    }

    public void goForward() {
        activeTab.forward();
    }

    public void closeCurrentTab() {
        System.out.println("Closing current tab (" + activeTab.getCurrentUrl() + ")");
        closedTabs.push(activeTab);
        activeTab = new Tab("new-tab"); 
        System.out.println("Opened new blank tab.");
    }

    public void restoreClosedTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore.");
            return;
        }
        activeTab = closedTabs.pop();
        System.out.println("Restored last closed tab.");
        activeTab.displayCurrentPage();
    }

    public void displayState() {
        activeTab.displayCurrentPage();
    }

    public static void main(String[] args) {
        BrowserBuddy browser = new BrowserBuddy();
        Scanner input = new Scanner(System.in);
        int choice;
        String url;

        System.out.println("BROWSER BUDDY");

        while (true) {
            System.out.println("1. Visit URL");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Current Tab");
            System.out.println("5. Restore Closed Tab (Stack)");
            System.out.println("6. View Current Page");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    url = input.nextLine();
                    browser.visitPage(url);
                    break;
                case 2:
                    browser.goBack();
                    break;
                case 3:
                    browser.goForward();
                    break;
                case 4:
                    browser.closeCurrentTab();
                    break;
                case 5:
                    browser.restoreClosedTab();
                    break;
                case 6:
                    browser.displayState();
                    break;
                case 7:
                    System.out.println("Closing Browser.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}