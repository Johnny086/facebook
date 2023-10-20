package generic_Utility;
import java.util.Date;
import java.util.Random;
	public class E_JavaUtility {
		
	public int generateRandoNo(int limit) {
	// Random value is passed for date and time 
	Random random = new Random();
	return random.nextInt(limit);
			
	}
	public String generateSystemDateTime() {
	Date date=new Date();
		
	//System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
	return date.toString().replace(" ", "_").replace(":", "_");
	
	}
			
}
