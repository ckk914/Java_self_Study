

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
//myObject = new Integer(5);  //���� �ּ� �츮�� integerȣ ���

if (myObject instanceof String) {          //Ÿ�� �˻�1
    System.out.println("myObject�� String�� �ν��Ͻ��Դϴ�!");
}

if (myObject instanceof Integer) {          //Ÿ�� �˻�2
    System.out.println("myObject�� Integer�� �ν��Ͻ��Դϴ�!");
}

  }//����
}