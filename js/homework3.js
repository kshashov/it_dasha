// Написать функцию, которая принимает два числа и возращает результат их умножения

// function ymnozenie(a , b) {
//     return a * b;  
// }

// let x=6;
// let y=6;
// let multiplication = ymnozenie(x, y);
// console.log (multiplication);


// Написать функцию, которая принимает параметром число от 1 до 7 и возвращает день недели словом

// let неделя = ["Панедельняк", "Вторняк", "СрИдА", "ЧИтверКа", "Пьятнится", "Суботченька", "Вааасякресенья"];

// function day (i) {
//     let неделя = ["Панедельняк", "Вторняк", "СрИдА", "ЧИтверКа", "Пьятнится", "Суботченька", "Вааасякресенья"];
//     if (i<неделя.length && i>0){
//         console.log (неделя[i-1]);
//     } else {
            // console.log ("Не перебарщивай, чувак, с наркотиками)");
        // }
// }
// day(0);


// Написать функцию, которая принимает список чисел и возращает его длину (количество элементов в списке)


// function blzt (argjkh) {
//     return argjkh.length;
// }
// let numbers = [104, 423, 54, 345, 5, 6]
// console.log (blzt(numbers))


// Написать функцию, которая принимает список чисел и возращает количество четных элементов в нем

// function akk (op) {
//     let sum=0;
//       for (let i = 0; i < op.length; i++) {
//         if (op[i]%2==0) {
//             sum=sum+1
//         }
//     }
//     return sum; 
// }

// let numbers = [104, 423, 54, 345, 5, 6]
// console.log (akk(numbers))


// Написать функцию, которая рисует рамку из звёздочек *. Параметры - ширина, высота рамки.
// Пример выполнения:
// draw(5, 3);
// *****
// *   *
// *****

// function line(x,symb) { // *****
//     let result = "";
//     for (let a=0; a<x; a++) {
//         result = result + symb;
//     }
    
//     return result;
// }

// function down(x,symb) { // *    *
//     let result = symb;

//     for (let i = 0; i < (x-2); i++) {
//         result = result + " ";
//     }

//     return result + symb ;
// }

// function square(width, height, symb) {
//     console.log(line(width, symb));

//     for (let y=0; y<(height-2); y++) {
//         console.log(down(width, symb));
//     }
//     console.log(line(width, symb));

// }

// // console.log(line(12));
// square(4,6,"№");



// function line(x,symb) { // *****
//     let result = "";
//     for (let a=0; a<x; a++) {
//         result = result + symb;
//     }
    
//     return result;
// }

// function down(x,symb) { // *    *
//     let result = symb;

//     let spaces = "";
//     for (let i = 0; i < symb.length; i++) {
//         spaces = spaces + " ";
//     }

//     for (let i = 0; i < (x-2); i++) {
//         result = result + spaces;
//     }

//     return result + symb ;
// }

// function square(width, height, symb) {
//     console.log(line(width, symb));

//     for (let y=0; y<(height-2); y++) {
//         console.log(down(width, symb));
//     }
//     console.log(line(width, symb));

// }

// square(4,6,"член ");

// Написать функцию, которая принимает три числа (день, месяц, год) и выводит в консоль дату следующего дня
// Пример выполнения:
// tomorrow(31,12,2000);
// Завтра 1.1.2001


// function date (day, month, year) {
//     let monthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
//     if (day<monthDays[month-1]) {
//         day = day + 1;
//     } else if (month < 12) {
//         day = 1;
//         month = month+1;
//     } else if (month == 12) {
//         day = 1;
//         month = 1;
//         year = year+1;
//     }
//     console.log ("Завтра " + day + "." + month + "." + year);
// }

// date (31, 12, 2003);

// function date (day, month, year) {
//     let monthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
//     if (day < monthDays[month-1]) {
//         day = day + 1;
//     } else {
//         day = 1;
//         month = month+1;
//         if (month == 13) {
//             month = 1;
//             year = year + 1;
//         }
//     } 
//     console.log(`Завтра ${day}.${month}.${year}`);
// }

// date (31, 12, 2003);

function monthDays(month, year) {
    if ((year % 4 == 0) && (month == 2)) {
        return 29;
    }

    let days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    return  days[month-1];

}

function date (day, month, year) {

    if (day < monthDays(month, year)) {
        day = day + 1;
    } else {
        day = 1;
        month = month+1;
        if (month == 13) {9
            month = 1;
            year = year + 1;
        }
    } 
    console.log(`Завтра ${day}.${month}.${year}`);
}

date (27, 2, 2023);