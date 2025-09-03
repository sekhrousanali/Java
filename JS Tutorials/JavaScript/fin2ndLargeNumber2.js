const phoneNumber = 9720883514;

// Convert the phone number to a string
const numberString = phoneNumber.toString();
// Convert the string to an array of digits
const digitsArray = Array.from(numberString, Number);
// Find the maximum number in the array
const maxNumber = Math.max(...digitsArray);
// Remove the maximum number from the array
const filteredArray = digitsArray.filter(num => num !== maxNumber);

// Find the second maximum number in the filtered array
const secondLargest = Math.max(...filteredArray);

console.log(secondLargest);
