// freeze는 strict 모드에서만 동작한다.
// 'use strict';

const hayoung = {
    'name': 'hayoung',
    'age': 28
};

Object.freeze(hayoung);

hayoung.hobbies = ["독서"];
hayoung.hobbies.push("축구")

console.info(hayoung.name);
console.info(hayoung.hobbies);