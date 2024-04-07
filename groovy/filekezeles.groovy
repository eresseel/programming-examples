sum = 0
 
fh = new File('./numbers.txt')
println fh.getClass()        // class java.io.File
 
def lines = fh.readLines()
 
lines.each { line ->
    sum += line as Integer
}
 
println "The sum is: " + sum   // 126

sum = 0
 
fh = new File('./numbers.txt')
reader = fh.newReader()
println reader.getClass()  // class java.io.LineNumberReader
 
while ((line = reader.readLine()) != null) {
    sum += line as Integer
}
 
println "The sum is: " + sum   // 126