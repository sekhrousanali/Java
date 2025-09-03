// this is use for user taken
var obj = require("prompt-sync")();

function isPalindromeNumber(number) {
    // Convert the number to a string
    let strNumber = number.toString();
    // Reverse the string and compare it to the original string
    return strNumber === strNumber.split("").reverse().join("");
  }
  var num=obj("type ur number")
// Test the function with some sample numbers
console.log(isPalindromeNumber(num)); // true
console.log(isPalindromeNumber(123)); // false
console.log(isPalindromeNumber(121)); // true
