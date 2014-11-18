class Ex3{

	public String ex3_0(int n){
          if(n<0){
            return "その値は正です";
          }else{
            return "その値は０か負です";
          }
	}

	public int ex3_1(int n){
          if(n > 0){
            return n;
          }else{
            return (n * -1);
          }
	}

	public String ex3_2(int a, int b){
          if(b / a == a){
            return (b + "は" + a + "の約数です");
          }else{
            return (b + "は" + a + "の約数ではありません"); 
          }

	}

	public String ex3_3(int a, int b){
          if(a > b){
            return (a + "は" + b "より大きいです");
          }else if(a == b){
            return(a + b + "は");
          }
        }
        public String ex3_4(int a){

		return "dummy";

	}

	public String ex3_5(int a){

		return "dummy";
	}
	
	public String ex3_6(int a){
		return "dummy";
	}

	public String ex3_7(int a){
		return "dummy";
	}
}

