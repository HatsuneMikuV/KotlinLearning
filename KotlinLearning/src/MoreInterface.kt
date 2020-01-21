

fun moreinterface() {
    val c =  Child()
    c.foo();
    c.bar();

    val c1 =  Child()
    c1.foo();
    c1.bar();
    println(c1.name)
}

interface MyInterface {
    fun bar()    // 未实现
    fun foo() {  //已实现
        // 可选的方法体
        println("\nfoo")
    }
    var name:String //name 属性, 抽象的
    var age:Int
}

class Child : MyInterface {
    override var name: String = "runoob" //重写属性
    override var age: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
    override fun bar() {
        // 方法体
        println("bar")
    }
}