import java.util.ArrayList;

public class School {
  UI ui = new UI();
  ArrayList<Student> students = new ArrayList<>();

  public void runMenu() {
    String[] menuItems = new String[5];

<<<<<<< HEAD

  void removeStudent(){}
=======
>>>>>>> f62c3d236304f76244d6cd673559a57e55962809
    menuItems[0] = "1. View Studentlist";
    menuItems[1] = "2. Add student to Studentlist";
    menuItems[2] = "3. Remove Student From Studentlist";
    menuItems[3] = "4. View Grades";
    menuItems[4] = "9. Quit";

    ui.getMenuOption("Student Menu", "Please choose an option", menuItems);

    int choice = 0;
    boolean keepRunning;

    do {
      ui.printMenu();
      choice = ui.getMenuOption();
      switch (choice) {
        case 1:
          ui.showStudentList();
          break;
        case 2:
          registerStudent();
          break;
        case 3:
          removeStudent();
          break;
        case 4:
          ui.showGrades();
          break;
        case 9:
          keepRunning = false;
          break;
        default:


      }
    } while (keepRunning)
  }

  void registerStudent() {
    String name = ui.getStudent("Enter name: ");
    String iD = ui.getStudent("Enter ID: ");
    Student student = new Student(name, iD);
    students.add(student);
  }

  void removeStudent() {
  }
}
