# Intro

Kotlin is a Modern language which is fully interoperable with Java (and JavaScript). It targets the JVM, Android, JavaScript and Native.

**Features:**
- Statically typed
- Cross-platform
- General-purpose
- Concise
- Safe
- Interoperable

Official website : [kotlinlang.org](https://kotlinlang.org/)

Try Kotlin here : [play.kotlinlang.org](https://play.kotlinlang.org/)

### Basics (compared to Java)
- No need of `;` to break statements (unlike Java).
- Types are non-null by default (unlike Java). ? marks a type as nullable. String? (nullable string)
- Two types of variable - `var` (mutable) and `val` (immutable - like final in java).
- Kotlin has type inferences (unlike Java). Inference is also supported by functions.
- Kotlin `when` is similar to switch in Java.
- Comments are `// single line comment` and `/* multi line comment */` (similar to Java).
- You do not need to match your file name to your class name (unlike Java).
- One file may have multiple classes or interfaces
- Functions can be created outside classes (unlike Java). So, no need to put functions as static members of classes like done in Java.
- Kotlin supports string templates (unlike Java). `"My name is $firstName $lastName"` for variables and `"${person.age} is ${10 * 4}"` for expressions.
- Kotlin has immutable (only read functions) collections like `listOf()`, `setOf()`, `mapOf()`
- Mutable (read & write) collections like `mutableListOf()`/`arrayListOf()`, `mutableSetOf()`/`hashSetOf()`, `mutableMapOf()`/`hashMapOf()`
- We have similar convieniene function for arrays called `arrayOf()`
- `Unit` type is absense of any type (corresponds to the `void` type in Java)
- `==` for data comparison (objects with same data)   |   `===` for reference comparison (exact same object)


### Kotlin Keywords

<table border="0" cellpadding="1" cellspacing="1" style="margin: 0px; padding: 0px; border-collapse: collapse; width: 688px; white-space: pre-wrap; border: none;"><tbody style="margin: 0px; padding: 0px; box-sizing: border-box; border-top: 1px solid rgb(204, 204, 204);"><tr style="margin: 0px; padding: 0px; box-sizing: border-box;"><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">as</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">break</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">class</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">continue</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">do</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">else</td></tr><tr style="margin: 0px; padding: 0px; box-sizing: border-box;"><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">false</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">for</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">fun</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">if</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">in</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">interface</td></tr><tr style="margin: 0px; padding: 0px; box-sizing: border-box;"><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">is</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">null</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">object</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">package</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">return</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">super</td></tr><tr style="margin: 0px; padding: 0px; box-sizing: border-box;"><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">this</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">throw</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">true</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">try</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">typealias</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 1px solid rgba(0, 0, 0, 0.1); min-width: 100px; color: rgba(37, 38, 94, 0.7);">typeof</td></tr><tr style="margin: 0px; padding: 0px; box-sizing: border-box;"><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 0px; min-width: 100px; color: rgba(37, 38, 94, 0.7);">val</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 0px; min-width: 100px; color: rgba(37, 38, 94, 0.7);">var</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 0px; min-width: 100px; color: rgba(37, 38, 94, 0.7);">when</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 0px; min-width: 100px; color: rgba(37, 38, 94, 0.7);">while</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 0px; min-width: 100px; color: rgba(37, 38, 94, 0.7);">&nbsp;</td><td style="padding: 12px 24px; box-sizing: border-box; border-bottom: 0px; min-width: 100px; color: rgba(37, 38, 94, 0.7);">&nbsp;</td></tr></tbody></table>


### Types & Variables
- Two keywords for variable declaration - **var** and **val**.
- Use **var** when the variable value is to be modified and **val** where the variable value will not change after first assigned.
- **val** variable must be initialized at declaration.
- Unlike Java or C#, you declare the type of a variable after the name, e.g. `var firstName : String`
- Number primitive types are as follows: Double, Float, Long, Int, Short, Byte. There is no automatic conversion between types. You have to explicitly convert them.
- More primitive types: Char, String, Boolean.
- All variable declarations in Kotlin must be initialized.




#### Null

In Kotlin you have to decide whether a variable can be assigned null or not. This applies to both primitives or class types. A nullable variable is marked by assigning ? after the type, e.g. `var firstName: String?`

You can assign a value from not-nullable to nullable type without any problem.

```kotlin
fun main() {
	val firstname: String = "Tom"
	var firstname1: String = "John"
	var firstname2 = "Harry"
	var lastname1: String = ""

	var lastname2: String? = "Thomson"
	var greetings: String? = null

	firstname1 = "Hardy"
	greetings = "Hello"

	println(firstname1)
	println("Hi $firstname2")
	println(greetings + " " + firstname + " " + lastname2)
	println("$greetings $firstname $lastname2")
}
```

```kotlin
fun main(args : Array<String>) { 
    val firstName : String = "Adam"
    val name : String? = firstName 
    print("$name") 
}
```

The other way around though requires that you declare that this nullable variable does not contain null at the point of assignment with !! operator (which pretty much declares : "I am sure this nullable variable is not null at this point")

```kotlin
fun main(args : Array<String>) { 
    val name : String? = "Adam" 
    val firstName : String = name!! 
    print("$firstName") 
}
```
					
#### Type inference

Kotlin is pretty smart about inferring what type a variable is, whether it is primitives or class. This is similar to the var keyword in C#.

```kotlin
fun main(args : Array<String>) { 
    val firstName = "Adam" 
    val middle = 'c' 
    val lastName = "Brown" 
    val age = 15 
    println("$firstName $middle $lastNameis $age") 
}
```

### Control Structures

#### if statement

Kotlin **if** statement is similar to other languages

```kotlin
if(surname != null) { println(surnamename) } else {}

val greetinToPrint = if(greeting != null) greeting else "Hi"
println(greetinToPrint)
```

```kotlin
fun main(args : Array<String>) {
  val total = 10
  
  if (total > 10){
      println("$total is greater than 10") 
  }else if (total > 5){
      println("$total is greater than 5")
  }else{
      println("$total is less than 6")
  }
}
```

#### when statement

```kotlin
val a = 12
val b = 5

println("Enter operator either +, -, * or /")
val operator = readLine()	// used for input

when (operator) {
	"+" -> println("$a + $b = ${a + b}")
	"-" -> println("$a - $b = ${a - b}")
	"*" -> println("$a * $b = ${a * b}")
	"/" -> println("$a / $b = ${a / b}")
	else -> println("$operator is invalid")
}
```
```kotlin
var greeting: String? = null

val greetingToPrint = when(greeting) {
	null -> "Hi"
	else -> greeting
}   
println(greetingToPrint)
```

#### forEach statement

```kotlin
val things = arrayOf("Kotlin", "Coding", "Instagram")

println(things.size + ", " + things[0] + ", " + things.get(0))

for(thing in things) { println(thing) }   // normal for loop

things.forEach { println(it) }   // forEach is a more functional/lambda approach  
```

`it` is the default name for each element of the array that is passed in this lambda function. 
We can rename `it` to anything, for eg. thing

```kotlin
things.forEach { thing -> println(thing) }   // we lose index by this method

things.forEachIndexed { index, thing ->	println("$thing is at index $index") }   // way to use index
```

if, when and forEach can also be used as expression


### Collections

By default, a collection is immutable, i.e., new values cannot be added or subtrated once it is created

#### Lists

List syntax is similar to arrays (shown above), but lists have more functions (after dot)

```kotlin
val things = listOf("Kotlin", "Coding", "Instagram")   // listOf is used to create a immutable list

println(things.size + ", " + things[0] + ", " + things.get(0))

things.forEach { thing -> println(thing) }
```
```kotlin
val things = mutableListOf("Kotlin", "Coding", "Instagram")   // mutableListOf is used to create a mutable list

things.add("Youtube");   // we have more functions like add in a mutable list
```

#### Maps
```kotlin
val map  = mapOf(1  to "a", 2 to "b", 3 to "c")    // mapOf - immutable map | "to" used to create pair of key & value for map

map.forEach { key, value -> println("$key -> $value") }   // map forEach returns both key & value

val map2  = mutableMapOf(1  to "a", 2 to "b", 3 to "c")   // mutableMapOf is used to create a mutable map
map2.put(4, "d")
```




# Functions
We are going to spend a considerable time in discussing function because it has many different forms and subtleties. Here is a list of facilities that Kotlin provides for functions

- Single expression function
- Optional parameter
- Positional argument and named argument
- Variable argument
- Function type
- Function literals
- Callable references
- Extension functions
- Infix function call
- Local function
- Closure
- Generic function
- Operator overloading

Below is an example of functions

```kotlin
fun getGreeting(): String { return "Hello Kotlin"}

fun main()  {
	println(getGreeting())
}
```

- Functions can exists on their own.
- It is marked by **fun** keyword.
- If a function returns value, you declare it after the function name.
- `englishGreeting()` is a *single expression function*.
- A void function such as `greet()` returns Unit type but you are not required to declare it.
- All parameters in a Kotlin function are read only. You are actually not allowed to mark it with either `val` or `var` keyword.

```kotlin
fun main(args : Array<String>) { 
    greet(englishGreeting()) 
    greet(italianGreeting())
} 

fun greet(msg : String){ 
    println(msg) 
} 
    
fun englishGreeting() : String = "Hello world" 
    
fun italianGreeting() : String{ 
    return "bon giorno" 
}
```

Idea behind **Lambda** syntax is that if you have a function and its only param is another param then you can omit the pranthesis altogether and you can pass that function in by specifying this open & close parenthesis


**Higher order Functions** are fun that either return a fun or take fun as param


**Varargs & Spread Operator**
```kotlin
fun sayHello5(greeting:String, vararg itemsToGreet:String) {
	itemsToGreet.forEach { itemToGreet ->
		println("$greeting $itemToGreet")
	}
}

sayHello5("Hi")
sayHello5("Hi", "Kot", "Lin", "Code")
sayHello5("Hi", *things)  // spread out the array
```

There is nothing wrong in including a collection param in your func
however, functions in kt provide an additional funtionality that can satisfy this usecase & provide lil additional flexibility

we have spread operator which is `*`
for eg -> *things 


#### Single expression function

This is a shorthand form in defining a function when you only have a single expression to be executed.

```kotlin
fun main(args : Array<String>) {
   val res = add(1,1)
   show("$res")
}


fun add(a : Int, b : Int) = a + b
fun show(msg : String) = println("$msg")
```

As you can see above, in a single expression function, the function return type is inferred. You can declare the return type if you want to such as below. 

```kotlin
fun main(args : Array<String>) {
   val res = add(1,1)
   show("$res")
}


fun add(a : Int, b : Int) : Int = a + b
fun show(msg : String) : Unit = println("$msg")
```


#### Optional parameters

Kotlin allows you to assign default values for your parameters, making them optional. 

```kotlin 
fun main(args : Array<String>) {
  show()
  show("Good morning")
}


fun show (msg : String = "Hello World"){
    println("$msg") 
}
```

If you are mixing mandatory parameter and optional parameter, the mandatory parameters must be listed first.

#### Arguments

```kotlin
fun main(args : Array<String>) { 
    greet(firstName = "Frasensco", lastName = "Merini") 
    greet(lastName = "John", firstName = "Stamos") 
    greet("Borat", "Ismail") 
    greet("Crystal", lastName = "Stamos") 
    call("Xavier", age = 20, location = "Portugal") 
} 
    
fun greet(firstName : String, lastName : String){
    println("Good morning $firstName $lastName") 
} 
    
fun call(name : String, location : String, age : Int){ 
    println("Call $name who lives at $location and he is $age old") 
}
```
				
Kotlin allows positional argument, named argument and the mix between the two. When you mix named and positional argument, you must start with positional argument.


#### Variable arguments

Use the keyword **vararg**.

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy")
}

fun names(vararg  names : String){
  for(n in names){
    println("$n")
  }
}
```

If **vararg** parameter is not the last parameter, named argument must be used to supply the function argument.

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy", age = 20)
}

fun names(vararg  names : String, age : Int){
  for(n in names){
    println("$n is $age old")
  }
}
```


#### vararg produces array of argument

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy")
}

