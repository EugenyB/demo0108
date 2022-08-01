package sam;

public interface Сэм<T> {
    default void расширятьНато(String новаяСтрана) { System.out.println(новаяСтрана); }
//    void расширятьНато(T новаяСтрана);
    void захватыватьНефть(String новаяСтрана);
    void захватыватьНефть(T новаяСтрана);
}

