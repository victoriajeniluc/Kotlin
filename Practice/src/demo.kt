fun main(args : Array<String>) {
    println("Hello World!")

    val name = "Vikky"
    val myName = """"Derek
        |Banas"""

    println(myName)

    var myAge = 25

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int: " + smallInt)

    if(true is Boolean) {
        println("true")
    } else {
        println("false")
    }

    var letterGrade: Char = 'A'

    println("A is a Char: ${letterGrade is Char}")

    println("3.14 to Int: " + (3.14.toInt()))

    val fName = "Victoria"
    val lName = "Luc"
    var fullName = fName + " " + lName
    println(fullName)

    println("String length: ${fullName.length}")

    var str1 = "Random string"
    var str2 = "Random string"
    println("str 1 equals str2: ${str1.equals(str2)}")
    println("Char A compare to Char B: ${'A'.compareTo('B')}")

    println("2nd index of fullName: ${fullName.get(2)}")
    println("2nd index of fullName: ${fullName[2]}")

    println("Index 2 - 7: ${fullName.subSequence(2,10)}")

    println("Contains Victoria: ${fullName.contains("Victoria")}")

    var myArray = arrayOf(1, 2.12, "Vikky")
    println(myArray[2])
    println(myArray.size)
    print(myArray.first())
    print(myArray.indexOf(2.12))
    var sqArray = Array(5, {x -> x * x })
    println(sqArray)

    var myArr4: Array<Int> = arrayOf(1,2,3)

    var oneToTen = 1..10
    var alpha = "A".."Z"
    var tenToOne = 10.downTo(1)

    for(x in oneToTen) println("range: $x")
    println("--------------------------------")
    for(x in tenToOne.reversed())println("range: $x")
}