fun names(vararg  names : String){
  println("Argument length is ${names.size}")
  println("${names[0]}")
  val nns : Array<String> = names
  println("${nns[1]}")
}
```

#### Using array to supply variable arguments

Use the * operator in front of the array variable

```kotlin
fun main(args : Array<String>) {
  val n = array("John", "Adam", "Joy")
  names(*n)
}

fun names(vararg  names : String){
  println("Argument length is ${names.size}")
  println("${names[0]}")
  val nns : Array<String> = names
  println("${nns[1]}")
}
``` 

#### Passing one varargs argument to another

```kotlin
fun main(args : Array<String>) {
  val n = array("John", "Adam", "Joy")
  fugitives(*n)
}
,  
fun fugitives(vararg escapees: String){
  names(*escapees) 
}

fun names(vararg  names : String){
  println("Argument length is ${names.size}")
  println("${names[0]}")
  val nns : Array<String> = names
  println("${nns[1]}")
}
```
Since **vararg** creates an array, you simply use the * operator to pass one **vararg** to another.

#### Function Types and Function Literals

A function type is a type consisted of a function signature and function return type that are separated by -> operator. In its simplest form, it looks as follows: 

`() -> Unit`

Above is a type for a function that takes no parameter and returns a Unit (void in other language parlance)

`() -> String`

Above is a type for a function that takes no parameter and return a String

`(String) -> Unit`

Above is a type for a function that takes a string and returns nothing.

`(String, Float) -> Unit`

Above is a type for a function that takes two parameters (String and Float) and returns nothing.

Because a function type is just a type, it means that you can assign it to a variable, you can pass it as a function argument and you can return it from a function.

#### Different ways to write function literals

```kotlin
val m = { (x : String) -> println("$x") } 
val n : (String) -> Unit = { x -> println("$x") } 
val o : (String) -> Unit = { (x : String) -> println("$x") } 

