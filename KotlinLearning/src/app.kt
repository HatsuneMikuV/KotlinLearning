//package MyPackagefun main() {    println("hello world")    println(sum(2, 3))    printSum(2, 4)    vars(1, 2, 4, 5, 6)    val sumLam:(Int, Int) -> Int = {x, y -> x + y}    println(sumLam(1, 2))    var a : Int = 1    val b = 2    val c: Int    c = 3    vars(a, b, c)    // 这是一个单行注释    /* 这是一个多行的        块注释。 */    val s1 = "a is $a"    a = 3    val s2 = "${s1.replace("is", "was")}, but noe is $a"    printf(s1)    printf(s2)    //类型后面加?表示可为空    var age: String? = "23"    //抛出空指针异常    val ages = age!!.toInt()    //不做处理返回 null    val ages1 = age?.toInt()    //age为空返回-1    val ages2 = age?.toInt() ?: -1    printf(ages, ages1, ages2)    for (i in 1..4) print(i) // 输出“1234”    print("\n循环输出：")    for (i in 1..4) print(i) // 输出“1234”    println("\n----------------")    print("设置步长：")    for (i in 1..4 step 2) print(i) // 输出“13”    println("\n----------------")    print("使用 downTo：")    for (i in 4 downTo 1 step 2) print(i) // 输出“42”    println("\n----------------")    print("使用 until：")    // 使用 until 函数排除结束元素    for (i in 1 until 4) {   // i in [1, 4) 排除了 4        print(i)    }    println("\n----------------")    //    BaseDataType()    //    expression_if()    expression_when()    cycle_fun()    class_test()    inherit()    moreclass()    moreinterface()    moreextension()}fun sum(a: Int, b:Int): Int {    return a + b}public fun printSum(a:Int, b:Int) {    println(a + b)}fun vars(vararg v: Int) {    for (vt in v) {        print(vt)    }    println()}fun printf(vararg v: Any) {    for (vt in v) {        print(vt)    }    println()}fun BaseDataType() {    /*    Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。不同于 Java 的是，字符不属于数值类型，是一个独立的数据类型。    类型	    位宽度    Double	64    Float	32    Long	64    Int	    32    Short	16    Byte	8    * */    val a: Int = 10000    printf(a === a) // true，值相等，对象地址相等    //经过了装箱，创建了两个不同的对象    val boxedA: Int? = a    val anotherBoxedA: Int? = a    //虽然经过了装箱，但是值是相等的，都是10000    printf(boxedA === anotherBoxedA) //===  false，值相等，对象地址不一样    printf(boxedA == anotherBoxedA) //== true，值相等    //[1,2,3]    val arr = arrayOf(1, 2, 3)    //[0,2,4]    val b = Array(3, { i -> (i * 2) })    //读取数组内容    println(arr[0])    // 输出结果：1    println(b[1])    // 输出结果：2    val text = """    多行字符串    多行字符串    """    println(text)   // 输出有一些前置空格    val text1 = """    |多行字符串    |菜鸟教程    |多行字符串    |Runoob    """.trimMargin()    println(text1)    // 前置空格删除了    val i = 10    val s = "i = $i" // 求值结果为 "i = 10"    println(s)    val s1 = "runoob"    val str = "$s1.length is ${s1.length}" // 求值结果为 "runoob.length is 6"    println(str)    val price = """    ${'$'}9.99    """    println(price)  // 求值结果为 $9.99}fun expression_if() {    var x = 1    if(x>0){        println("x 大于 0")    }else if(x==0){        println("x 等于 0")    }else{        println("x 小于 0")    }    var a = 1    var b = 2    val c = if (a>=b) a else b    println("c 的值为 $c")    val max = if (a > b) {        print("Choose a")        a    } else {        print("Choose b")        b    }    println(max)}fun expression_when() {    val x = 1    when (x) {        1 -> println("x == 1")        2 -> println("x == 2")        else -> { // 注意这个块            println("x 不是 1 ，也不是 2")        }    }    when (x) {        0, 1 -> println("x == 0 or x == 1")        else -> println("otherwise")    }    when (x) {        in 1..10 -> print("x is in the range")        null -> print("x is valid")        !in 10..20 -> print("x is outside the range")        else -> print("none of the above")    }    when (x) {        0, 1 -> println("x == 0 or x == 1")        else -> println("otherwise")    }    when (x) {        1 -> println("x == 1")        2 -> println("x == 2")        else -> { // 注意这个块            println("x 不是 1 ，也不是 2")        }    }    when (x) {        in 0..10 -> println("x 在该区间范围内")        else -> println("x 不在该区间范围内")    }    val items = setOf("apple", "banana", "kiwi")    when {        "orange" in items -> println("juicy")        "apple" in items -> println("apple is fine too")    }}fun cycle_fun() {    val items = listOf("apple", "banana", "kiwi")    for (item in items) {        println(item)    }    for (index in items.indices) {        println("item at $index is ${items[index]}")    }    println("----while 使用-----")    var x = 5    while (x > 0) {        println( x--)    }    println("----do...while 使用-----")    var y = 5    do {        println(y--)    } while(y>0)    for (i in 1..4) println(i) // 打印结果为: "1234"    for (i in 4 downTo 1) println(i) // 打印结果为: "4321"也支持指定步长：    for (i in 1..4 step 2) println(i) // 打印结果为: "13"    for (i in 4 downTo 1 step 2) println(i) // 打印结果为: "42"    for (i in 1 until 10) { // i in [1, 10), 不包含 10        println(i)    }}class Person {    var lastName: String = "zhang"        get() = field.toUpperCase()   // 将变量赋值后转换为大写        set    var no: Int = 100        get() = field                // 后端变量        set(value) {            if (value < 10) {       // 如果传入的值小于 10 返回该值                field = value            } else {                field = -1         // 如果传入的值大于等于 10 返回 -1            }        }    var heiht: Float = 145.4f        private set}fun class_test() {    var person: Person = Person()    person.lastName = "wang"    println("lastName:${person.lastName}")    person.no = 9    println("no:${person.no}")    person.no = 20    println("no:${person.no}")    val runoob =  Runoob("菜鸟教程")    println(runoob.siteName)    println(runoob.url)    println(runoob.country)    runoob.printTest()    val runoob1 =  Runoob("菜鸟教程", 10000)    println(runoob1.siteName)    println(runoob1.url)    println(runoob1.country)    runoob1.printTest()}class Runoob  constructor(name: String) {  // 类名为 Runoob    // 大括号内是类体构成    var url: String = "http://www.runoob.com"    var country: String = "CN"    var siteName = name    init {        println("初始化网站名: ${name}")    }    fun printTest() {        println("我是类的函数")    }    // 次构造函数    constructor (name: String, alexa: Int) : this(name) {        println("Alexa 排名 $alexa")    }}open class Pers(var name : String, var age : Int){// 基类}class Student(name : String, age : Int, var no : String, var score : Int) : Pers(name, age) {}fun inherit() {    val s =  Student("Runoob", 18, "S12346", 89)    println("学生名： ${s.name}")    println("年龄： ${s.age}")    println("学生号： ${s.no}")    println("成绩： ${s.score}")}