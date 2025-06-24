<h1>${book.title}</h1>
<p>Автор: ${book.author}</p>
<p>
    Статус:
    <#if book.taken>
        Выдана сотруднику <a href="/employee?id=${book.isTakenBy}">${book.isTakenBy}</a>
    <#else>
        В наличии
    </#if>
</p>
<a href="/books">← Назад к списку книг</a>