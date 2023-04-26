class atividade05{
	public static void main(String[] args){
	String[] dias = {"segunda","terca","quarta","quinta","sexta","sabado","domingo"};
	int cont=0;
	while(cont<7){
	System.out.println(dias[cont]);
	cont++;
	}
	cont=0;
	do{
	System.out.println(dias[cont]);
	cont++;
	}while(cont<7);
	for(cont=0;cont<7;cont++){
	System.out.println(dias[cont]);
	}
	}
}	
