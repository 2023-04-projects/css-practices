
public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setName("JHON");

		SubjectMarks[] subjectMarks = new SubjectMarks[1];
		subjectMarks[0].setSub1(90);
		subjectMarks[0].setSub2(80);
		subjectMarks[0].setSub3(50);
		subjectMarks[0].setSub4(90);

		student.setSubjectMarks(subjectMarks);

	}
}
