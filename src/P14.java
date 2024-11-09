
public class P14
{
	public static void main(String[] args) {
		Carp14 car1;
		car1=new Carp14();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNum(number);
		car1.setGas(gasoline);
	}
}

class Carp14
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
}