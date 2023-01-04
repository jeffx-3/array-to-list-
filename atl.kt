//This simple code lists the arry

fun main() {
    var name= arrayOf("Larry","Evelyne","Rachael","Tricia")
    println(name[0])
        println(name[1])
    println(name[2])
    println(name[3])
    name[0]="peto"
    println(name[0])

    var age=ArrayList<Int>()
    age.add(23)
        age.add(16)
    age.add(13)
    age.add(1)
    println(age[0])
        println(age[1])
    println(age[2])
    println(age[3])
println(name.first())
println(name.last())
println(name.size)

println(age.size)
age.clear()
println(age.size)


}
