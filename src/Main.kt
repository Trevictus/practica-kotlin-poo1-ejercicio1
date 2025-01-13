
fun main(){
    val rectangulo1 = Rectangulo(3.0, 9.0)
    println("El rectángulo de base ${rectangulo1.base} y altura ${rectangulo1.altura}, tiene un area de ${rectangulo1.calcularArea()} y un perímetro de ${rectangulo1.calcularPerimetro()}")
    println(rectangulo1)
    val rectangulo2 = Rectangulo(6.0, 9.0)
    println("El rectángulo de base ${rectangulo2.base} y altura ${rectangulo2.altura}, tiene un area de ${rectangulo2.calcularArea()} y un perímetro de ${rectangulo2.calcularPerimetro()}")
    val rectangulo3 = Rectangulo(7.5, 3.45)
    println("El rectángulo de base ${rectangulo3.base} y altura ${rectangulo3.altura}, tiene un area de ${rectangulo3.calcularArea()} y un perímetro de ${rectangulo3.calcularPerimetro()}")
    val rectangulo4 = Rectangulo(10.0, 6.0)
    println("El rectángulo de base ${rectangulo4.base} y altura ${rectangulo4.altura}, tiene un area de ${rectangulo4.calcularArea()} y un perímetro de ${rectangulo4.calcularPerimetro()}")
    val rectangulo5 = Rectangulo(11.1, 6.78)
    println("El rectángulo de base ${rectangulo5.base} y altura ${rectangulo5.altura}, tiene un area de ${rectangulo5.calcularArea()} y un perímetro de ${rectangulo5.calcularPerimetro()}")
}