package Week2;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "70550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "70550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "70550000007", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ahmet", 4, "4654144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addInterwiewNote(70, 68, 95);
        s1.isPass();

        Student s2 = new Student("Selami", 4, "2255461133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s1.addInterwiewNote(100, 96, 95);
        s2.isPass();

        Student s3 = new Student("Enes Aycan", 4, "465421121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s1.addInterwiewNote(90, 88, 100);
        s3.isPass();

    }
}
