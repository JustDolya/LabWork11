public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Данькин Николай Михайлович", "+79538492867", 2007, 2, "Программирование", 2022),
                new Student("Тараканчиков Себастьян Артёмович", "+79538854867", 1943, 3, "Наладчик работы с ЭВМ 1-го поколения", 1960),
                new Student("Бауер Никита Артёмович", "+79538932867", 2012, -3, "Основы чипирования и нейропрограммирование", 2027)
        };
        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.print(STR."\{student.getFullName()}, ");
        }
        System.out.println();
        System.out.println("Список поступивших после 2021 года:");
        for (Student student : students){
            if (student.getDateOfReceipt() > 2021){
                System.out.print(STR."\{student.getFullName()}, ");
            }
        }
        System.out.println();
        System.out.println("Список студентов факультета 'Программирование':");
        for (Student student : students){
            if (student.faculty.equals("Программирование")){
                System.out.print(STR."\{student.getFullName()}, ");
            }
        }
    }
}

class Person {
    public String fullName;
    public String phoneNum;
    private int birthYear;
    Person(String name, String phoneNum, int birthYear) {
        this.fullName = name;
        this.phoneNum = phoneNum;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

class Student extends Person{
    public int studyYear;
    public String faculty;
    private int dateOfReceipt;
    Student(String name, String phoneNum, int birthYear, int studyYear, String faculty, int dateOfReceipt){
        super(name, phoneNum, birthYear);
        this.studyYear = studyYear;
        this.faculty = faculty;
        this.dateOfReceipt = dateOfReceipt;
    }

    public int getDateOfReceipt(){
        return dateOfReceipt;
    }
}