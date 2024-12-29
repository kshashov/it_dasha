// function sum(a, b) {
//     return a + b;
// }


// let x = 2;
// let y = 4;
// let result = sum(x, y);

// console.log(result);

// function average(a, b) {
//     return (a + b)/2;
// }

// let a = 8;
// let b = 10;
// let c = 6;
// let result = 0;
// if ((a<b) && (a<c)) {
//     if (b>c)
//         result = average(a, b);
//     else 
//         result = average(a, c);
// } else if (b<c) { 
//     if (a<c)
//         result = average(b,a);
//     else 
//         result = average(b,c);
// } else {
//     if (a>b)  
//         result = average(c,a);
//     else 
//         result = average(b,c);
// }
// console.log("result = " + result);

// function average(a, b) {
//     return (a + b)/2;
// }

// function hui(x, y, minimum) {
//     let result;

//     if (x>y)  
//         result = average(minimum,x); // (x + minimum)/2;
//     else 
//         result = average(y,minimum); // (y + minimum)/2;

//     return result;
// }

// let a = 8;
// let b = 10;
// let c = 6;
// let result = 0;
// if ((a<b) && (a<c)) {
//     result = hui(b, c, a);
//     // if (b>c)
//     //     result = average(a, b);
//     // else 
//     //     result = average(a, c);
// } else if (b<c) { 
//     result = hui(a, c, b)
//     // if (c>a)
//     //     result = average(b,a);
//     // else 
//     //     result = average(b,c);
// } else {
//     result = hui(a, b, c)
//     // if (a>b)  
//     //     result = average(c,a);
//     // else 
//     //     result = average(b,c);
// }
// console.log("result = " + result);


// function log(str) {
//     console.log(str);
    
// }
// log();
// log("мяу")

// function meow() {
//     console.log("мяв мяв");
// }
// meow()


// log("dfsdf") >> dfsdf
// log()        >> мяв мяв


// function log(str) {
//     if (str==undefined) {
//         console.log("МРЯУ");
//     } else {
//         console.log(str);
//     }   
// }
// log();


// function log(str) {
//     let result;
//     // if (str==undefined) {
//     //     result = "МРЯУ";
//     // } else {
//     //     result = str;
//     // }   
//     result = (str == undefined) ? "МРЯУ" : str;
//     console.log(";) " + result);
// }
// log();

// function log(str) {
//     console.log(";) " + ((str == undefined) ? "МРЯУ" : str));
// }
// log();


// function hui(x, y, minimum) {
//     let result;

//     if (x>y)  
//         result = average(minimum,x); // (x + minimum)/2;
//     else 
//         result = average(y,minimum); // (y + minimum)/2;

//     return result;
// }



// function hui(x, y, minimum) {
//     if (x > y) {
//         return average(minimum, x);
//     } else {
//         return average(y, minimum);
//     }
// }

// function average(x, y) {
//     return x;
// }

// function hui(x, y, minimum) {
//     return ((x > y) ? average(minimum,x) : average(y,minimum));
// }

// function hui(x, y, minimum) {
//     return average(((x > y) ? x : y), minimum);
// }

// function hui(x, y, minimum) {
//     let maximum;
//     if (x > y) {
        
//         maximum = x;
//     } else {
//         maximum = y;
//     }

//     return average(maximum, minimum);
// }




// function hello(){
//     console.log("Hello from Metanit.com");
// }
// // передача константе message ссылки на функцию hello
// const message = hello;
// message();  // вызываем функцию, ссылка на которую хранится в константе message


// const message = function(){
//      console.log("Hello Kirill");
// }
// message();

function print(){
    printHello();
    printHello();
    printHello();
    function printHello(){
        console.log("Хуй");
    }
}
print();


// function printPerson(person) {
//     console.log("Name:", person[0]);
//     console.log("Age:", person[1]);
//     console.log("Email:", person[2]);
//     console.log("=========================");
// }
// const tom = ["Tom", 39, "tom@example.com"]; 
// const bob = ["Bob", 43, "bob@example.com"]; 
 
// printPerson(tom);
// printPerson(bob);



// function printPerson(username, age, email) {
//     console.log("Name:", username);
//     console.log("Age:", age);
//     console.log("Email:", email);
//     console.log("=========================");
// }
 
// const tom = ["Tom", 39, "tom@example.com"]; 
// const bob = ["Bob", 43, "bob@example.com"]; 
 
// printPerson(...tom);
// printPerson(...bob);


// function sum(x, y){
//     if(y === undefined) y = 5;
//     if(x === undefined) x = 8;
//     const z = x + y;
//     console.log(z);
// }
// sum();          // 13
// sum(6);         // 11
// sum(6, 4)       // 10

// function sum(x = 8, y = 5){
 
//     const z = x + y;
//     console.log(z);
// }
// sum();      // 13
// sum(6);     // 11
// sum(6, 4)   // 10

// function sum(x = 8, y = 10 + x){
 
//     const z = x + y;
//     console.log(z);
// }
// sum();      // 26
// sum(6);     // 22
// sum(6, 4)   // 10