abstract class Ex {
	abstract void execute();
}

class Ex1_0 extends Ex {
	void execute(){
		System.out.println("Hello World!");
	}
}

class Ex1_2 extends Ex {
	void execute(){
		System.out.println("田\n中\n竜\n一\n郎");
	}
}

class Ex1_3 extends Ex {
	void execute(){
		System.out.println("田\n中\n\n竜\n一\n郎");
	}
}

public class Ex1 {
	public static void main(String[] args){
		Ex a;
		a = new Ex1_0();
		a.execute();
		a = new Ex1_2();
		a.execute();
                a = new Ex1_3();
		a.execute();
	}
}
