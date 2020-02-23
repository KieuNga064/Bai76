package kieunga.com.model;

public class Executive extends Employee {

	private double bonus;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void awardBonus(double bonus)
	{
		this.bonus=bonus;
		System.out.println("Lãnh bonus= "+bonus);
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay()+this.bonus;
	}
}
