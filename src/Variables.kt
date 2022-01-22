fun main(args: Array<String>){
    var myByte: Byte = 3
    var myShort: Short = 14
    var myInt = 27
    var myLong: Long = 58
    var myFloat: Float = 2.89F
    var myDouble: Double = 8.5478621
    var myBoolean: Boolean = false
    var myChar = 'x'


    var myString = """
        This is my byte: $myByte
        This is my short: $myShort
        This is my Integer: $myInt
        This is my Long: $myLong
        This is my Float: $myFloat
        This is my Double: $myDouble
        This is my Boolean: $myBoolean
        This is my Character: $myChar
    """.trimIndent()
    println(myString)
}