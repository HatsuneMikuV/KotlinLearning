
/**用户基类**/
open class Personn(name:String){
    /**次级构造函数**/
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
    }
}

/**子类继承 Person 类**/
class Studentt:Personn{
    /**次级构造函数**/
    constructor(name:String,age:Int,no:String,score:Int):super(name,age){
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}

/**用户基类**/
open class Persont{
    open fun study(){       // 允许子类重写
        println("我毕业了")
    }
}

/**子类继承 Person 类**/
class Studentn : Persont() {

    override fun study(){    // 重写方法
        println("我在读大学")
    }
}

open class A {
    open fun f () { print("A") }
    fun a() { print("a") }
}

interface B {
    val count: Int
    fun f() { print("B") } //接口的成员变量默认是 open 的
    fun b() { print("b") }
}

class C() : A() , B{
    override var count: Int = 0
    override fun f() {
//        super<A>.f()//调用 A.f()
//        super<B>.f()//调用 B.f()
        print('C')
    }
}


fun moreclass() {

    Studentt("Runoob", 18, "S12345", 89)

    val s =  Studentn()
    s.study();

    val c =  C()
    c.f();
}

/*
1、子类继承父类时，不能有跟父类同名的变量，除非父类中该变量为 private，或者父类中该变量为 open 并且子类用 override 关键字重写:
2、子类不一定要调用父类和接口中共同拥有的同名的方法
3、关于子类不能用 val 重写父类中的 var，我的猜测是：子类重写父类属性，
也就相当于必须重写该属性的 getter 和 setter 方法，而子类中的 val 不能有 setter 方法，
所以无法“覆盖”父类中 var 的 setter 方法，相当于缩小了父类中相应属性的使用范围，是不允许的，
就像我们不能把父类中一个 public 方法重写成 private 方法一样。
4、如果一个变量想要在定义的时候被初始化，则该变量必须拥有 backing field 字段，
该变量的默认 getter 和 setter 方法中是有定义 field 字段的，
但是如果我们重写了这个变量的 getter 方法和 setter 方法，
并且在 getter 方法和 setter 方法中都没有出现过 filed 这个关键字，
则编译器会报错，提示 Initializer is not allowed here because this property has no backing field，
除非显式写出 filed 关键字（哪怕它什么都不干，只要放在那里就可以了，
我理解是出现一次就相当于“声明”过了，就可以用了，而在定义变量的时候初始化是要求 field 被“声明”过才可以）：
*/