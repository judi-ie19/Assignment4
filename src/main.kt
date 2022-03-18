fun main(){
    var result=product(arrayOf(4,6,8,5))
    println(result)
    var output=sumArray(arrayOf("judith",21.5,32.5,false,10.2))
    println(output)
    var total=arrayOfCharacters(arrayOf('t','e','g','a','d','o'))
    println(total)

}
 fun product(numbers:Array<Int>):Int {
     var multiple = 1
     numbers.forEach { number ->
         multiple *= number
     }
     return multiple

 }
fun sumArray(mixedArray: Array<Any>):Double{
    var sum=0.0
    mixedArray.forEach { num ->
        if (num is Double) {
            sum+= num      }

    }

    return sum
    }
fun arrayOfCharacters(vowels:Array<Char>):Int {
    var word = 0
    vowels.forEach { vowel ->
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            word++
        }
    }
        return word

    }
