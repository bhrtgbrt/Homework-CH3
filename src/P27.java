
public class P27
{
	public static void main(String[] args) {
		Carp27 car1 = new Carp27();
		car1.show();
		Carp27 car2 = new Carp27(1234, 25.0);
		car2.show();
	}
}

class Carp27
{
	private int num;
	private double gas;
	
	public Carp27()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Carp27(int n, double g)
	{
		
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num +"，汽油量為"+ gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}