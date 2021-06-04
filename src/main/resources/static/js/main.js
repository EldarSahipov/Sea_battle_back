function search() {
    console.log(document.getElementById('search').textContent[9])

    $.get('/search_game/' + 1, function (data) {
            if (data[1] == 2)
            {
                document.getElementById('search').innerHTML = "Игроков: 2/2"
                window.location.href='/game'
            }
            else {
                document.getElementById('search').innerHTML = "Игроков: 1/2"
            }

    })
   // if (document.getElementById('search').textContent === "Игроков: 0/2")
   // {
   //  document.getElementById('search').innerHTML = "Игроков: 1/2"
   // }
   //  else
   // {
   //     document.getElementById('search').innerHTML = "Игроков: 2/2"
   //     window.location.href='/game'
   //
   // }
}

/*
$(document).ready(function(){
    $('button').click(function(){
        $('.gamers').html("Игроков: 1/2");
    });
});
*/

