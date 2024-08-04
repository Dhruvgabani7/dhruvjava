

import java.util.Scanner;

class student{

    Scanner scanner = new Scanner(System.in);
    private int student_id;
    private String name;
    private int age;
    private String depart;


    void getStudentdetail() {
        System.out.print("Enter student id : ");
        student_id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student name : ");
        name = scanner.nextLine();
        System.out.print("Enter student age : ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student department : ");
        depart = scanner.nextLine();

    }

    void viewRecord() {
        System.out.println("Student name : " + name);
        System.out.println("Student id   : " + student_id);
    }

    int searchId(int id) {
        if (student_id == id) {
            display();
            return 1;
        }
        return 0;
    }

    void display() {
        System.out.println("Student name        : " + name);
        System.out.println("Student id          : " + student_id);
        System.out.println("Student age         : " + age);
        System.out.println("Student department  : " + depart);
    }
}

public class studentrecored {

    public static void main(String[] args) {
        int n, sid,x=0;
      
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        student[] s = new student[100];
        do {
            System.out.println("1 : add new Student" + "\n2 : view existing record" + "\n3 : search by student id" + "\n4 : exit");
            System.out.print("Enter your choice : ");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    s[count] = new student();
                    s[count++].getStudentdetail();
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        s[i].viewRecord();
                    }
                    break;
                case 3:
                    System.out.print("Enter id for search : ");
                    sid = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        int c = s[i].searchId(sid);
                        if (c == 1) {
                            break;
                        }
                    }
                    break;
                case 4:
                    return;
            }

            System.out.print("Enter 1 to continue");
            x=scanner.nextInt();
        } while (x==1);
    }
}