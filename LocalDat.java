import java.time.LocalDate;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.util.*; 
class LocalDat{
	static String Time(int month,int day,int year){
		LocalDate dt= LocalDate.of(year,month,day);
		return ""+dt.getDayOfWeek();
	}

	public static void main(String[] s){
		/*Scanner sc = new Scanner(System.in); */
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(System.getenv("C:\Users\Rahul\Desktop")));
		String[] date = bufferReader.readLine().replaceAll("\\s+$","").split(" ");
		int month = Integer.parseInt(date[0]);
		int day = Integer.parseInt(date[1]);
		int year = Integer.parseInt(date[2]);
		String result = Time(month,day,year);
		bufferWriter.write(result);
		bufferWriter.newLine();
		
	}
}