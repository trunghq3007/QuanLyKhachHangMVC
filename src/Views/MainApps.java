package Views;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Controllers.CustomerController;
import Ultils.BaseUtils;
import ValueObjects.Customer;

public class MainApps {
	static Connection oConnection;
	static CustomerController mCustomerController;

	public static void main(String[] args) {
		String sValue;
		boolean isValid = false;
		// Khai báo 1 biến mảng động kiểu dữ liệu Khách hàng
		List<Customer> lisCust = new ArrayList<Customer>();

		Scanner sc = new Scanner(System.in);
		do {
			TableOfContent();
			sValue = sc.nextLine();
			byte bResult = CheckInfo(sValue);

			switch (bResult) {
			case 0: {
				byte bOption = Byte.parseByte(sValue);
				switch (bOption) {
				case 1: {
					Input(lisCust);
					isValid = true;
				}
					break;
				case 2: {
					Output(lisCust);
					isValid = true;
				}
					break;
				case 3: {
					ExecuteOf(lisCust, (byte) 0);
					isValid = true;
				}
					break;
				case 4: {
					ExecuteOf(lisCust, (byte) 1);
					isValid = true;
				}
					break;
				case 5: {
					ExecuteOf(lisCust, (byte) 2);
					isValid = true;
				}
					break;
				case 6:
					isValid = false;
					break;
				}
			}
				break;
			case 1:
				System.out.println("- Bạn cần phải nhập vào giá trị.");
				break;
			case 2:
				System.out.println("- Giá trị bạn nhập không phải là kiểu số [0-9].");
				break;
			case 3:
				System.out.println("- Giá trị cần nằm trong khoảng [1-3].");
				break;
			}
			if (bResult > 0)
				isValid = true;
		} while (isValid);
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi!!!");
	}

	static void Input(List<Customer> lisCust) {
		// 1. Yêu cầu cung cấp thông tin về số kh
		System.out.println("- Bạn cần nhập bao nhiêu khách hàng?");
		Scanner sc = new Scanner(System.in);
		byte bNumber = sc.nextByte();

		for (int i = 0; i < bNumber; i++) {
			// 2. Khai báo danh sách đối tượng
			Customer oCustomer = new Customer();
			// Customer oCus02 = new Customer(100, "Mr A",
			// "anv@gmail.com", "098888888", "Hà Nội");
			// Customer oCus03;

			// 3. Sử dụng kiến thức về Scanner để yêu cầu người dùng cung cấp thông tin
			// đầy đủ cho chúng ta.
			System.out.println("- Nhập thông tin cho KH thứ: " + (i + 1));
			System.out.println("- Mời nhập mã khách hàng?");
			oCustomer.setRollNo(sc.nextInt());
			sc.nextLine();
			System.out.println("- Mời nhập họ và tên của bạn?");
			oCustomer.setFullName(sc.nextLine());
			System.out.println("- Mời nhập thư điện tử?");
			oCustomer.setEmail(sc.nextLine());
			System.out.println("- Mời nhập điện thoại?");
			oCustomer.setMobile(sc.nextLine());
			System.out.println("- Địa chỉ của khách hàng?");
			oCustomer.setAddress(sc.nextLine());

			// 4. Đưa đối tượng khách hàng vào mảng đối tượng khách hàng
			if (lisCust.size() <= 0) {
				if (mCustomerController == null)
					mCustomerController = new CustomerController(oConnection);
				try {
					lisCust.addAll(mCustomerController.GetAll());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				if (mCustomerController.IsExists(lisCust, oCustomer.getRollNo())) {
					short shOpt = (short) JOptionPane.showConfirmDialog(null,
							"Khách hàng đã tồn tại trên hệ thống." + " Bạn có muốn ghi đè khách hàng này");
					if (shOpt == 0) {
						if (mCustomerController.RelapceData(lisCust, oCustomer))
							System.out.println("- Ghi đè thành công!");
						else
							System.out.println("- Ghi đè thất bại!");
					}
				} else
					lisCust.add(oCustomer);
			}
			System.out.println(String.format("- Hiện có %s khách hàng trên hệ thống!", lisCust.size()));
		}
		System.out.println("Toàn bộ khách hàng đã được lưu trên hệ thống!!!");
	}

	static void Output(List<Customer> lisCust) {
		if (lisCust.size() > 0) {
			for (Customer oCust : lisCust) {
				// Hiển thị thông tin của khách hàng ra ngoài
				System.out.println("- Mã khách hàng: " + oCust.getRollNo());
				System.out.println("- Tên khách hàng: " + oCust.getFullName());
				System.out.println("- Thư điện tử của khách hàng: " + oCust.getEmail());
				System.out.println("- Điện thoại của khách hàng: " + oCust.getMobile());
				System.out.println("- Địa chỉ của khách hàng: " + oCust.getAddress());
			}
		} else {
			if (mCustomerController == null)
				mCustomerController = new CustomerController(oConnection);
			try {
				lisCust.addAll(mCustomerController.GetAll());
				for (Customer oCust : lisCust) {
					// Hiển thị thông tin của khách hàng ra ngoài
					System.out.println("- Mã khách hàng: " + oCust.getRollNo());
					System.out.println("- Tên khách hàng: " + oCust.getFullName());
					System.out.println("- Thư điện tử của khách hàng: " + oCust.getEmail());
					System.out.println("- Điện thoại của khách hàng: " + oCust.getMobile());
					System.out.println("- Địa chỉ của khách hàng: " + oCust.getAddress());
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/***
	 * Thực thi các nghiệp vụ: Insert - Update - Delete
	 * 
	 * @param lisCust
	 * @param bOpt
	 *            = 0: Insert
	 * @param bOpt
	 *            = 1: Update
	 * @param bOpt
	 *            = 2: Delete
	 */
	static void ExecuteOf(List<Customer> lisCust, byte bOpt) {
		if (mCustomerController == null)
			mCustomerController = new CustomerController(oConnection);
		for (Customer obj : lisCust) {
			if (bOpt > 0 && bOpt < 2) {
				try {
					mCustomerController.InsertUpdateData(obj, bOpt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				try {
					mCustomerController.DeleteDataByID(obj);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thực thi nghiệp vụ thành công!");
	}

	static void TableOfContent() {
		System.out.println("--- Table of Content ---");
		System.out.println("1. Nhập thông tin khách hàng?");
		System.out.println("2. Hiển thị danh sách khách hàng?");
		System.out.println("3. Thêm danh sách khách hàng và CSDL?");
		System.out.println("4. Cập nhật danh sách khách hàng?");
		System.out.println("5. Xóa danh sách khách hàng?"); // buddy sort, insertion sort, selection sort
		System.out.println("6. Thoát chương trình?");
		System.out.println("==> Input?");
	}

	/*
	 * 0 - Thỏa mãn các điều kiện. 1 - Báo lỗi do không nhập giá trị. 2 - Báo lỗi do
	 * sai kiểu dữ liệu [0-9]. 3 - Báo lỗi do sai khoảng giá trị cho phép [1-3].
	 */
	static byte CheckInfo(String sValue) {
		if (!BaseUtils.IsEmpty(sValue))
			if (BaseUtils.IsNumeric(sValue)) {
				byte bValue = Byte.parseByte(sValue);
				if (BaseUtils.IsSatisfy(bValue))
					return 0;
				else
					return 3;
			} else
				return 2;
		else
			return 1;
	}
}
