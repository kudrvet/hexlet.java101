package m8e2;

/*Задание

        В этой практике Вашему вниманию представлено 2 класса:

        University
        Student
        Класс Student является вложенным в класс University. Ранее прошлый разработчик реализовал его статическим вложенным. Код класса Student прошлой версии Вы найдете закоментированным в классе University.

        Представьте, что заказчик попросил Вас добавить в класс Student метод getUniversity, который бы возвращал Университет, в котором учится студент. Для того, чтобы реализовать этот метод в классе Student, нужно сделать этот класс вложенным и нестатическим (понятно для какой цели ;) ).

        После выполнения рефакторинга класс Student должен быть внутренним (inner non static) классом в классе University. Ну а теперь немного деталей к задаче.

University
Класс University должен обладать следующими публичными методами:

University(final String name, final String address)
String getName()
String getAddress()
List getStudentsList()
void showAllStudents()
static University.Student createStudent(final University univ, final String name, final int grade)
static University.Student createStudent(final University univ, final String name, final int grade)
Метод должен создавать новый объект класса студент, привязанный к университету, который передается в метод в качестве первого параметра.

Student
Класс является публичным внутренним классом (public inner non-static) в классе University. В нем необходимо реализовать такие методы:

Student(final String name, final int grade)
String toString()
String getName()
int getGrade()
University getUniversity()
University getUniversity()
Метод должен возвращать ссылку на инстанс класса University, к которому был привязан объект класса студента в момент его создания.*/

import java.util.*;

public class University {
    private final String name;

    private final String address;

    private final List students;

    public University(final String name, final String address) {
        this.name = name;
        this.address = address;
        students = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List getStudentsList() {
        return students;
    }




    public void showAllStudents() {
        for (Object student : students) {
            System.out.println(student);
        }


    }
    // BEGIN (write your solution here)
    static University.Student createStudent(final University univ, final String name, final int grade){
        return univ.new Student(name,grade);
    }

   public class Student {

        private final String name;
        private  final int grade;

        Student(final String name, final int grade){
            this.grade=grade;
            this.name=name;
        }

        @Override
        public String toString() {
            return String.format("name: %s, grade: %d",name,grade);
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        University getUniversity(){
            return University.this;
        }
    }



}
