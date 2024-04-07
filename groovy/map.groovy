def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
println colors
println colors.containsKey('red')
println colors.containsKey('black')
 
for (p in colors) {
    println p.key
    println p.value
}

def data = [
    name : 'Foo Bar',
    age : 42,
    email : 'zoo@bor.com',
]
 
println(data)
 
my_keys = data.keySet()
println(my_keys.getClass())     // class java.util.LinkedHashMap$LinkedKeySet
 
our_keys = my_keys as ArrayList
println(our_keys.getClass())    // class java.util.ArrayList
println(our_keys)