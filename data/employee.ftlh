<h1>Сотрудник: ${employee.name}</h1>

<h2>Текущие книги</h2>
<ul>
<#list currentBooks as book>
    <li><a href="/book?id=${book.id}">${book.title}</a> — ${book.author}</li>
</#list>
</ul>

<h2>История</h2>
<ul>
<#list historyBooks as book>
    <li><a href="/book?id=${book.id}">${book.title}</a> — ${book.author}</li>
</#list>
</ul>

<a href="/books">← Назад к книгам</a>