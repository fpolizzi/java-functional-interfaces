const hello = (firstName, lastName, callback) => {
    console.log(firstName);

    if (lastName) {
        console.log(lastName);
    } else {
        callback(firstName);
    }
}

const cb = (firstName) => {
    console.log(firstName + " you must have a last name")
}
hello("Alex", null, cb)