package tuan.Tuan3.Bai8;

public class CD {

	private String maCD;
	private String tuaCD;
	private String caSy;
	private int soBaiHat;
	private float giaThanh;

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public String getCaSy() {
		return caSy;
	}

	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) throws Exception {
		if (soBaiHat > 0) {
			this.soBaiHat = soBaiHat;
		} else {
			throw new Exception("So bai hat phai lon hon 0");
		}
	}

	public float getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}

	// Constructor khong tham so
	public CD() {
	}

	// Constructor co tham so
	public CD(String maCD, String tuaCD, String caSy, int soBaiHat, float giaThanh) throws Exception {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.setSoBaiHat(soBaiHat);
		this.giaThanh = giaThanh;
	}

	// In tieu de
	public static void tieuDe() {
		System.out.println("IN DANH SACH CD");

		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}

		System.out.println();

		String s = String.format(
				"|%10s|%10s|%10s|%10s|%10s|%10s|",
				"Ma CD",
				"Tua CD",
				"Ca Sy",
				"So Bai",
				"Don Gia",
				"Thanh Tien");

		System.out.println(s);

		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}

		System.out.println();
	}

	@Override
	public String toString() {
		return String.format(
				"|%10s|%10s|%10s|%10d|%10.2f|%10.2f|",
				maCD,
				tuaCD,
				caSy,
				soBaiHat,
				giaThanh,
				giaThanh * soBaiHat);
	}
}
