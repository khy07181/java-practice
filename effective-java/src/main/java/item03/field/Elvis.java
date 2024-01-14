package item03.field;

import java.io.Serializable;

// 코드 3-1 public static final 필드 방식의 싱글턴 (23쪽)
// interface 를 구현하여 클라이언트에서 IElvis 인터페이스를 사용하면 MockElvis 를 구현해 테스트가 어려워지는 것을 막을 수 있다.
public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor.");
        }

        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
