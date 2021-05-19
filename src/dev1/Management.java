package dev1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Management {
	public static List<Student> readFromFile(String FileName) throws IOException {
		List<Student> stdList = new ArrayList<Student>();
		
		FileInputStream fistream = new FileInputStream(FileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fistream));
		String srtLine;
		while((srtLine = br.readLine()) != null) {
			if(srtLine.indexOf("#") == 0) {    
				// trả về chỉ số của giá trị ký tự đã cho, nếu ko tìm thấy thì trả về -1, chỉ số được đếm từ 0
				String msv = srtLine.substring(1, srtLine.length() - 1); // trừ đi 1 ký tự
				String name = br.readLine();   // gán ký tự;
				double toan = Double.parseDouble(br.readLine()); // chuyển đổi string thành double
				double ly = Double.parseDouble(br.readLine());
				double hoa = Double.parseDouble(br.readLine());
				String dc = br.readLine();
				Student std = new Student(msv, name, dc, toan, ly, hoa);
				stdList.add(std);
			}
		}
		fistream.close();
		return stdList;
	}
	static void print(List<Student> list) {
		for (Student student : list) {
			String str = String.format("Name: %s - DTB: %.1f",student.getName(), student.DTB());
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		// read from file
		try {
			List<Student> stdList = readFromFile("input.txt");
			print(stdList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
