var a={
    Fname:'sekh',
    Lname:'rousan',
    age:25,
    work_place:'indium',
    FavPlace:['Kolkata','Banglore','Luckhnow']
    
}

let text= ""
for(let x in a){
      text += a[x]+"\n"
     
}
console.log(text)