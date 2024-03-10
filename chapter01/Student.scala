package chapter01

import chapter01.Student.school

class Student (name: String, age: Int){

  def printInfo(): Unit = {
    println("name: " + name + "   " + "age: " + age + "   " + "school: " + school)
  }

}

object Student{
  var school = "clark school"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 23)
    val bob = new Student("bob", 24)
    val kevin = new Student("Kevin", 25)

    alice.printInfo()
    bob.printInfo()
    kevin.printInfo()
  }
}
