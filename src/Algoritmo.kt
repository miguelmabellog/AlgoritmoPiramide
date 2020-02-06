fun main(args: Array<String>){
    println("Numero de piramide")
    var m: Int = readLine()?.toInt() as Int
    var x=1
    for(i in 1..m){
        for(i in 1..x){
            print("*")
        }
        println("")
        x += 1
    }
    x-=1
    for(i in 1..m){
        for(i in 1..x){
            print("*")
        }
        println("")
        x -= 1
    }

}