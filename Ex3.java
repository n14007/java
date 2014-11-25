class Ex3{

	public String ex3_0(int n){

          if(n > 0){
            return "その値は正です";
          }else{
            return "その値は０か負です";
          }

	}

	public int ex3_1(int n){
          
          if(n < 0){
            return n;
          }else{
            return (n * -1);
          }	

        }

	public String ex3_2(int a, int b){
          
          if(a / b == a){
            return b + "は" + a + "の約数です";
          }else{
            return b + "は" + a + "の約数ではありません";
          }
	}

	public String ex3_3(int a, int b){
          
          if(a > b){
            return a + "の方が大きいです";
          }else if(a == b){
            return "同じ値です";
          }else{
            return b + "のほうが大きいです";
          }
	}

	public String ex3_4(int a){
          
          if(a % 5 == 0 && a > 0){
            return "その値は５で割り切れます";
          }else if(a % 5 > 0){
            return "その値は５で割り切れません";
          }else{
            return "正ではない整数値です";
          }
        }

	public String ex3_5(int a){
          if(a % 10 == 0 && a > 0){
            return "その値は１０の倍数です";
          }else if(a % 5 > 0){
            return "その値は１０の倍数ではありません";
          }else{
            return "正でない整数値です";
	}
        }
	
	public String ex3_6(int a){
          if(a % 3 == 0 && a >0){
            return "その値は３で割り切れます";
          }else if(a % 3 == 1 && a >0){
            return "その値を３で割った余りは１です";
          }else if(a % 3 == 2 && a >0){
            return "その値を割った余りは２です";
          }else{
            return "正でない整数値です";
          }
	}

	public String ex3_7(int a){
          if(a > 0 && a < 59){
            return "不可";
          }else if(a > 60 && a < 69){
            return "可";
          }else if(a > 70 && a > 79){
            return "良";
          }else if(a > 80 && a < 100){
            return "優";
          }else{
            return "範囲外の値です";
          }  
	}

	public double ex3_8(double a, double b){
          if(a < b){
            return b;
          }else{
	    return a;
          }      
	}

	public int ex3_9(int a, int b){
          int num = 0;
          if(a < num || num < b){
            return num;
          }else 
            return 1;
	}

	public String ex3_10(int a, int b){
          if((a - b) < 10){
            return "それらの差は１０以下です";
          }else{
            return "それらの差は１１以上です";
          }
	}

	public int ex3_11(int a, int b, int c){
		return 1000;
	}

	public int ex3_12(int a, int b, int c){
		return 1000;
	}

	public String ex3_13(int a){
		return "dummy";
	}
}

