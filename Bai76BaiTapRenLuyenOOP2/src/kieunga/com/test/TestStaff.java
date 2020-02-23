package kieunga.com.test;

import kieunga.com.model.Employee;
import kieunga.com.model.Executive;
import kieunga.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st=new Staff();
		Employee teo=new Employee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("123");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC123");
		
		st.addStaffMember(teo);
		
		Employee ty=new Employee();
		ty.setName("Nguyễn Văn Tý");
		ty.setAddress("Quận 10");
		ty.setPhone("146");
		ty.setPayRate(0.15);
		ty.setSocialSecurityNumber("SEC146");

		st.addStaffMember(ty);
		
		Executive an=new Executive();
		an.setName("Nguyễn Văn An");
		an.setAddress("Quận 11");
		an.setPhone("789");
		an.setPayRate(0.15);
		an.setSocialSecurityNumber("SEC789");
		an.awardBonus(100);
		st.addStaffMember(ty);
		
		st.payDay();
	}

}
