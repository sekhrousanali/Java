/*1.filter(): This method is used to create a new array
 that contains only the elements from the original array
  that pass a provided test function. */
/*2.It's useful when you want to filter out certain elements from an array 
 based on a condition.*/

let arr2=[12,13,14,57,89,99]
let sal= [8000,7000,8500,5000,6000,9000]
let a2=sal.filter((value,index,array)=>{
    //console.log(value,index,array)
   return value<=7000 && value<=6000
})
console.log(a2)
const value=10;
value=20;
console.log(value)