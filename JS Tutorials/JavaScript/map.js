// map(): This method is used to create a new array with the same length as the original array,
//  but with each element transformed according to a provided function. 
// It's useful when you want to transform every element in an array and create a new array with the transformed elements.

/*Note-:Now, when you run this code, the map() method will iterate over
 each element in the arrVariable array. For each element, 
 it will log the value, index, and array to the console.
 Then, it will return the value incremented by 1. 
 The resulting new array (a) will contain the incremented values [13, 14].*/

 let arrVariable=[12,13]
let a=arrVariable.map((value,index,array)=>{

    console.log(value,index,array)
    return value +1
})
console.log(a)
