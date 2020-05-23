package _Java8._Глава_10._Глава_10_Множественные_catch_2;
public class SuperSubcatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Генерация исключения catch.");
            /* Этот catch никогда не будет достигнут из-за того,
            что ArithmeticException является подклассом Exception.
        } catch (ArithmeticException е) { // ОШИБКА. Оператор недостижим
            System.out.println("Недостижимый оператор.");
        }
        */
        }
        /*
        Если вы попытаетесь откомпилировать данную программу,  то примете сообщение об
        ошибке, заявляющее, что второй catch-оператор недостижим.  Так как
        ArithmeticException — Подкласс Exception, первый catch-onepaтор  обработает
        все ошибки, основанные на Exception, включая и ArithmeticException.  Это
        означает, что второй catch-оператор никогда не будет выполняться.  Чтобы
        устранить проблему, измените порядок операторов catch.
         */
    }
}
