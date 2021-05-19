package dev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Management {
	// ghi dữ liệu
//	public static void writeFile(String fileName) throws IOException {
//
//		FileWriter fw = new FileWriter("input.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		for(int i=0; i<5; i++) {
//			bw.write("Dong " + i + "\n");
//		}
//		bw.close();
//		fw.close();
//	}

	// đọc dữ liệu 
	public static void redFile(String fileName) throws IOException {
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		String srtLine;
		while((srtLine = br.readLine()) != null) {
			System.out.println(srtLine);
		}
	}


	public static void main(String[] args) {
		
		try {
//			writeFile("input.txt");   // ghi dữ liệu
			redFile("input.txt");    // đọc dữ liệu
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào danh sách của sinh viên: ");
		List<Person> personList = new ArrayList<Person>();   // khởi tạo list chỉ ra kiểu dữ liệu
		Person p1 = new Person("Quang", 9);
		personList.add(p1);
		Person p2 = new Person("Van", 8);
		personList.add(p2);
		Person p3 = new Person("Le", 7);
		personList.add(p3);
		System.out.println(personList.size());
		//		personList.addAll(personList);
		// đọc từng get
		Person p = personList.get(0);
		System.out.println(String.format("name: %s + mark: %.2f", p.getName(), p.getMark()));
		//duyệt list
		//cách 1
		for (Person ps : personList) {    //foreach
			System.out.println(String.format("name: %s + mark: %.2f", ps.getName(), ps.getMark()));
		}
		// cách 2
		Iterator<Person> iterator = personList.iterator();
		while(iterator.hasNext()) {
			Person ps = iterator.next();
			System.out.println(String.format("name: %s + mark: %.2f", ps.getName(), ps.getMark()));
		}
		// cách 3
		for(int i=0; i<personList.size(); i++) {
			Person pp = personList.get(i);
			System.out.println(String.format("name: %s + mark: %.2f", pp.getName(), pp.getMark()));
		}
	}
}