fun main(args : Array<String>) { 
    m("good morning")
    n("good morning") 
    o("good morning") 
}
```

Above code is an example of function literals. All `m`, `n` and `o` represent the same function.
            		
Below is a function that returns a function type

```kotlin
fun main(args : Array<String>) { 
    val greet = greetingFrom("Cairo, Egypt") 
    greet("Brown") 
} 

fun greetingFrom(location : String) : (String) -> Unit{ 
    return { name -> println ("Hello $name from $location")}
}
```				
	
Below shows that you can specify a function type as an argument and supply it with function literal with corresponding function signature and return type.

```kotlin
fun evening(): String = "Good Evening" 
fun main(args : Array<String>){ 
    say({ "good morning"}) 
    say { val msg = "good afternoon" msg } 
    say({evening()})
} 

fun say(greet : () -> String){ 
    println("${greet()}") 
}
```

#### Callable references

How about if you already have a function that you want to pass as a parameter? You prefix the function name with '::'

```kotlin
fun main(args : Array<String>) {
 calcAndShow(10,10, ::add) //20
 calcAndShow(10,10, ::multiply) /100
 calcAndShow(10,19, { x, y -> x - y }) //-9
}

fun calcAndShow(a : Int, b : Int,  func : (a : Int, b : Int) -> Int){
 val result = func (a, b)
 println("$result")
}

