<h1>Список книг</h1>
<ul>
<#list books as book>
    <li>
        ${book.title} - ${book.author}
        <#if book.taken>
            <form method="post" action="/return">
                <input type="hidden" name="id" value="${book.id}">
                <button>Вернуть</button>
            </form>
        <#else>
            <form method="post" action="/take">
                <input type="hidden" name="id" value="${book.id}">
                <button>Взять</button>
            </form>
        </#if>
    </li>
</#list>
</ul>
<a href="/logout">Выйти</a>