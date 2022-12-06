import java.util.*;
import java.util.stream.IntStream;

public class Abiurient {
    private int id;
    private String surName;
    private String name;
    private String otchesto;
    private String adress;
    private String phone;
    private int[] rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchesto() {
        return otchesto;
    }

    public void setOtchesto(String otchesto) {
        this.otchesto = otchesto;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int [] getRating() {
        return rating;
    }

    public void setRating(int rating []) {
        this.rating = rating;
    }

    private String printArry(int [] rating){
        String str="";
        for(int i: rating){
            str+=i+" ";
        }
        return str;
    }

    public void printInfo(){
        System.out.println(id+" "+surName+" "+name+" "+otchesto+" "+adress+" "+phone+" "+printArry(rating));
    }

    public int avg(int [] rating){
        int result=0;
        for(int i: rating){
            result+=i;
        }
        return result/rating.length;
    }

    public Abiurient(int id, String surName, String name, String otchesto,
                     String adress, String phone, int [] rating) {
        super();
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.otchesto = otchesto;
        this.adress = adress;
        this.phone = phone;
        this.rating = rating;
    }


}




class MainStudent {
    public static void main(String args[]) {
        int Summa = 19;
        int sum = 0;
        int max = 0;

        List<Abiurient> arrayStudents = new ArrayList<>();

        arrayStudents.add(new Abiurient(1, "Прохин", "Андрей", "Игоревич", "Касимов", "23-33",
                new int[]{3, 5, 5, 5, 5}));
        arrayStudents.add(new Abiurient(2, "Фролов", "Дмитрий", "Евгеньевич", "Рязань", "1-23-434",
                new int[]{3, 2, 5, 3, 5}));
        arrayStudents.add(new Abiurient(3, "Сысоев", "Максим", "Незнаювич", "Рязань", "34-53",
                new int[]{3, 4, 5, 4, 5}));
        arrayStudents.add(new Abiurient(4, "Логин", "Артем", "Романович", "Рязань", "23-455-67",
                new int[]{3, 2, 5, 3, 5}));
        arrayStudents.add(new Abiurient(5, "Штауб", "Егор", "Неспрашивавич", "Кимовск", "22-88",
                new int[]{3, 3, 5, 4, 5}));

        System.out.println();
        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки ");
        for (Abiurient a : arrayStudents) {

            for (int i : a.getRating()) {
                if (i < 3) {
                    a.printInfo();
                    break;
                }
            }
        }


        System.out.println();
        System.out.println("Список абитуриентов, сумма баллов у которых выше заданной ");
        for (Abiurient a : arrayStudents) {
            for (int i : a.getRating()) {
                sum = IntStream.of(a.getRating()).sum();
                if (sum > Summa) {
                    a.printInfo();
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Список абитуриентов с самой высокой суммой баллов ");




    }
}