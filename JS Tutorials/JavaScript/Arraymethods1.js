let num=[1,2,3,]

// let b=num.toString()// convert to string method
// console.log("convert to string method-: "+b, typeof b)

let c=num.join('')// join method
console.log("Join method is-: "+c , typeof c)

let num2=[1,2,9,]
let r =num2.pop()// pop method retur the pooped element,
// from the array last elemet it will return the value
//if you are print the array you will get new array without last element
console.log("pop method retur the pooped element-: "+num2,r)

let num3=[1,2,9,]
let n=num3.push(98)
// push methood return the mew array elem,it will add the element in tha last
console.log(" push methood return the mew array elements-: "+num3,n)

let num4=[99,1,2,3]
let m=num4.shift()// remove frist elements from Array
console.log("remove frist elements from Array-: "+num4,m)

let num5=[1,2,3,4]
let p=num5.unshift(999)// add the one new element at the begining of the array
console.log("add the one new element at the begining-: "+num5,p )

/*1.The slice() method returns selected elements in an array, as a new array.
2.The slice() method selects from a given start, up to a (not inclusive) given end.
3.The slice() method does not change the original array*/
const num6=["apple","mango","banana","kiwi"]
const newArray =num6.slice(1,3)
console.log(newArray)

//splice
//example 1  // splice ,ethod return delete or remove element , 
//and change the original array,
//At position 2, add new items, and remove 1 item:
//Syntax array_name.splice(index,inser_elementNumber,New_element)
const fruits = ["Banana", "Orange", "Apple", "Mango"];

let newArray1=fruits.splice(2, 1, "Lemon", "Kiwi");
console.log("At position 2, add new items, and remove 1 item "+newArray1)
console.log("its creat a new array with added element "+fruits)
//example 2
//At position 2, add 2 elements:
const fruits1 = ["Banana", "Orange", "Apple", "Mango"];
let newArray2=fruits.splice(2, 0, "Lemon", "Kiwi");
console.log("At position 2, add 2 elements "+newArray2)
//example 3
//At position 2, remove 2 items:
const fruits3 = ["Banana", "Orange", "Apple", "Mango", "Kiwi"];
const newArray3=fruits.splice(2, 2);
console.log("At position 2, remove 2 items: "+newArray3)