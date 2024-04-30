package exam;

public interface iAnimal {
    void eat(); //public abstract을 컴파일러가 자동으로 추가
}
class iCat implements iAnimal{

    @Override
    public void eat() {
        System.out.println("생선을 먹는다.");
    }
}

class iTiger extends Animal implements iAnimal{

    @Override
    void move() {
        System.out.println("네발로 이동");
    }

    @Override
    public void eat() {
        System.out.println("고기를 먹는다.");
    }
}
