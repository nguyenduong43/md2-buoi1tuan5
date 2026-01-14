package animal;

public class PhanLoai {
    public static Animal phanloai(String s){
        if("cho".equals(s)) return new Dog();
        else return new Cat();
    }
}
