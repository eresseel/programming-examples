name = 'Foo Bar Moo'
len = name.length()
println(len)          // 11
 
hebrew = 'שלום'
println(hebrew.length())  // 4

fname = name.substring(0, 3)
println(fname)               // Foo
 
mname = name.substring(4, 7)
println(mname)               // Bar
 
lname = name.substring(name.length()-3)
println(lname)               // Moo