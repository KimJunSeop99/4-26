package Test2;

public class MainTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(30);
		s.setName("홍길동");
		s.setHeight(175);
		s.setWeight(99);
		
		s.setStudent();
		System.out.println();
	
		Staff st = new Staff();
		st.setAge(30);
		st.setName("이순신");
		st.setHeight(180);
		st.setWeight(87);
		
		st.setStaff();
	}

}
