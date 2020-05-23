package _Java8._Глава_17._523_УправлениеПамятью;
// Demonstrate totalMemory(), freeMemory() and gc().
class MemoryDemo {
    public static void main(String args[]) {
        /*
        Создать объект типа Runtime нельзя, но можно  получить ссылку на текущий объект
         типа Runtime, вызвав статический метод Runtime.getRuntime (). Получив ссьлку
         на текущий объект типа Runtime, можно вызвать несколько методов,  управля ющих
         состоянием и поведением виртуальной машины JVM. Аплеты и другой
         незаслуживающий  доверия код не могут вызывать методы из класса Runtime,  не
         генерируя исключение типа SecurityException.
         */
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("Total memory is: " + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Initial free memory: " + mem1);
        /*
        Но иногда может возникнуть потребность собрать  отвергнутые объекты до того,
        как система сборки "мусора" будет запущена в очередной раз. Ее можно запускать
        по требованию, вызывая метод gc (). Можно  также попробовать вызвать сначала
        метод gc () , а после него - метод freeMemory () , чтобы получить основные
        сведения об использовании памяти.
         */
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);
        for (int i = 0; i < 1000; i++)
            someints[i] = i; // allocate integers
        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        System.out.println("Memory used by allocation: " + (mem1 - mem2));
        // discard Integers
        for (int i = 0; i < 1000; i++)
            someints[i] = null;
        r.gc(); // request garbage collection
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting" + " discarded Integers: " + mem2);
    }
}
