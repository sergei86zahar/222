package _Java8._Глава_17._530_ИзмерениеВремени;
// Timing program execution.
class Elapsed {
    public static void main(String args[]) {
        long start, end;
        System.out.println("Timing a for loop from 0 to 100,000,000");
        // time a for loop from 0 to 100,000,000.   измерить время перебора от О до
        // 100000000
        /*
        Чтобы хронометрировать отдельную часть проверяемой программы,  следует
        сохранить это значение непо­средственно перед  началом выполнения этой части и
        сразу же после ее выполне­ния вызвать метод currentTimeMills () еще раз.
         */
        start = System.currentTimeMillis(); // get starting time
        System.out.println(start);
        for (long i = 0; i < 100000000L; i++);
        end = System.currentTimeMillis(); // get ending time
        System.out.println(end);
        System.out.println("Elapsed time: " + (end - start));
    }
}
