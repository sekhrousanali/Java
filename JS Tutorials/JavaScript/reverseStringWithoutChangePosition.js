const str="Rousan Ali";
const words=str.split(' ');

const reversWord=words.map(word=>word.split('').reverse().join(''))
const reverseStr=reversWord.join(' ')
console.log(reverseStr)




