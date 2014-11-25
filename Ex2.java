import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}
/*
class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63.1;
		y = 18.8;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
                int z;

		x = 63;
		y = 18;
                z = 8;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
                System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}

class Ex2_00 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);
                System.out.println("xとyを加減乗除します。");
                System.out.print("xの値：");  // xの値の入力を促す
                int x = stdIn.nextInt();
                System.out.print("yの値：");  // yの値の入力を促す
                int y = stdIn.nextInt();
                System.out.println("x + x = " + (x + y)); // x + yの値を表示
                System.out.println("x - x = " + (x - y)); // x - yの値を表示
                System.out.println("x * x = " + (x * y)); // x * yの値を表示
                System.out.println("x / x = " + (x / y)); // x / yの値を表示 
                System.out.println("x % x = " + (x % y)); // x % yの値を表示 
        }
}

class Ex2_3 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);
                System.out.println("整数値をそのまま反復。");
                System.out.print("xの値：");  // xの値の入力を促す
                int x = stdIn.nextInt();
                System.out.print("yの値：");  // yの値の入力を促す
                int y = stdIn.nextInt();
                System.out.println("x = " + (x)); // x + yの値を表示
                System.out.println("y = " + (y)); // x + yの値を表示

        }
}

class Ex2_4 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);
                System.out.println("整数値に10を加減した値を出力。");
                System.out.print("xの値: ");  // xの値の入力を促す
                int x = stdIn.nextInt();
                System.out.println("x + x = " + (x + 10)); // x + yの値を表示
                System.out.println("x - x = " + (x - 10)); // x - yの値を表示
        }
}

class Ex2_5 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);
                System.out.println("2つの実数値を読み込み和と平均を出力。");
                System.out.print("xの値：");  // xの値の入力を促す
                int x = stdIn.nextInt();
                System.out.print("yの値：");  // yの値の入力を促す
                int y = stdIn.nextInt();
                System.out.println("x + x = " + (x + y)); // x + yの値を表示
                System.out.println("(x + x) /2 = " + ((x + y)/2) ); // x / yの値を表示 
        }
}
*/
class Ex2_6 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);
                System.out.println("三角形の底辺と高さを実数値で読み込み面積を出力。");
                System.out.print("底辺：");  // xの値の入力を促す
                double x = stdIn.nextDouble();
                System.out.print("高さ：");  // yの値の入力を促す
                double y = stdIn.nextDouble();
                System.out.println("(x * x)/2 = " + ((x * y)/2)); // x + yの値を表示
        }
}
/*
class Ex2_000 extends Ex{
        void execute(){
                Random rand = new Random();

                int lucky = rand.nextInt(10); // 0-9の乱数

                System.out.println("今日のラッキーナンバーは" +lucky+ "です。");
        }
}


class Ex2_7 extends Ex{
        void execute(){
                Random rand1 = new Random(); 
                int lucky1 = rand1.nextInt(8); // 0-9の乱数

                System.out.println("1以上9以下の値" +(lucky1+1)+ "です。");
                Random rand2 = new Random(); 
                int lucky2 = rand2.nextInt(8); // -9~-1の乱数

                System.out.println("-9以上-1以下の値" +(-lucky2-1)+ "です。");
                Random rand3 = new Random(); 
                int lucky3 = rand3.nextInt(90); // 10-99の乱数

                System.out.println("10以上99以下の値" +(lucky3+10)+ "です。");
        }
}

class Ex2_8 extends Ex{

        void execute(){
          Random rand = new Random();


class Ex2_9 extends Ex{ void execute(){

  Random rand = new Random();

  double lucky = rand.nextDouble();
  System.out.println("0.0以上1.0未満の実数値"+ lucky +"です。");

  double lucky1 = rand.nextDouble() *9.0;
  System.out.println("0.0以上10.0未満の実数値"+ lucky1 +"です。");

  double lucky2 = rand.nextDouble() -1.0;
  double lucky1 = rand.nextDouble() *10.0;
  System.out.println("0.0以上10.0未満の実数値"+ lucky1 +"です。");

  double lucky2 = rand.nextDouble() -2.0;
  System.out.println("-1.0以上1.0未満の実数値"+ lucky2 +"です。");

}
}


         
class Ex2_10 extends Ex { 
        void execute(){
          Scanner stdIn = new Scanner(System.in);

            System.out.println("java Ex2");
            System.out.println("性:");
              String x = stdIn.next();
            System.out.println("名:");
              String y = stdIn.next();
            System.out.println("こんにちは"+ x + y +"さん");



                      }
              }

 
*/
public class Ex2 {
	public static void main(String[] args){
		Ex a;
/*		
 		a = new Ex2_0();
		a.execute();
                a = new Ex2_1();
		a.execute(); 
                a = new Ex2_2();
		a.execute();
                a = new Ex2_00();
                a.execute();
                a = new Ex2_3();
                a.execute();
                a = new Ex2_4();
                a.execute();
                a = new Ex2_5();
                a.execute();*/
                a = new Ex2_6();
                a.execute();
  /*             a = new Ex2_000();
               a = new Ex2_000();
               a.execute();
                a = new Ex2_7();
                a.execute();
                a = new Ex2_8();
                a.execute();
                a = new Ex2_9();
                a.execute();
                a = new Ex2_10();
                a.execute();*/
                a.execute();
       }
}
