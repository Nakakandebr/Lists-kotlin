fun main(){
println( getstrings(listOf("cow","goat","sheep","cat","hen","duck","dog","pig","turkey","man")))

println(height(listOf(5.9,4.9,9.0,5.7,8.0)))
    personsorted()
addedPeople()
    var carList = listOf(
   Car("KR143",120.0),
  Car("CR12",86.0),
   Car("TY23",49.0),
   Car("UG428",85.0),
)
println(registrationMileage(carList))

}
//Question1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun getstrings(name:List<String>):List<String>{
    var y= listOf<String>()
    for (x in name) {
        if (name.indexOf(x) % 2 == 0) {
            y+=x
        }

    }
    return y

}
//Question2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class PeoplesHeight(var average: Double, var sum: Double)

fun  height(heights: List<Double>):PeoplesHeight {
    val average = heights.average()
    var sum = heights.sum()
    val y = PeoplesHeight(average, sum)
    return y
}
//Question3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age.
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
fun personsorted(){
    val person1= Person("Jackson",33,5.78,60.90)
    val person2=Person("Oliver",23,5.45,50.00)
    val person3=Person("Tasha",45,6.20,60.30)
    var people= listOf(person1,person2,person3)
    var sortedAges=people.sortedByDescending { people-> people.age }
    println(sortedAges)
}
//Question 4
//Given a list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one go.
fun addedPeople() {
   var person4= Person("Bridget",22,124.0,68.0)
   var person5= Person("Racheal",22,142.0,58.0)
   println(listOf(person4, person5))

}

//Question 5
//Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of all vehicles in the list.

data class Car( var registration: String, var mileage: Double)
fun registrationMileage(vehicleList: List<Car>): Double {
   var sumMileage = 0.0
   for (x in vehicleList){
        sumMileage += x.mileage
   }
   return sumMileage/vehicleList.size
}
