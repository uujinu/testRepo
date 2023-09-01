package practice.methods;

import java.util.List;

public class Clone implements Cloneable {
    private List<String> list; // 초기화 안 한 상태

    public Clone() {}

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void addList(String element) {
        this.list.add(element);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // 얕은 복사
    }
}
