package _Java8._Глава_9._Глава_9_интерфейсы_3_НаПримереСтека;
/*
Следующая программа создаёт класс с именем FixedStack, который реализует версию целого
стека фиксированной длины:
 */
public class FixedStack implements IntStack {  // implements - обеспечить выполнение
    private final int[] stck;
    private int tos;
    // выделить память и инециализировать стек.
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // поместить элемент в стек.
    @Override
    public void push(int item) {
        if (tos == stck.length - 1) { // использовать переменную length.
            System.out.println("Стэк заполнен.");
        } else {
            stck[++tos] = item;
        }
    }
    // извлечь элемент из стека.
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}
