
let id_table_1;
let id_table_2;

function game_start()
{
    $.get('/game_start/' + 1, function (data) {
        console.log(data)
        if (data == 1111)
        {

            this.id_table_1 = 1111;
            this.id_table_2 = 2222;
        }
        else {
            this.id_table_1 = 2222;
            this.id_table_2 = 1111;
        }

    })
}

game_start();


// let tds = document.querySelectorAll('td');


function tableCreate_1(u) {
    tbl = document.createElement('table');
    tbl.setAttribute("id", id_table_1);

    for (var i = 0; i < u; i++) {
        var tr = tbl.insertRow();

        for (var j = 0; j < u; j++) {

            var td = tr.insertCell();



        }
    }
    //body.appendChild(tbl);
    var hereDiv = document.getElementById("left")
    hereDiv.appendChild(tbl)

    var t = document.getElementById(id_table_1);
    var trs = t.getElementsByTagName("tr");
    var tds = null;

    for (var i=0; i<trs.length; i++)
    {
        tds = trs[i].getElementsByTagName("td");
        for (var n=0; n<trs.length;n++)
        {
            tds[n].innerHTML = ".";
        }
    }

    tbl.classList.add("t");
}

function tableCreate_2(u) {
    tbl = document.createElement('table');
    tbl.setAttribute("id", id_table_2);

    for (var i = 0; i < u; i++) {
        var tr = tbl.insertRow();

        for (var j = 0; j < u; j++) {

            var td = tr.insertCell();



        }
    }
    //body.appendChild(tbl);
    var hereDiv = document.getElementById("right")
    hereDiv.appendChild(tbl)

    var t = document.getElementById(id_table_2);
    var trs = t.getElementsByTagName("tr");
    var tds = null;

    for (var i=0; i<trs.length; i++)
    {
        tds = trs[i].getElementsByTagName("td");
        for (var n=0; n<trs.length;n++)
        {
            tds[n].innerHTML = ".";
        }
    }

    tbl.classList.add("t");
}
tableCreate_1(10);
tableCreate_2(10);


function add() {
    variable = document.querySelector(".t").getAttribute("id");
    console.log(variable)

        $.get('/add', function (data) {
            console.log(data)
            var tds = document.getElementById(id_table_1).getElementsByTagName('td');
            var massiv = []

            for (var i = 0; i < 10; i++) {
                for (var j = 0; j < 10; j++) {
                    massiv.push(data[i][j]);
                }
            }
            for (var i = 0; i < tds.length; i++) {
                if (massiv[i] == 1) {
                    tds[i].className = 'greeny'
                }
            }
        })

        // document.getElementById("but").style.display = "none"

}

add();

document.getElementById(this.id_table_2).onclick = (event) => {

let cell = event.target;
if (cell.tagName.toLowerCase() != 'td')
    return;
let i = cell.parentNode.rowIndex;
let j = cell.cellIndex;
console.log(i, j);
//document.getElementById('d').innerHTML = `${i},${j}`

    var target = event.target;
    var str = i + "" + j
    $.get('/check_field/' + str, function (data) {
        if (target.tagName === 'TD') {

            if (data == 1) {
                target.classList.toggle('redy');
            }
            else {
                target.classList.toggle('grayy');
            }

        }
    })
}











/*

    tds.forEach((item) => {
        item.onclick = (e) => {
            var str = i + "" + j
            console.log(ij)
            $.get('/check_field/' + str, function (data) {
                console.log(data)
                if (data == 1)
                {
                    e.target.classList.toggle('redy')
                }
                else
                {
                    e.target.classList.toggle('grayy')
                }
            })

        }
    })
 */


























/*let tds = document.querySelectorAll('td');

tds.forEach((item) => {
    item.onclick = (e) => {
        $.get('/check_field/' + document.getElementById('d').innerHTML.value, function (data) {
            if (data == 1)
            {
                e.target.classList.toggle('redy')
            }
            else
            {
                e.target.classList.toggle('grayy')
            }
        })
    }
});

/*
function checkfield() {
    $.get('/check_field/' + document.getElementById('d').innerHTML.value, function (data) {
        if (data == 1) {
            let tds = document.querySelectorAll('td');
            tds.forEach((item) => {
                item.onclick = (e) => {
                    e.target.classList.toggle('grayy')
                }
            });
        }
        if (data == 0) {
            let tds = document.querySelectorAll('td');
            tds.forEach((item) => {
                item.onclick = (e) => {
                    e.target.classList.toggle('redy')
                }
            });
        }

    })
}*/

