package sneha123;

public class TC002_ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =3;
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		}
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		int j=1;
		while(j<=2)
		{
			System.out.println(j);
			j++;
		}
		int k=1;
		do
		{
			System.out.println(k);
			k++;
		}while(k<=5);
	}

}
