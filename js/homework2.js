// let day = 5;
// if (day==1) {
//     console.log("Понедельник");
// } else if (day==2) {
//     console.log("Вторник");
// } else if (day==3) {
//     console.log("Среда");
// } else if (day==4) {
//     console.log("Четверг");
// } else if (day==5) {
//     console.log("Пятница");
// } else if (day>5) {
//     console.log("Выходной");
// }

// let неделя = ["Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Выходной"]
// let i=5 
// console.log (неделя[i-1]);


// let a = 5;
// let b = 10;
// let c = 8;
// if ((a<b) && (a<c)) {
//     console.log (a);
// } else if (b<c) {
//     console.log (b)
// } else console.log (c)


// let a = 8;
// let b = 10;
// let c = 6;
// if ((a<b) && (a<c)) {
//     if (b>c)
//         console.log ((a+b)/2);
//     else 
//         console.log ((a+c)/2);
// } else if (b<c) { 
//     if (a<c)
//         console.log ((b+a)/2);
//     else 
//         console.log ((b+c)/2);
// } else {
//     if (a>b)  
//         console.log ((c+a)/2);
//     else 
//         console.log ((b+c)/2);
// }


let numbers = [104, 123, 54, 345, 324, 76, 1000, 345, 146];

// for (var i=0; i<numbers.length;i++){
//     max=numbers[i]
//     if (numbers[i]>numbers[i++]){
//         console.log (max);
//         break;
//     } else {
//         console.log(numbers[i++]);
//     }
// }

// let max = 0; 
// for (let i=0; i<numbers.length;i++){
//     console.log(`i = ${i} max = ${max} numbers[i] = ${numbers[i]}`);
//     if (numbers[i]>max) {
//         max = numbers[i]
//     } 
// }
// console.log(max);


let max = 0;
let i = 0;
while (i<numbers.length) {
    console.log(`i = ${i} max = ${max} numbers[i] = ${numbers[i]}`);
    if (numbers[i]>max) {
        max = numbers[i]
    } 
    i++;
}
console.log(max);

// let a = 1;
// let b = 5;
// let i=0
// for (; a<=b; a++){
//     if (a%2==0){
//         i=i+1
//     }
// }
// console.log (i);

// let a = 1;
// let b = 5;
// let i=0;
// for (let hui = a; hui<=b; hui++){
//     if (hui%2==0){
//         i=i+1
//     }
// }
// console.log (i);