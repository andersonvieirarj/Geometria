import java.util.Scanner;

/* SOBRECARGA (OVERLOAD)
É a possibilidade de se reutilizar métodos com o mesmo nome,
mas com "assinaturas" diferentes, dentro da mesma classe
É uma das formas de se utilizar o Polimorfismo (muitas formas)

 */
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Geometria g = new Geometria ();

        System.out.println("Informe o valor do raio: ");
        double r = input.nextDouble();

        System.out.println("Área calculada: "
                + g.calcular(r));

        System.out.println ("Informe os dois lados do retângulo:");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Área do Retângulo:" + g.calcular(a,b));

    }
}
