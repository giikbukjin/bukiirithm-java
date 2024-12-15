package week2;

public class _01_class {
    public static void main(String[] args) {
        Person person1 = new Person("유재석");
        person1.talk();

        Person person2 = new Person("박명수");
        person2.talk();
    }
}

class Person {
    private String name;

    public Person(String nameParam) {
        this.name = nameParam;
        System.out.println("hihi I am created " + this + " " + this.name);
    }

    public void talk() {
        System.out.println("안녕하세요 저는 " + this.name + "입니다.");
    }
}