
public class P31
{
	public static void main(String[] args) {
		Carp31.showSum();
		Carp31 car1 = new Carp31();
		car1.setCar(1234, 20.5);;
		Carp31 car2 = new Carp31();
		car2.setCar(2345, 30.5);;
	}
}

class Carp31
{
	public static int sum = 0;
	private int num;
	private double gas;
	
	public Carp31()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num +"，汽油量為"+ gas);
	}
	
	public static void showSum()
	{
		System.out.println("車子總共有"+ sum +"台");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}