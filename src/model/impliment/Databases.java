package model.impliment;
import java.util.ArrayList;
import java.util.List;

import ValueObjects.Customer;

public class Databases {
	
		
		/***
		 * InitDatabases
		 * @return
		 */
		public static List<Customer> InitDatabases(){
			//Khai báo 1 biến mảng động kiểu dữ liệu Khách hàng
			List<Customer> lisCust = new ArrayList<Customer>();
			Customer oCus01 = new Customer();
			oCus01.setRollNo(100);
			oCus01.setFullName("Nguyễn Văn A");
			oCus01.setEmail("anv@gmail.com");
			oCus01.setMobile("0987643434");
			oCus01.setAddress("Hà Nội");
			
			Customer oCus02 = new Customer();
			oCus02.setRollNo(200);
			oCus02.setFullName("Trần Văn B");
			oCus02.setEmail("btv@gmail.com");
			oCus02.setMobile("0986553434");
			oCus02.setAddress("Hồ Chí Minh");
			
			Customer oCus03 = new Customer();
			oCus03.setRollNo(300);
			oCus03.setFullName("Hoàng Văn C");
			oCus03.setEmail("chv@gmail.com");
			oCus03.setMobile("098736675545");
			oCus03.setAddress("Đà Nẵng");
			
			Customer oCus04 = new Customer();
			oCus04.setRollNo(400);
			oCus04.setFullName("Phạm Văn D");
			oCus04.setEmail("dpv@gmail.com");
			oCus04.setMobile("08787458473");
			oCus04.setAddress("Hải Phòng");
			
			lisCust.add(oCus01);
			lisCust.add(oCus02);
			lisCust.add(oCus03);
			lisCust.add(oCus04);
			
			return lisCust;
		}
	}
