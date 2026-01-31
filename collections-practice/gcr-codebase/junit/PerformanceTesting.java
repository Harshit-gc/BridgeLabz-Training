package bridgelabz.junit;

public class PerformanceTesting {

	public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); 
        return "Task Complete";
    }
	
}
