public class exampletest {
     int b =3;
    public static void main(String[] args) {
        exampletest n1 = new exampletest();

    }
   exampletest(){
      Main();
    }
   exampletest(int a){
       System.out.println(a);
    }
    void print(){
        System.out.println("non static print");
    }
    void Main(){

        System.out.println(this.b);
    }
}
