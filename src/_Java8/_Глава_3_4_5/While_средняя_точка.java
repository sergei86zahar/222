package _Java8._Глава_3_4_5;
public class While_средняя_точка {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        //найти среднюю точку между i и j
        while (++i < --j) ;
        System.out.println("средняя точка " + i);
    }
}
