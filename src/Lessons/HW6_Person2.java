package Lessons;
//6.2.
public class HW6_Person2 {
    private String name; //privat - позволяет обращаться к полю из других классов только через геттер и сеттер
    private int age; //public - позволяет обращаться к полю из других классов напрямую от объекта без применения геттеров и сеттеров
    private String gender;

    public HW6_Person2(String name, int age, String gender) {
        this.setName(name); //изменяем так конструктор, чтобы даже при создании экземпляра нужно было присваивать полям значения только через сеттер (где мы можем задать проверку и корректировку на входные данные)
        this.setAge(age);
        this.setGender(gender);
        //this.name = name;
        //this.age = age;
        //this.gender = gender;


    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 100) {
            this.age = 100;
        } else {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName () {
        String prefName = "";
        if (gender.equalsIgnoreCase("M")) {
            prefName = ("Mr. " + name);
        } else if (gender.equalsIgnoreCase("F")) {
            prefName = ("Mrs. " + name);
        }
        return prefName;
    }

    public int getAge () {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
