import java.util.Scanner;
class exercicio03{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double media=0;
	int acima=0;
	int abaixo=0;
	double[] notas=new double[10];
	for(int i=0;i<10;i++){
	System.out.println("diga a nota do aluno:");
	notas[i]=sc.nextDouble();
	media+=notas[i];
	}
	media/=10;
	System.out.println("a media das notas eh:"+media);
	for(int i=0;i<10;i++){
	if(notas[i]>media){
	acima++;
	}else{
	abaixo++;
	}
	}
	System.out.println("as notas acima da media sao:"+acima+" e as abaixo sao:"+abaixo);
	}
}
