package src;


class vehicle{
	public void run()
	{
		System.out.println("Vehicle is Running");
	}
	
}
class car{
	public void run()
	{
		System.out.println("car is Running");
	}
}

public class grid_shift {

	public static void main(String[] args) {
		vehicle v=new vehicle();
		v.run();

	}

}
