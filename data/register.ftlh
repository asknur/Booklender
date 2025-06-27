<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
</head>
<body>
    <h2>Регистрация сотрудника</h2>
    <form method="post" action="/register">
        <input name="fullName" placeholder="ФИО" required><br>
        <input name="email" type="email" placeholder="Email" required><br>
        <input name="password" type="password" placeholder="Пароль" required><br>
        <button type="submit">Зарегистрироваться</button>
    </form>
</body>
</html>