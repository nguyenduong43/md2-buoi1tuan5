package animal;

public class FactoryDemo {
    public static void main(String[] args) {
        Animal animal=PhanLoai.phanloai("cho");
        System.out.println(animal.sound());
        Animal animal1=PhanLoai.phanloai("meo");
        System.out.println(animal1.sound());
    }


}
