const domain = "www.test.com";
//"www.test.com" revrese to "com.test.www"
let reversedDomain = "";
const parts = domain.split('.');
console.log(parts.length)
function ReverseString(StrValue){
for (let i = StrValue.length - 1; i >= 0; i--) {
  reversedDomain += parts[i];
  if(i!==0){
    reversedDomain +="."
  }
}
return reversedDomain;
}
console.log(ReverseString(parts));

2.//using reverse and split methods
const domain1 = "www.test.com";
let parts1 = domain1.split('.');
parts1 = parts1.reverse().join('.');
console.log(parts1)

