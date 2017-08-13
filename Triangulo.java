import java.util.Scanner;
/**
 * Clase Triangulo
 * 
 * @author Lida Heliana Arenas Mogollón
 * @version 13-08-2017
 */
public class Triangulo
{
    //Atributos
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Variable para captura de datos por teclado
    Scanner teclado;
    /**
     * Constructor para objetos de la clase Triangulo
     */
    public Triangulo()
    {
        teclado = new Scanner(System.in);
        //Pedir la longitud del lado 1
        System.out.print("Digíte la longitud del lado 1 ");
        lado1 = teclado.nextDouble();
        //Pedir la longitud del lado 2
        System.out.print("Digíte la longitud del lado 2 ");
        lado2 = teclado.nextDouble();
        //Pedir la longitud del lado 3
        System.out.print("Digíte la longitud del lado 3 ");
        lado3 = teclado.nextDouble();
        //Verificar que los lados dados conforme un triangulo
        while(lado3 > lado1+lado2){
            System.out.print("Para poder formar un triangulo, la ");
            System.out.print("longitud del lado 3 debe ser menor ");
            System.out.print("a la suma de la longitud de los otros ");
            System.out.print("dos lados.\n");
            //Pedir nuevamente la longitud del lado 3
            System.out.print("Digíte de nuevo la longitud del lado 3 ");
            lado3 = teclado.nextDouble();
        }
    }
    
    /**
     * @return La longitud correspondiente al lado 1
     */
    public double darLado1(){
        return lado1;
    }

    /**
     * @return La longitud correspondiente al lado 2
     */
    public double darLado2(){
        return lado2;
    }
    
    /**
     * @return La longitud correspondiente al lado 3
     */
    public double darLado3(){
        return lado3;
    }
    
    /**
     * Método darPerimetro, calcula el perímetro del triángulo que
     * corresponde a la suma de las longitudes de todos sus lados.
     *
     * @return La suma de los tres lados del triángulo (perímetro).
     */
    public double darPerimetro(){
        return lado1+lado2+lado3;
    }
    
    /**
     * Método darArea, emplea la formula de Herón que permite calcular el
     * área de cualquier triángulo del cual se conocen las longitudes de
     * sus tres lados.
     * 
     * Fuente:
     * 
     * Universo formulas. (2017). Formula de Herón. recuperado de:
     * http://www.universoformulas.com/matematicas/geometria/formula-heron/
     *
     * @return El área del triángulo
     */
    public double darArea(){
        double area; //Guarda el cálculo del área del triángulo
        double sp = darPerimetro()/2.0; //Semiperimetro del triangulo
        area=Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
        return area;
    }
}