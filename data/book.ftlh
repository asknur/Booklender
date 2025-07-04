<div class="book-detail">
    <img src="${book.imageUrl}" alt="Обложка ${book.title}" class="book-detail-cover">
    <div class="book-detail-info">
        <h1>${book.title}</h1>
        <p class="book-author">Автор: ${book.author}</p>
        <p class="book-description">${book.description}</p>
        <p class="book-status">
            Статус:
            <#if book.taken>
                <span class="status-taken">Выдана сотруднику <a href="/employee?id=${book.isTakenBy}">${book.isTakenBy}</a></span>
            <#else>
                <span class="status-available">В наличии</span>
            </#if>
        </p>
        <a href="/books" class="back-link">← Назад к списку книг</a>
    </div>
</div>