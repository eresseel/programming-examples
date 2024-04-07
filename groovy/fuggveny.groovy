hi()
 
def hi() {
    println("Hello World!")
}

def add(x, y) {
    return x+y
}
 
z = add(2, 3)
println(z)   // 5

z = add('abc', 'def')
println(z)     // abcdef
 
 
z = add('abc', 42)
println(z)      // abc42