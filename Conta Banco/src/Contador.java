import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        try{
        for(int i = 0;i<fazerContagem(numero1,numero2);i++){
            System.out.println(i);
        }
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O primeiro parametro deve ser maior que o segundo!!");

}


    }

	static int fazerContagem(int numero1, int numero2) throws ParametrosInvalidosException  {
		if(numero1>numero2){
            throw new ParametrosInvalidosException();
        }
        else{
            return numero2 - numero1;   
        }
		
	}
}
