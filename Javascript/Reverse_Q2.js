const arr = [1, 2, 3, 4, 5, 6];

function SortDescending(a, b) {
    return b - a;
}

arr.sort(SortDescending);

console.log("Array sorted in descending order:", arr);
