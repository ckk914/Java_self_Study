

public class Main {
  public static void main(String[] args) {
Cat an = new Cat();
an.makeSound();
an.walkSound();
//calculation sum = new calculation();
NumvalueCollection Num1 = new NumvalueCollection();
Num1.a = 10;
Num1.b= 20;
double c = Calculation.sum(Num1.a, Num1.b);
System.out.println(c);

Object myObject = new String("Hello, World!");
//myObject = new Integer(5);  //현재 주석 살리면 integer호 출력

if (myObject instanceof String) {          //타입 검사1
    System.out.println("myObject는 String의 인스턴스입니다!");
}

if (myObject instanceof Integer) {          //타입 검사2
    System.out.println("myObject는 Integer의 인스턴스입니다!");
}

  }//메인
}