/**
 * 
 */
package dev1;

/**
 * @author QUANG-CNTT
 *
 */
public class Student {
	String msv, name, dc;
	double toan,ly,hoa;
	
	public Student(String msv, String name, String dc, double toan, double ly, double hoa) {
		super();
		this.name = name;
		this.dc = dc;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public double DTB() { 
		return (toan + ly + hoa) / 3;
	}
	
}
