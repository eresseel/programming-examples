println( Math.sqrt( 4 ))    // 2.0
println( Math.sqrt( -1 ))   // NaN
println('still alive')      // still alive

def sqrt(int n) {
    if (n < 0) {
        throw new Exception("The number ${n} was negative")
    }
    return Math.sqrt(n)
}
 
try {
   println( sqrt( -1 ))
} catch(Exception e) {
    println("Exception: ${e}")
}                      // Exception: java.lang.Exception: The number -1 was negative
println('still alive') // still alive
 
println( sqrt( 4 ))    // 2.0
println( sqrt( -1 ))   // exception
println('still alive') // is not executed...