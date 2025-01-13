/*# practica-kotlin-poo1-ejercicio1

Ejercicio 4.1¶
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
*/

class Rectangulo(val base: Double, val altura: Double){

    init{
        require(base > 0){ "La base del rectángulo es incorrecta." }
        require(altura > 0){ "La altura del rectángulo es incorrecta." }
    }


    fun calcularArea(): Double = base * altura
  

    fun calcularPerimetro(): Double{
        val perimetro = (base * altura) * 2
        return perimetro
    }

    override fun toString(): String {
        return "El rectángulo de base $base y altura $altura, tiene un area de ${calcularArea()} y un perímetro de ${calcularPerimetro()}"
    }
}
