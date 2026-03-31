package extras;
import java.time.*;

public class DifferentTimeZones {
	public static void main(String[] args) {
		ZonedDateTime IST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(IST);
		ZonedDateTime PST = ZonedDateTime.now(ZoneId.of("US/Pacific"));
		System.out.println(PST);
		ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("Etc/GMT"));
		System.out.println(GMT);
	}
}
