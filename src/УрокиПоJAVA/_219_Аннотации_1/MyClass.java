package УрокиПоJAVA._219_Аннотации_1;
import java.beans.Transient;
import java.lang.annotation.*;
import java.lang.ref.Reference;
@Deprecated
@BugReport(reportedBy = {"one"})
public class MyClass {
    @Deprecated
    @MyAnn
    int i;
    @Deprecated
    MyClass() {
    }

    @Transient
    @Deprecated
    public void method(@Deprecated int i) {
        @Deprecated
        @MyAnn
        int e;
    }
}


class MyClass2 extends MyClass {

}
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})  // так можно ограничить
        // действие аннотации
@interface MyAnn {  // так можно создать аннотацию
    boolean run() default true;
    int i() default 1;
    // String value();
}
@interface BugReport {
    enum Status {UNCONFIRMED, CONFIRMED, FIXED, NOTABUG};
    boolean showStopper() default false;
    String assignedTo() default "[none]";
    String assigned2To() default "";
    // String assignedTo3() default "[none]" + new String("");
    // String assignedTo4() default null;
    int i() default 4;
    Class<?> testCase() default Void.class;
    Status status() default Status.UNCONFIRMED;
    // Reference ref() default @Reference();
    String[] reportedBy();
}
