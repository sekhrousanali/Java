const phoneNumber = 9720883514;
const numberArray = Array.from(String(phoneNumber), Number);

// Sort the array in descending order
const sortedArray = numberArray.sort((a, b) => b - a);

// Retrieve the second largest number
const secondLargest = sortedArray[1];

console.log(secondLargest);
