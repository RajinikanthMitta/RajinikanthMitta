package Sessions29_07_2024;

public class DataPrint {
	
	public void Data(int a, String b)
	{
		System.out.println("integer:" +a+ ", String:" +b);
	}
	
	public void Data (String a, int b)
	{
		System.out.println("String:" +a+ ", Integer:" +b);
		
	}
	
	public static void main(String[] args) {
		
		DataPrint d = new DataPrint();
		d.Data(12, "rajinikanth");
		d.Data("kedhar", 25);
		
		
		
	}
	

}