fun add(a : Int, b : Int) : Int = a + b
fun multiply (a : Int, b : Int) : Int = a * b
```


#### Function expansion

When you call a function which has a function type as the last argument, you can expand it by { }

```kotlin
fun main(args : Array<String>) {
    val a =  calculate(1) { x -> 10 + x } //11
    val b = calculate(2) { x -> 20 * x } //40

    println("a = $a, b = $b")
}

fun calculate(a : Int,  calc : (Int) -> Int) : Int{
    return calc(a)
}
```

#### Closure

Kotlin support Closure as highlighted by the example below

```kotlin
fun main(args : Array<String>) {
    val total = add(1)(2)
    println("Total value is $total")
}

fun add(a : Int) : (Int) -> Int{
    return { x -> a + x }
}
```

#### Local function

You can declare a function inside a function. It will have access to the local variable at the parent function.
```kotlin
fun main(args : Array<String>){ 
    accumulate() 
} 

fun accumulate(){
    var i = 0 

    fun add(){ 
        i++ 
    } 

    for (i in 1..10){
        add() 
    } 

    println("i is now $i") 
}

//It prints "i is now 10"
```


#### Extension function

Extension function enables a function to be accessed from the type function. It works in the form of __type.function__
Inside the function, the keyword `this` refers to the instance. 

For example
```kotlin   
fun Int.show(){
    println("This number is $this")
}
    
