
const phoneNumber = '97208831114';
const digits = Array.from(phoneNumber,Number)
const duplicates = {};
let p=digits.filter((each,index)=>{
     const digit = digits[index];
  if(digits.indexOf(each) !== digits.lastIndexOf(digit)){
       duplicates[digit] = (duplicates[digit]||0);
        duplicates[digit] +=1;      
  }
  return (digits.indexOf(each) !== index)
})
for (const digit in duplicates) {
 
  console.log(`Digit ${digit} occurred ${duplicates[digit]} times.`);
}
//console.log(p.join() +" this two element have "+count1+" times in this digits "+digits)
