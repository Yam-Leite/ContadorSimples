

 // Contador.java
public class Contador {
    public static void main(String[] args) {
        try {
            // Validando se dois argumentos foram passados
            if (args.length < 2) {
                System.out.println("Por favor, forneça dois números inteiros como argumentos.");
                return;
            }

            // Parseando os argumentos para inteiros
            int parametroUm = Integer.parseInt(args[0]);
            int parametroDois = Integer.parseInt(args[1]);

            // Verificando se o primeiro parâmetro é maior que o segundo
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Calculando a diferença entre os dois parâmetros
            int diferenca = parametroDois - parametroUm;

            // Loop para imprimir os números incrementados
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            // Exceção personalizada
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            // Exceção para números inválidos
            System.out.println("Por favor, forneça dois números inteiros válidos.");
        } catch (Exception e) {
            // Captura de qualquer outra exceção não esperada
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}


