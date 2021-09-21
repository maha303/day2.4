import kotlin.random.Random
fun main(){

    val movieslist = arrayListOf<String>()

    while (true) {
        println("Enter Your best movies")
        movieslist.add(readLine()!!)
        if (movieslist.size >= 3) {

            println("Do you want continue ? y/n")
            if (readLine()!!.uppercase() != "Y") {
                break
            }
        }
    }

    for (i in movieslist){
        println(i)
    }}


