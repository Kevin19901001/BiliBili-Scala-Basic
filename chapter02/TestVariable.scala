package chapter02

object TestVariable {
  // 声明变量的通用语法
  var a: Int = 10

  // 1、声明变量时，类型可以省略，编译器会自动推导
  var a1 = 20

  // 2、类型确定后，就不能修改，说明Scala是强数据类型语言
  var c = 3.1415926
//  c = "a" // 编译器报错：类型不匹配

  // 3、声明变量时，必须要有初始值
//  var d // 错误的变量声明

  // 4、在声明变量时，可以用var或者val来修饰，var修饰的变量可变，val修饰的变量不可变。
  var e = 55
  e = 66

  val f = 77
//  f = 88  // 报错：对val重新赋值

}
