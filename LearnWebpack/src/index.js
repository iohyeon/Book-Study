import a_number from './a.js'
import b_number from './b.js'
import c_number from './c.js'
console.log('a_number: ', a_number);
console.log('b_number: ', b_number);
console.log('c_number: ', c_number);

const $buttonA = document.querySelector('#button-a');
const $buttonB = document.querySelector('#button-b');
const $buttonC = document.querySelector('#button-c');
const $dispaly = document.querySelector('#display');


$buttonA.addEventListener('click', function() {
    $dispaly.textContent = a_number
})

$buttonB.addEventListener('click', function() {
    $dispaly.textContent = b_number
})

$buttonC.addEventListener('click', function() {
    $dispaly.textContent = c_number
})

