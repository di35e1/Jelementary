package Task4;

// 1. Класс "Сотрудник"
public class Employee {
    String name;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    // 2. Конструктор класса
    public Employee(String name, String position, String email,
                    String phone, double salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // 3. Метод класса, выводит информацию о сотруднике в консоль
    public void employeeInfo() {
        System.out.println(name + ", "+ age + " | " + position);
        System.out.println("Электрическая почта: " + email);
        System.out.println("Зарплата: " + salary);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        // 4. Массив из 5 сотрудников
        employeesArray[0] = new Employee("Алиса Селезнева","Пионер", "alice@earth.com",
                                         "325597-9", 0, 12);

        employeesArray[1] = new Employee("Владимир Николаевич", "Прораб", "dyadya_vova@earth.com",
                                         "234-54-21", 250, 44);

        employeesArray[2] = new Employee("Гедеван Александрович", "Скрипач", "skripach@earth.com",
                                         "255-09-55", 50, 20);

        employeesArray[3] = new Employee("Абрадокс", "Руководитель", "abradox@alpha.com",
                                         "555000", 700, 56);

        employeesArray[4] = new Employee("Уэф", "Бедный артист", "uef@plyuk.com",
                                         "11101", 0, 60);

        // Вывод тех, кто старше 40
        for(Employee person : employeesArray){
            if(person.age > 40) {
                person.employeeInfo();
            }
        }
    }
}
