<h1>Список книг</h1>
<ul>
<#list books as book>
    <li>
        <a href="/book?id=${book.id}">${book.title}</a> — ${book.author}
        <#if book.taken>
            (выдана <a href="/employee?id=${book.isTakenBy}">${book.isTakenBy}</a>)
        <#else>
            (в наличии)
        </#if>
    </li>
</#list>
</ul>