fun main() {
    val saludo:String = ":: Bienvenido a Recipe Maker ::\n\n"
    val instruccion:String = "Selecciona la opción deseada"
    val menu:List<String> = listOf<String>("1. Hacer una receta", "2. Ver mis recetas", "3. Salir")
    var response:String?; var default_msg:Boolean = true
    salir@while(true) {
        if(default_msg) {
            println(saludo + instruccion)
            for (i in menu) println(i)
        }
        response = readLine()
        when (if(response == "") 0 else response?.toInt() ?: 0) {
            1 -> {println("Usted seleccionó: " + menu[0]); default_msg = false}
            2 -> {println("Usted seleccionó: " + menu[1]); default_msg = false}
            3 -> break@salir
            else -> default_msg = true //println("$instruccion${menu.forEach{print(it)}}")
        }
    }
}