fun main(args : Array<String>){
    3.show()
}
```

Above example shows how the `Int` built in type has been enriched by `show` extension function. Notice the use of `this` keyword that refers to the `3` number.


**Notice** You can extend a function on a nullable type and it will be accessible for both nullable and non nullable type. The reverse though does not apply.

```kotlin
fun Int?.show(){
    println("This number is $this")
}
 
fun Int.show2(){
    println("This number is $this")
}

fun main(args : Array<String>){
    var number : Int? = null
    number.show()
    5.show()
    //number.show2() will not compile
}
```

    
#### Extension function expressed in function literals

```kotlin
val show = { Int.() -> println("This is number $this") }
val add = { Int.(number : Int) : Int -> 
    val now = this + number
    now
}

fun main(args : Array<String>){
    5.add(10).show()
}
```

Both `show` and `add` extension functions are expressed in literal format. Please notice that `add` function returns an `Int`.

    
#### Extension function in infix form
```kotlin
fun main(args : Array<String>) {
   val res = 1 add 2
   println("$res")
}

fun Int.add (one : Int) : Int = this + one
```

If the extension function only takes one argument, you can call them in infix form (you drop the . between the type and the function). So instead of `1.add(2)`, you can call it in the form of `1 add 2`. This makes certain constructs looks natural (more like an operator than a function call) and especially useful in construction DSL in Kotlin.

#### Variable arguments and function type argument

`vararg` parameter can also be naturally combined with a function type parameter.

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy"){ 
    name  -> println ("$name")
  }
}

fun names(vararg  names : String, print : (String) -> Unit){
  for(n in names){
   print(n)
  }
}
```

above code can also be expressed in this matter (using named argument)
```kotlin

fun main(args : Array<String>) {
  names("John", "Adam", "Joy", print = {name  -> println ("$name")})
}

fun names(vararg  names : String, print : (String) -> Unit){
  for(n in names){
   print(n)
  }
}

```

# Object Oriented Programming

- In a class, property must be initialized or abstract
- An init block is a code that is run anytime an instance of this class is run
- We can have multiple init blocks that will be proessed in the order that is defined within class body
- We do not need getters/setters for property access
- Property getters/setters are automatially generated by the compiler - getters for val, getters & setters for var
- Visibility of classes, properties, methods, etc are public by default
- Visibility modifiers: public, internal (public within the module), private (within the file), protected (within class or subclasses)
- Interfaces can provide default implementations of methods
- We can provide properties in interfaces, but default value is not allowed
- We use override keyword to override methods & properties
- By default, classes are closed (like final in Java), i.e., it cannot be extended. We need to add open keyword to allow inheritence.
- Also, to override a property in inherited class, it must be marked open




```kotlin
fun main(args : Array<String>) {
  class local (val x : Int)
  
  val y = local(10)
  println("${y.x}")
}
```

Above code is a sample of __Local Class__, one of many support that Kotlin has for Object Oriented Programming. 

- enum class
- sealed class
- object class
- data class
- Abstract classes
- Primary constructor
- Delegation
- Generic classes
- Class objects
- Nested classes
- Local classes
- Object expressions
- Traits
- Anonymous Analyzer
- Anonymous Objects

