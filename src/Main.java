import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<String> names = new ArrayList<>();
        HashMap<String, String> studentList = new HashMap<>();

        System.out.println("Please provide the student names and then q to quit");

        while (true) {
            System.out.print(">");
            String name = scanner.nextLine();

            if (!name.equals("q")) {
                studentList.put(name, "N");
            }
            else if (studentList.isEmpty()){
                System.out.println("No students were provided");
                break;
            }
            else {
                while (true) {
                    System.out.print("[check] sign ins, [sign] in, or [q]uit:");
                    String choice = scanner.nextLine();


                    if (choice.equals("check")) {
                        studentList.forEach((key, value) -> {
                            System.out.println("> " + key + ": " + value);
                        });

                    } else if (choice.equals("sign")) {
                        System.out.print("> ");
                        String studentChoice = scanner.nextLine();
                        if (studentList.containsKey(studentChoice)) {
                            studentList.put(studentChoice, "Y");
                        }

                    }
                    if (choice.equals("q")) {
                        break;
                    }

                }

            }

        if (name.equals("q")){
            break;
        }

        }
        scanner.close();
    }
}

