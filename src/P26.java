
public class P26
{
	public static void main(String[] args) {
		Carp26 car1;
		car1=new Carp26();
		
		car1.show();
	}
}

class Carp26
{
	private int num;
	private double gas;
	
	public Carp26()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.print("汽油量是:"+this.gas);
	}
}