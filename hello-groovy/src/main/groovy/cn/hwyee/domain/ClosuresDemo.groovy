package cn.hwyee.domain

/**
 * @author hwyee@foxmail.com
 * @version 1.0
 * @ClassName ClosuresDemo
 * @description 闭包测试
 * @date 2023/5/4
 * @since JDK 1.8
 */

//1. 声明闭包,它是属于(instanceof) groovy.lang.Closure 类的。
def listener = { e -> println "Clicked on $e.source" }
assert listener instanceof Closure
//2. 如果不用def或var定义,就用groovy.lang.Closure声明类型。
Closure callback = { println 'Done!' }
//3. 使用闭包的泛型,来指定闭包的返回值类型。
Closure<Boolean> isTextFile = {
    File it -> it.name.endsWith('.txt')
}
/**
 * 启动失败：
 G:\devData\github\groovy\hello-groovy\src\main\groovy\cn\hwyee\domain\ClosuresDemo.groovy：
 21: Invalid duplicate class definition of class cn.hwyee.domain.ClosuresDemo :
 源 G:\devData\github\groovy\hello-groovy\src\maingroovy\cn\hwyee\domain\ClosuresDemo.groovy 包含至少两个
 cn.hwyee.domain.ClosuresDemo 类的定义。
 其中一个是使用 class 语句显式生成的类，另一个是根据文件名从脚本正文生成的类。解决办法是更改文件名或更改类名。
 */
//class ClosuresDemo{
//
//}
/************************闭包的调用***************************************/
def code = { 123 };
assert code() == 123;
assert code.call() == 123


/************************闭包作为方法的最后一个参数时,闭包可以写在方法外***************************************/

def m1(a,Closure closure){
    closure(a)
}
//正常调用
m1(1,{a -> println "${a+1}"})
//写在方法外
m1(1) {a -> println "${a+1}"}

def m2(Closure closure){
    def a = 2
    closure(a)
}
//当只有闭包一个参数时,如果没有歧义的情况下,小括号也能省略
m2(){a -> println "${a+1}"}
m2{a -> println "${a+1}"}