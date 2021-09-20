import kotlin.random.Random
fun main(){

    val movieslist = arrayListOf<String>()
    var num=0

    while (num<3){
        println("Enter Your best movies")
        var move= readLine()!!.toString()
        movieslist.add(move)
        num++
    }

    println(movieslist)
    for (i in movieslist){
        println(i)
    }
    println("Do you want continue ? y/n")
    var choos = readLine()
    if (choos=="y"){
        println("Enter Your best movies")
        var addone = readLine()!!.toString()
        movieslist.add(addone)

    }else{
        for (i in movieslist){
            println(i)
    }
    println(movieslist)
}}