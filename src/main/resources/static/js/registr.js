let date = new Date();
function addUser() {
    $.ajax({
        url: '/add_user',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify({
            role: '0', // 0 - игрок, 1 - администратор
            login: document.getElementById('login').value,
            password: document.getElementById('psw').value,
            nickname: document.getElementById('nickname').value,
            regist_date: date.getFullYear() + "-" +
                date.getMonth() + "-" + date.getDay()
                + " " + date
        //    2021-05-17 21:43:18
        }),
        success: function () {
            alert('Пользователь добавлен')
        }
    })
}