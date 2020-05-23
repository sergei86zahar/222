package _Java8._Глава_9._Глава_9_интерфейсы_3_НаПримереСтека;
/*
Данная реализация создаёт динамический стек, используя то же самое его определение. В
ней каждый стек создаётся с некоторой исходной длинной. Если эта исходная длина
превышена, то стек увеличивается в размере. Каждый раз, когда необходим больший участок
 памяти, размер стека удваивается.
 */
public class DynStack implements IntStack {
    private int[] stck;
    private int tos;
    // выделить память и инициализировать стек.
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // поместить элемент в стек
    @Override
    public void push(int item) {
        // если стек заполнен, увеличить его размер
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2]; // двойной размер
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }
    // извлечь элемент из стека
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("стек пуст.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
