let date = new Date();
function addUser() {
    const dbDate = 'Y-M-D H:m:s'.replace('Y', date.getFullYear()).replace('M', date.getMonth()).replace('D', date.getDay()).replace('H', date.getHours()).replace('m', date.getMinutes()).replace('s', date.getSeconds())
    $.ajax({
        url: '/add_user',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify({
            role: '0', // 0 - игрок, 1 - администратор
            login: document.getElementById('login').value,
            password: document.getElementById('psw').value,
            nickname: document.getElementById('nickname').value,
            regist_date: date
        }),
        success: function () {
            alert('Пользователь добавлен')
        }
    })
}