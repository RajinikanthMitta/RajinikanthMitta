package SwitchCases;

public class WeekDayChecker {
	public static void main(String[] args) 
	{
		
        String day = "Sunday"; // You can change this to any day of the week

        switch (day) 
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("uff its working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("yaa its holyday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
