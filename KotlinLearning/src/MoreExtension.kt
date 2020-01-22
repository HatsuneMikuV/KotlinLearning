class User(var name:String)

/**扩展函数**/
fun User.Print(){
    print("用户名 $name")
}


open class F

class DD: F()

fun C.foo() = "c"   // 扩展函数 foo

fun DD.foo() = "dddddddd"   // 扩展函数 foo

fun printFoo(c: DD) {
    println(c.foo())  // 类型是 C 类
}
fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}
fun moreextension() {

    var user = User("Runoob")
    user.Print()

    val l = mutableListOf(1, 2, 3)
    // 位置 0 和 2 的值做了互换
    l.swap(0, 2) // 'swap()' 函数内的 'this' 将指向 'l' 的值

    println(l.toString())

    var d = DD()
    printFoo(d)

    var t = null
    println(t.toString())
}


// 扩展函数 swap,调换不同位置的值
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]     //  this 对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}
