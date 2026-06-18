
public class print{
    public static void main() {
        reset();
        student address= new student();
        address.roll=122;
        System.out.println(address.roll);
        address.call();

    }
    static void reset() {
        student stu= new student();
        stu.roll = 255;
        System.out.println(stu.roll);
    }
}
class student{
    int roll=12;
    String name="kailash";
    long id = 9360431488L;
    String place = "koliyakudi" ;

    student(){
        roll =243;
        System.out.println(roll);
    }
    void call(){
        System.out.println(roll);
    }
}
