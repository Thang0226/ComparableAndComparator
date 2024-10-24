import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("kien", 30, "HT");
		Student student2 = new Student("Nam", 26, "HN");
		Student student3 = new Student("Anh", 38, "HT");
		Student student4 = new Student("Tung", 38, "HT");

		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);

		Collections.sort(list);
		System.out.println("Sap xep theo ten, thu tu A-Z:");
		for (Student student : list) {
			System.out.println(student);
		}

		Collections.sort(list, new AgeComparator());
		System.out.println("\nSap xep theo tuoi tang dan:");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
