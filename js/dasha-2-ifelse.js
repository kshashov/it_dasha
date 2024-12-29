//равны или нет числа
//четное или нет число
//модуль числа
//сезон по месяцу

// let k = 0;
// if (k>0) {
//     console.log("+");
// } else {
//     if (k == 0) {
//         console.log ("+-");
//     } else{
//         console.log("-");
//     }    
// }

// let k = 1;
// if (k>0) {
//     console.log("+");
// } else if (k < 0) {
//     console.log("-");
// } else {
//     console.log ("+-");
// }

// let k = -5;
// if (k>0) {
//     console.log(k);
//  } else {
    // console.log(k*(-1));
//  }

//  let k = -5;
// if (k < 0) {
//     k = -k;
// } 
// console.log(k);

// let k = -7;
// let m = k;
// if (m < 0) {
//     m = -m;
// } 
// console.log(m);

//console.log(9 % 6)
 

// let l=7;
// if (l % 2 == 0) {
//     console.log("четноё"); 
// } else {
//     console.log ("нечетноё");
// }

// let month = 7;
// if ((month<=2) || (month==12)) {
//     console.log("зима");
// } else if ((month>=3) && (month<=5)) {
//     console.log("весна");
// } else if ((month>=6) && (month<=8)) {
//     console.log("лето");
// } else if ((month>=9) && (month<=11)) {
//     console.log("осень");
// }

// let month = 9;
// if ((month<=2) || (month==12)) {
//     console.log("зима");
// } else if (month<=5) {
//     console.log("весна");
// } else if (month<=8) {
//     console.log("лето");
// } else if (month<=11) {
//     console.log("осень");
// }

// for (let i = 0; i < 5; i++) {
//     console.log(i);
//     if (i==3) {
//         break;
//     }
// }


// let numbers = [104, 423, 54, 345, 324, 76, 10]

// let u = 54;
// for (var i=0; i<=6;i++){
//     if (numbers[i]==u){
//         console.log ("ня");
//     } else {
//         console.log("не ня");
//     }

//     console.log(numbers[i])
// }


// let numbers = [104, 423, 54, 345, 324, 76, 10]

// let u = 54;
// for (var i=0; i< numbers.length;i++){
//     if (numbers[i]==u){
//         console.log (numbers[i] + " ня");
//         break;
//     } else {
//         console.log(numbers[i] + " не ня");
//     }
// }


// let numbers = [104, 423, 54, 345, 324, 76, 10, 345, 546]

// let u = 345, k=0;
// for (var i=0; i < numbers.length;i++){
//     if (numbers[i]==u){
//         k++
//     }
// }
// console.log (k);


// let numbers = [104, 423, 54, 345, 324, 76, 10, 345, 546]
// let sum=0
// for (var i=0; i < numbers.length;i++) {
//     sum =sum+numbers[i] ;
// } 
// console.log (sum);

// let numbers = [104, 423, 54, 345, 324, 76, 10, 345, 546]
// let sum=0
// for (var i=0; i < numbers.length;i++) {
//     if (numbers[i]>100){
//         sum =sum+numbers[i] ;
//     } 
  
// } 
// console.log (sum);

// numbers[3]


// let users = ["Оля", "Катя", "Алена", "Оксана", "Элина", "Катарина", "Катюшенька", "Катенька", "Катер"]

// let search = "К";

// for (let i = 0; i < users.length; i++) {
//        if (users[i][0] == search) {
//         console.log (users[i])
//     }
// } 

// let str = "Даша"
// console.log(str[0])

// let numbers = [104, 423, -54, 345, 324, 76, 10, 345, 546]

// let hui = false;
// let k = 0;
// for (let i = 0; i < numbers.length; i++) {
//     if (numbers[i] < 0) {
//         console.log("есть");
//         hui = true;
//         k = 1;
//         break;
//     }
// }

// if (hui) {
//     console.log(hui);
// }



// let myVar = 89;
// if(myVar){
//          console.log(`Переменная myVar имеет значение: ${myVar}`);
// }

// if (myVar !== undefined && myVar !== null) {
//     console.log(`Переменная myVar имеет значение: ${myVar}`);
// }

// const income = 500;
// if(income < 200){
 
//     console.log("Доход ниже среднего");
// }
// else if(income>=200 && income<300){
     
//     console.log("Чуть ниже среднего");
// }
// else if(income>=300 && income<400){
     
//     console.log("Средний доход");
// }
// else{
//     console.log("Доход выше среднего");
// }


// const strIncome = "100";
// const result = income == strIncome; //сравнивают значение
// console.log(result); //true

// const income = 100;
// const strIncome = "100";
// const result = income === strIncome; //сравнивают значение и тип данных (число и текст)
// console.log(result); // false


// const money = 1000;
// const age = 21;
// // проверяем, что age больше 18 и money больше 100
// const access1 = age > 18 && money > 100;
// console.log(access1); // true
 
// // проверяем, что age больше 18 и money больше 1000
// const access2 = age > 18 && money > 1000;
// console.log(access2);


// let hui = false;
// let k = 0;
// for (let i = 0; i < numbers.length; i++) {
//     if (numbers[i] < 0) {
//         console.log("есть");
//         hui = true;
//         k = 1;
//         break;
//     }
// }

// if (hui) {
//     console.log(hui);
// }
