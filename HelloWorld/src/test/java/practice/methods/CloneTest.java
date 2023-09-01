package practice.methods;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloneTest {

    @Test
    void getList() {
        // given: 인스턴스 변수가 초기화 안됐을 때
        Clone clone = new Clone();
        System.out.println("clone: " + clone.getList().getClass());
        assertEquals(null, clone.getList());
    }

    @Test
    void setList() {
        // given: 인스턴스 변수가 초기화 안 됐으므로 set 할 때 null 에러가 난다.
        Clone clone = new Clone();
        List<String> list = new ArrayList<>();
        System.out.println(clone.getList());
        clone.setList(list);

    }

    @Test
    void testClone() {
    }

    @Test
    void addList() {
        Clone clone = new Clone();
        clone.addList("hello"); // java.lang.NullPointerException

    }
}