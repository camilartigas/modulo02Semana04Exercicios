package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isIdadeValida = false;

        while (!isIdadeValida){
            System.out.println("Informe a sua idade: ");
            Scanner scanner = new Scanner(System.in);
            int idade = scanner.nextInt();
            try{
                validarIdade(idade);
                System.out.println("Olá! você tem " + idade + " anos");
                isIdadeValida = true;
            }catch (idadeInvalidaException e){
                System.out.println("A idade informada é inválida");
            }

        }

    }
    private static void validarIdade(int idade){
        if (idade <= 0 || idade > 100)
            //throw new IllegalArgumentException("Idade inválida");
            throw new idadeInvalidaException();
    }
}
