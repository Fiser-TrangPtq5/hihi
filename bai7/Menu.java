package bai7;

public class Menu {
	String ten;
	Menu[] menuCon;

	public Menu(String a) {
		this.ten = a;
		// TODO Auto-generated constructor stub
	}

	public void in() {
		System.out.println(ten);
		if (menuCon != null) {
			for (int i = 0; i < menuCon.length; i++) {
				System.out.println(menuCon[i].ten);
			}

		}

	}

	public static Menu loadMenu() {
		Menu a = new Menu("Quynh Trang");
		String[] b = LoadFile.vanBan("menu.txt");
		Menu[] aCon = new Menu[5];
		for (int i = 0; i < 5; i++) {
			aCon[i] = new Menu(b[i]);
		}
		a.menuCon = aCon;
		Menu[] conNhap = new Menu[5];
		for (int i = 0; i < 5; i++) {
			conNhap[i] = new Menu(b[i + 5]);

		}
		aCon[0].menuCon = conNhap;
		Menu[] conXuat = new Menu[6];
		for (int i = 0; i < 6; i++) {
			conXuat[i] = new Menu(b[i + 10]);

		}
		aCon[1].menuCon = conXuat;
		Menu[] conQuanLyGia = new Menu[4];
		for (int i = 0; i < 4; i++) {
			conQuanLyGia[i] = new Menu(b[i + 16]);

		}
		aCon[2].menuCon = conQuanLyGia;
		Menu[] conInHoaDon = new Menu[4];
		for (int i = 0; i < 4; i++) {
			conInHoaDon[i] = new Menu(b[i + 20]);

		}
		aCon[3].menuCon = conInHoaDon;
		//aCon[0].in();
		return a;
	}
	public static void main(String[] args) {
		Menu d=loadMenu();
		d.in();
	}

}
