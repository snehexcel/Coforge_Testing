package sneha123;

public class TC001_Variables {
	private static double width =20;
	private static double height = 10;
	private static double depth = 5;
	private static int boxid;
	
	
	public static double volume()
	{
		double temp = 0;
		try {
		    temp = width*height*depth;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("volume:" + volume());
		
	}

}