**Kotlin classes**

Kotlin classes does not have:
- Static member (methods or properties)
- Secondary constructors
- No fields, just properties

### Simplest Kotlin class definition
```Kotlin
class Person


fun main(args : Array<String>) {
  val p = Person()
  val name = javaClass<Person>().getSimpleName()
  println("$name")
}
```

The class Person is as simple as you can get to declare a class


by default, a Kotlin class is final. So to make a class inheritable, you must you the keyword open in front of it


```kotlin
open class Person
class Hero : Person()


fun main(args : Array<String>) {
  val name = javaClass<Person>().getSimpleName()
  println("$name")
  
  val name2 = javaClass<Hero>().getSimpleName()
  println("$name2")
}
```





### Visibilities
Kotlin has four visibilities:
- private
- protected
- internal
- public

If you do not declare a visibility modifier, it is assumed to be `internal` visibility.

```kotlin
fun main(args : Array<String>) {
    val x = Visibility()
}

class Visibility{
 public var name : String = ""
 private var age : Int = 0
 protected var address : String = ""
 internal var friends : String = ""  
 var status : String = "Single"
}
```

An empty class is off course useless. Let's add some properties to it so it can hold data

```kotlin
open class Person
  
class Hero : Person(){
  public var name : String = ""
  public var age : Int = 30
  }


fun main(args : Array<String>) {
  val h = Hero()
  h.name = "Superman"
  h.age = 30
  
  println("${h.name} is ${h.age} years old")
}
```

Rule
- Every declared property must be initialized, without exception.
- a var property means it can be modified
- a val property is a constant

### Primary constructor
Unlike many other OO language, Kotlin only allows one single constructor 

```kotlin
open class Person
  
class Hero (n: String, a : Int) : Person(){
  public var name : String = n
  public var age : Int = a
  }


fun main(args : Array<String>) {
  val h = Hero("Superman", 30)
  println("${h.name} is ${h.age} years old")
}
```

As you can see, the constructor parameter n and a are being used to initialized their respective properties.

**Data classes** are kotlins way  of providing concise immutable data types... it is going to generate equals hashcoded to string... they will be considered equal if data they contain is equal... also, they give us effective copy construcors... x.copy()



















---







