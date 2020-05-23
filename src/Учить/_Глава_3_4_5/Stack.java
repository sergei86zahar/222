package Учить._Глава_3_4_5;
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
class Stack33 {
   public static void main(String[] args) {
      Stack mystack1 = new Stack();
      Stack mystack2 = new Stack();
      //поместить несколько чисел в стек
      for (int i = 0; i < 10; i++) mystack1.push(i);
      for (int i = 10; i < 20; i++) mystack2.push(i);
      //вытолкнуть эти числа из стека
      System.out.println("Стек в mystack1: ");
      for (int i = 0; i < 10; i++) {
         System.out.println(mystack1.pop());
      }
      System.out.println("Стек в mystack2: ");
      for (int i = 0; i < 10; i++) {
         System.out.println(mystack2.pop());
      }
   }
}


