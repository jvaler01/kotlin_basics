package com.jvaler01.variableskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variables()

        /*dataTypes()

        ifSentence()

        sentenciaWhen()

        arrays()

        maps()

        loops()

        nullSafety()

        functions()

        classes()*/
    }

    /*
        Variables And Constants
     */
    private fun variables() {
        //Variables
        var myVariable = "Hello World"
        println(myVariable)
        println(myVariable)
        myVariable = "Hello World Changed"
        println(myVariable)
        println(myVariable)

        //Constants
        val myConstant = "My constant"
        val mySecondConstant = myVariable
        println(myConstant)
        println(mySecondConstant)
    }

    private fun dataTypes(){

        // String
        val myString: String = "Hola!"
        val myString2 = "Bienvenidos"
        val myString3 = myString + " " + myString2
        println(myString3)

        // Int (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimal (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    private fun ifSentence() {
        val myNumber = 33

        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= (> =) mayor o igual que
        // <= (< =) menor o igual que
        // == (= =) igualdad
        // != (! =) desigualdad

        // Operadores lógicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")
        } else if(myNumber == 60) {
            println("$myNumber es igual a 60")
        } else if(myNumber != 70) {
            println("$myNumber no es igual a 70")
        } else {
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }

    }

    fun sentenciaWhen() {
        // When con String
        val country = "Italia"
        when (country) {
            "España", "Mexico", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            } "EEUU" -> {
                println("El idioma es Inglés")
            } "Francia" -> {
                println("El idioma es Francés")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        // When con Int
        val age = 100
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres adulto")
            } in 70..99 -> {
                println("Eres anciano")
            } else -> {
                println("😱")
            }
        }
    }

    fun arrays() {
        val name = "Baity"
        val surname = "Bait"
        val company = "Dev"
        val age = "32"

        // Creación de un Array

        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(myArray)

        // Acceso a datos

        val myCompany = myArray[2]

        println(myCompany)

        // Modificación de datos

        myArray[5] = "Suscríbete y activa la campana"

        println(myArray)

        // Eliminar datos

        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos

        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        println(myArray.count())

        myArray.clear()

        println(myArray.count())

        // myArray.first()
        // myArray.last()
        // myArray.sort()
    }

    fun maps() {

        // Sintaxis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        // Añadir elementos
        myMap = mutableMapOf("Goku" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        // Añadir un solo valor
        myMap["Jill"] = 7
        myMap.put("Leia",8)
        println(myMap)

        // Actualización de un dato
        myMap.put("Goku",3)
        myMap["Goku"] = 4
        println(myMap)

        myMap.put("Goku",3)
        println(myMap)

        // Acceso a un dato
        println(myMap["Goku"])

        // Eliminar un dato
        myMap.remove("Goku")
        println(myMap)
    }

    private fun loops() {

        // loop

        val myArray = listOf("Hola", "Bienvenidos", "Testing loops")
        val myMap = mutableMapOf("Goku" to 1, "Jill" to 2, "Leia" to 5)

        // For

        for (myString in myArray) {
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 9 until 30) {
            println(x)
        }

        for (x in 0..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray) {
            println(myNum)
        }

        // While

        var x = 0

        while (x < 10) {
            println(x)
            x += 2
        }

    }

    fun nullSafety() {
        // Variable null safety
        var mySafetyString: String? = "Dev null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Not null!"
        //println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }

    }

    fun functions() {

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Goku")
        sayMyName("Kenkro")
        sayMyName("Revekro")

        sayMyNameAndAge("Goku", 32)

        val sumResult = sumTwoNumbers(10, 5)
        println(sumResult)

        println(sumTwoNumbers(15, 9))

        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }

    fun sayHello() {
        println("Hola!")
    }

    fun sayMyName(name: String) {
        println("Hola, mi nombre es $name")
    }

    fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber + secondNumber
        return sum
    }

    fun classes() {

        val Goku = Programmer("Goku", 32, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
        println(Goku.name)

        Goku.age = 40
        Goku.code()

        val jill = Programmer("Jill", 35, arrayOf(Programmer.Language.JAVA), arrayOf(Goku))
        jill.code()

        println("${jill.friends?.first()?.name} es amigo de ${jill.name}")
    }
}