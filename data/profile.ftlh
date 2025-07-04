<h1>Профиль сотрудника</h1>

<p><strong>Имя:</strong> ${employee.name}</p>
<p><strong>ID:</strong> ${employee.id}</p>

<h2>Книги на руках:</h2>
<ul>
<#list currentBooks as book>
    <li>${book.title} — ${book.author}</li>
</#list>
</ul>

<h2>История книг:</h2>
<ul>
<#list historyBooks as book>
    <li>${book.title} — ${book.author}</li>
</#list>
</ul>