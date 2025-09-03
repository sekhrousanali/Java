

//1.A call back is a function, passed as a argument to another function.
//2.This technique allow to call a funtion to anothoer function.
//3.A call back function run after another function has finished.
setTimeout(function bye(){
console.log("bye")
},1000)

function sayHi(){
  console.log("Hi")
}
function sayHello(){
  console.log("hello")
}
function add(num1,num2, callback1){
   console.log(num1+num2)
   callback1();
}
add(1,"2",sayHi)
add("2","2",sayHello)