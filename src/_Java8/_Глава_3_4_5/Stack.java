package _Java8._Глава_3_4_5;
public class Stack {
    int[] stck = new int[10];
    int tos;
    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }
    //поместить элемент в стек
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }
    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("стек пуст");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}


