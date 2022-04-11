package ex;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","World","Kitty");
        //List实现了Iteratable接口中的iterator()方法，返回了一个Iterator,是可迭代的
        for (String s : list) {
            System.out.println(s);
        }
        //上面的循环等价于下面
//        for (Iterator<String> it = list.iterator(); it.hasNext();){
//            String s = it.next();
//            System.out.println(s);
//        }

        Range range = new Range(2, 10 ,3);
        for (Integer x : range){
            System.out.println(x);
        }
    }
}

//实现python中的range(不包括step为负数的情况)
class Range implements Iterable<Integer>, Iterator<Integer>{
    private final int start;
    private final int end;
    private final int step;
    private int current;

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.current = start;
    }

    @Override
    public Iterator<Integer> iterator() {
        //直接返回当前对象，交给对象的Iterator实现
        return this;
    }

    @Override
    public boolean hasNext() {
        return current < end;
    }

    @Override
    public Integer next() {
        int result = current;
        current += step;
        return result;
    }
}