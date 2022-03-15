fun main(){
    var numbers = arrayOf(45,64,32,88,90,105,9)
    println(numbers[3])
    // get the index of an array element
    var index =numbers.indexOf(90)
    println(index)
    // add an element to an array
    numbers = numbers.plus(1)
    println(numbers.contentToString())

    var names =arrayOf("Jane","Stella","Agnes","Carol")
    println(names[2])
    //add an element to an array
    names = names.plus("Judy")
    println(names.contentToString())
    //set a value at a certain index
    var persons =arrayOf("Jane","Stella","Agnes","Carol")
     persons.set(1,"Wangari")
    println(persons.contentToString())

    var kenya = arrayOf(5200000,66.95,"Uhuru Kenyatta",true)
    println(kenya.contentToString())
}