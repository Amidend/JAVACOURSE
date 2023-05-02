package main.labs.laba5;

import main.labs.laba5.task1.Product;
import main.labs.laba5.task2.Student;
import main.labs.laba5.task4.LaborerFix;
import main.labs.laba5.task4.LaborerNotFix;
import main.labs.laba5.task4.Laborer;
import main.labs.laba5.task3.Cat;
import main.labs.laba5.task3.Dog;
import main.labs.laba5.task3.Parrot;
import main.labs.laba5.task3.Pet;

import java.util.*;

import static main.labs.laba5.Adapters.MapAdapter.printPets;
import static main.labs.laba5.Adapters.ProductAdapter.*;
import static main.labs.laba5.Adapters.StudentAdapter.*;
import static main.labs.laba5.Adapters.MapAdapter.printMap;

public class Lab5 {
    public Lab5() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Введите номер задания");
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> {
                    Product toy = new Product(3, 7.2f);
                    Product toy2 = new Product(5, 3.1f);
                    Product toy3 = new Product(11, 9.2f);
                    HashMap<String, Product> hashmap = new HashMap<String, Product>();
                    hashmap.put("Самолет", toy);
                    hashmap.put("Поезд", toy2);
                    hashmap.put("Машина", toy3);
                    printentrySet(hashmap);
                    printkeySet(hashmap);
                    printvalues(hashmap);
                }
                case 2 -> {
                    Student s1 = new Student("Roma", "Т-096", 4, 5, 6);
                    Student s2 = new Student("Victor", "Т-092", 1, 2, 2);
                    Student s3 = new Student("Nikita", "Т-091", 2, 4, 7);
                    Student s4 = new Student("Misha", "Т-093", 3, 2, 3);
                    Student s5 = new Student("Artem", "Т-094", 3, 9, 7);
                    Student s6 = new Student("Artyr", "Т-095", 2, 5, 5);
                    Student s7 = new Student("Pasha", "Т-093", 2, 2, 1);
                    List<Student> list = new ArrayList<Student>();
                    list.add(s1);
                    list.add(s2);
                    list.add(s3);
                    list.add(s4);
                    list.add(s5);
                    list.add(s6);
                    list.add(s7);
                    list=delFromList(list);
                    System.out.println("Все учащиеся");
                    printList(list);
                    System.out.println("Введите курс");
                    int k = scanner.nextInt();
                    printStudents(list, k);
                }
                case 3 -> {
                    Cat cat = new Cat("Млекопитающее", 12,4);
                    Parrot par = new Parrot("Летающее", 5,"Green");
                    Dog dog = new Dog("Млекопитающее", 10,36);
                    Map<String, Pet> map = new HashMap<String, Pet>();
                    map.put("Тарас", cat);
                    map.put("Артур", dog);
                    map.put("Александ", par);
                    printPets(map);
                    printMap(map);
                }
                case 4 -> {
                    List<Laborer> workers = new ArrayList<Laborer>();
                    LaborerFix laborerFix = new LaborerFix(520.1, "Пятро");
                    LaborerFix laborerFix2 = new LaborerFix(520.1, "Петр");
                    LaborerFix laborerFix3 = new LaborerFix(2000.8, "Китай");
                    LaborerNotFix laborerNotFix = new LaborerNotFix(11, "Ядимир");
                    LaborerNotFix laborerNotFix1 = new LaborerNotFix(5, "Варислав");
                    LaborerNotFix laborerNotFix2 = new LaborerNotFix(5, "Антон");
                    LaborerNotFix laborerNotFix3 = new LaborerNotFix(5.1, "Машка");
                    LaborerNotFix laborerNotFix4 = new LaborerNotFix(7, "Пашка");
                    LaborerFix laborerNotFix5 = new LaborerFix(720, "Сашка");
                    workers.add(laborerFix);
                    workers.add(laborerFix2);
                    workers.add(laborerFix3);
                    workers.add(laborerNotFix);
                    workers.add(laborerNotFix1);
                    workers.add(laborerNotFix2);
                    workers.add(laborerNotFix3);
                    workers.add(laborerNotFix4);
                    workers.add(laborerNotFix5);
                    workers.sort(Comparator.comparing(Laborer::getPayment).thenComparing(Laborer::getName));
                    printList(workers);
                    for(int i = 0; i < 5; i++){
                        System.out.println(workers.get(i).getName());
                    }
                    for(int i = workers.size()-3; i < workers.size(); i++){
                        System.out.println(workers.get(i).getClass().getSimpleName());
                    }
                }
                default -> flag = false;
            }
        } while (flag);
    }

}
