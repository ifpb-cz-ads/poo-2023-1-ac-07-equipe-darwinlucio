import java.util.Scanner;
class atividade06{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int maior=0;
	int[] nums=new int[10];

	for(int i=0;i<10;i++){
	System.out.println("diga um numero inteiro");
	nums[i]=sc.nextInt();
	if(nums[i]>maior){
	maior=nums[i];
	}
	}
	for(int i=0;i<10;i++){
	int y=i+1;
	System.out.println("o numero "+y+" eh:"+nums[i]);
	}
	System.out.println("o maior numero eh:"+maior);
	}
}
