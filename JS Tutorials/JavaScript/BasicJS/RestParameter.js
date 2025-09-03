//Rest parameter

function sum(...args){
    var add=0;
    for(var arg of args)
    console.log(arg)
    //add +=arg
   // console.log(arg)
    return add;
}
let x=sum(2,3,4,5,6)
//console.log(x)