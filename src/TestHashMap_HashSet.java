import java.util.*;

public class TestHashMap_HashSet {
    public static void main(String[] args) {
        Student phong = new Student("Phong", 29, "QB");
        Student duong = new Student("Dương", 25, "QB");
        Student khanh = new Student("Khánh", 26, "Huế");
        Student tin = new Student("Tín", 26, "Huế");
        
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,phong);
        studentMap.put(20,duong);
        studentMap.put(3,khanh);
        studentMap.put(4,tin);
        System.out.println("HashMap : \n" + studentMap);
        for (Map.Entry<Integer, Student> student:
             studentMap.entrySet()) {
            System.out.println(student);
        }
        System.out.println("**************");
        Set<Student> students = new HashSet<>();
        students.add(phong);
        students.add(duong);
        students.add(khanh);
        students.add(tin);
        System.out.println("HashSet : \n" + students);
        for (Student student:
             students) {
            System.out.println(student);
        }
    }
}
