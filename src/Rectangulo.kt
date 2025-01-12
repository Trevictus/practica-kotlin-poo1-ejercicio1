/*# practica-kotlin-poo1-ejercicio1

Ejercicio 4.1¶
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
*/

class Rectangulo(var base: Double, var altura: Double){

    init{
        if (base <= 0){
            print("La base del rectángulo es incorrecta.")
            base = 6.0
        }
    }
    init{
        if (altura <= 0){
            print("La altura del rectángulo es incorrecta.")
            altura = 9.0
        }
    }


    fun calcularArea(): Double{
        val area = base * altura
        return area
    }

    fun calcularPerimetro(): Double{
        val perimetro = (base * altura) * 2
        return perimetro
    }

}
