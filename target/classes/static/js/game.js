let tds = document.querySelectorAll('td');
tds.forEach((item) => {
    item.onclick = (e) => {
        e.target.classList.toggle('greeny')
    }
});

document.querySelector('table').onclick = (event) => {
let cell = event.target;
if (cell.tagName.toLowerCase() != 'td')
    return;
let i = cell.parentNode.rowIndex;
let j = cell.cellIndex;
console.log(i, j);
document.getElementById('d').innerHTML = `${i},${j}`
}