```kotlin
	sayHello1()
	sayHello2()

fun sayHello1(): Unit {	println("Hello")}

fun sayHello2() { println("Hello")}

fun getGreeting(): String = "Hello Kotlin" //single expression function
fun getGreeting() = "Hello Kotlin" //also, single expression function

fun sayHello3(itemToGreet: String) {
	val msg = "Hello " + itemToGreet // or 	val msg = "Hello $itemToGreet"
	println(msg )
}

fun sayHello3(itemToGreet: String) { println("Hello $itemToGreet")}

fun sayHello3(itemToGreet: String) = println("Hello $itemToGreet")

fun sayHello3(greeting:String, itemToGreet: String) = println("$greeting $itemToGreet")





fun sayHello4(greeting:String, itemsToGreet: List<String>) {
	itemsToGreet.forEach { itemToGreet ->
		println("$greeting $itemToGreet")
	}
}

sayHello4("Hi", things2)

// varargs, named arguments, default param values

sayHello4("Hi", listOf())



fun greetPerson(greeting:String, name: String) = println("$greeting $name")
greetPerson(greeting:"hi", name:"John")   
greetPerson(greeting = "hi", name = "John")    // named arguments syntax
greetPerson(name = "John", greeting = "hi") // any order possible, but must take both arguments; can also be used forr varargs

fun greetPerson2(greeting:String = "Hello", name: String = "Kotlin") = println("$greeting $name")  // default param values
greetPerson2(name = "John")

//This  helps us replicate builder pattern without writing getters, seetings, private coonstructors, etc

class Person  // constructor not required
class Person constructor()   // empty primary construtor
class Person()  // empty primary construtor
---
val person = Person()  // new keyword not required

class Person2(firstName:String, lastName:String)
---
val person = Person("John", "Thomson")

class Person2(_firstName:String, _lastName:String) { // primary contrutor
	val firstName: String                            // properties
	val lastName: String

	init {
		firstName = _firstName
		lastName = _lastName
	}
}
or 
class Person2(_firstName:String, _lastName:String) { // primary contrutor
	val firstName: String = _firstName
	val lastName: String = _lastName
}
or
class Person2(val firstName:String, val lastName:String) // primary contrutor

val person = Person2("John", "Thomson")
println(person.lastName)

class Person2(val firstName:String, val lastName:String) {
	
	init { println("init 1") }

	construtor(): this("Peter", "Parker") {   // secondary constructor with calling primary constructor
		println("seconndary constructor")
	}

	init { println("init 2") }
}
or
class Person2(val firstName:String = "Peter", val lastName:String = "Parker")

val person = Person2()   // output init1 init2 seconndary constructor

class Person2(val firstName:String = "Peter", val lastName:String = "Parker") {
	var nickName: String? = null
}

person.nickName = "Shades"

class Person2(val firstName:String = "Peter", val lastName:String = "Parker") {
	var nickName: String? = null
	set(value) {				// overriding setter
		field = value;
	}
	get() {						// overriding getter
		println("returned value is $field")
		return field;
	}
	
	fun printInfo() {
		val nick = if(nikName != null) nickName else "no nickname" 
		val nick = nickName ?: "no nickname" // same as above using elvis operator
	}
}

person.printInfo()


interface PersonInfoProvider
class BasicInfoProvider: PersonInfoProvider

interface PersonInfoProvider {
	fun printInfo(person: Person)
}

abstract class BasicInfoProvider: PersonInfoProvider

class BasicInfoProvider2: PersonInfoProvider {
	override fun printInfo(person: Person) {
		// super.printInfo()     // not compulsory in this case
	}
}

val provider = BasicInfoProvider2()

class D: interface A, interface B, interface C

if(infoProvider is SessionInfoProvider) ...
else ...

if(infoProvider !is SessionInfoProvider) ...
else ...

if(infoProvider is SessionInfoProvider) {
	(infoProvider as SessionInfoProvider).getSessionId	// manual type casting
	infoProvider.getSessionId				// smart casting
}
else ...

class Fancy: BasicInfoProvider()   // inheritance

val provider = object : PersonInfoProvider {	// object express anonymous inner class; for eg. can be used for click listener
	...
	new fun
}

suppose we want to create factory to create entity - we can use companion object
a companion object is scoped to an instance of another class

class Entity private construtor(val id: String) {
	companion object {				// can be rename like "comapanion object Factory"
		fun create() = Entity("id")
	}
}

val entity = Entity.Companion.create()		// same as Entity.create(), writing COmpanion is not required
val entity = Entity.Factory.create()		// suppose we have named it Factory

companion objects are like any other class, an implement interface or inherit or have properties or methods

object declaration is a convenient way of creating threaad safe singletons within kt

object EntityFacctory {
	fun create() = Entity("id")
}
class Entity (val id: String) {
}

enum class EntityType {
	EASY, MEDIUM, HARD
}

val id = UUID.randomID().toString()

sealed classes allow us too define related class hierarhies... for eg. can be used where result is "success or failure" or "easy, medium or hard"
with sealed classes we can have different propeerties (key diff bw enum & sealed)... compiler will use smart casting


sealed class Entity() {
	data class Easy(val id: String, val name: String): Entity()		// data classes
	data class Medium(val id: String, val name: String): Entity()
	data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun Entity.Medium.printInfo() {		// extension function
	...
}

fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {		// higher order funstion
	list.forEach {
		if(predicate(it)) {
			println(it)
		}
	}
}

val list = listOf("Kotlin", "Java", "C++", "Javascript")
printFilteredStrings(list, {it.startsWith("K")})		// we have passed our lambda withing parenthesis

printFilteredStrings(list) {	// we can take use of lambda syntax, same as above
	it.startsWith("K")
}

val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
list
	.filterNotNull()
	.take(3)			// or takeLast(3)    to take that many elements
	.filter {
		it.startsWith("J")
	}
	.map {
		it.length
	}
	.forEach {
		println(it)
	}

output: 4 or 10 (for last 3)

list
	.filterNotNull()
	.associate {it t it.length}
	.forEach {
		println("${it.value}, ${it.key}")
	}

val map = list
	.filterNotNull()
	.associate {it t it.length}

the kt standard lib also provides a variety of fun to help us pull out individual elements from a collection

val language = list.first()    // or .last()

val language = list.filterNotNull().find{it.startsWith("Java")}     // or .findLast {}

strings in kt have a useful fun called orEmpty
val language = list.filterNotNull().find{it.startsWith("foo")}.orEmpty()     // to default collection to empty instead of null 

kt has 1st class supp for fun, inluding fun types and higher order fun... and kt standard lib builds upon those tools and provides a rich set of fun operator for us to use... this allows us to build powerful functional chains to transform our data and make complex workflows much simpler







model data
Kotlin proj default
--

top level variables and functions & var and fun associated with class
--

toString(), hashCode(), ...

we have extension function or extension properties on existing class

higher order funtions & functional data type

invoke() method....

functional types...

these types of functions will be useful in click & event listeners etc

kotlin standard library




⭐️ Course Contents ⭐️
⌨️ (0:00:50​) Create Your First Kotlin Project
⌨️ (0:04:23​) Hello World
⌨️ (0:06:33​) Working With Variables
⌨️ (0:11:04​) Type System
⌨️ (0:15:00​) Basic Control Flow
⌨️ (0:21:31​) Basic Kotlin Functions
⌨️ (0:27:12​) Function Parameters
⌨️ (0:32:52​) Arrays
⌨️ (0:35:28​) Iterating with forEach
⌨️ (0:41:17​) Lists
⌨️ (0:42:47​) Maps
⌨️ (0:45:05​) Mutable vs Immutable Collections
⌨️ (0:49:24​) Vararg Parameters
⌨️ (0:54:21​) Named Arguments
⌨️ (0:56:26​) Default Parameter Values
⌨️ (1:00:27​) Create A Simple Class
⌨️ (1:03:35​) Adding Class Properties
⌨️ (1:05:15​) Class Init Block
⌨️ (1:06:40​) Accessing Class Properties
⌨️ (1:07:32​) Primary Constructor Properties
⌨️ (1:08:17​) Secondary Constructors
⌨️ (1:09:50​) Working With Multiple Init Blocks
⌨️ (1:11:30​) Default Property Values
⌨️ (1:11:59​) Properties With Custom Getters/Setters
⌨️ (1:16:52​) Class Methods
⌨️ (1:20:12​) Visibility Modifiers - Public/Private/Protected/Public
⌨️ (1:22:30​) Interfaces
⌨️ (1:24:21​) Abstract Classes
⌨️ (1:26:13​) Implementing An Interface
⌨️ (1:26:35​) Overriding Methods
⌨️ (1:28:30​) Default Interface Methods
⌨️ (1:29:30​) Interface Properties
⌨️ (1:31:40​) Implementing Multiple Interfaces
⌨️ (1:32:57​) Type Checking And Smart Casts
⌨️ (1:36:18​) Inheritance
⌨️ (1:43:07​) Object Expressions
⌨️ (1:45:06​) Companion Objects
⌨️ (1:49:51​) Object Declarations
⌨️ (1:52:41​) Enum Classes
⌨️ (1:58:16​) Sealed Classes
⌨️ (2:00:07​) Data Classes
⌨️ (2:12:25​) Extension Functions/Properties
⌨️ (2:16:40​) Higher-Order Functions
⌨️ (2:29:07​) Using The Kotlin Standard Library






private lateinit var       // because late initialization, private so that it can be referenced
viewholder provides access to all views of one elemenet of recycler view
kotlin.math//
companion object are singleton varible defined constant  //similar to static in java
we an access its memebers directly through the ontaining class
.shuffled()
data class
!!
interface//
delegate
color shades
setup recyclerview//
let 
```
