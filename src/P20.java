
public class P20
{
	public static void main(String[] args) {
		Carp20 car1;
		car1=new Carp20();
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
	}
}

class Carp20
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.print("汽油量是:"+this.gas);
	}
}