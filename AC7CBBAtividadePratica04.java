public class AC7CBBAtividadePratica04 {
	public static void main(String[] args) {
		int tamanho = 100;
		int[] numeros = new int[tamanho];
		for(int i = 0; i <= tamanho; i++) {
			numeros[i] = i;
			System.out.println(numeros[i]);
		}
	}
}
/** A exception aqui será lançada por estarmos acessando um campo do array fora do seu tamanho, numeros[100]*/
