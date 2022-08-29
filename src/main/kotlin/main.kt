import kotlin.random.Random

fun main(){
    var num = 0
    var count = 0
    var numcount = 0

for (count in 1..2000){
    num = Random.nextInt(from = 20, until = 45)
    if (num > 38){
        numcount = numcount + 1
    }
    }
println(numcount)
}