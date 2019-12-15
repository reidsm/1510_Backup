import java.util.*;
import java.io.File;
public class Main {
public static void main(String[] args) {
    //Name name = new Name("Scott", "Michael", "Reid");
    //Student student1 = new Student("Scott", "Reid", "2/9/1993", "A01160090", 3.93);
    try {
        Scanner scan = new Scanner(new File("C:\\\\Users\\\\reids\\\\OneDrive\\\\Documents\\\\Misc Java Projects\\\\COMP_1510_Lab_4\\\\src\\\\names.csv"));
        LinkedList list = new LinkedList();
        scan.useDelimiter(",");
        while(scan.hasNext()) {
            list.add(scan.next());
        }
        System.out.println(list);
        //System.out.println(name);
        //System.out.println(student1);
    } catch (Exception e) {
        e.printStackTrace();
    }

}
}
