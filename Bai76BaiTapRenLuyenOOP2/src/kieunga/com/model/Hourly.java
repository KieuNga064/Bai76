package kieunga.com.model;

public class Hourly extends Employee {
	private int hourWorked;
	public void addHours(int hourWorked)
	{
		this.hourWorked=hourWorked;
	}
	public double pay()
	{
		return this.hourWorked*50;
	}
	public String toString()
	{
		return super.toString();
	}
}
