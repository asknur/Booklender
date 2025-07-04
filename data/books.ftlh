<h1>Список книг</h1>
<ul class="book-list">
<#list books as book>
    <li class="book-item">
        <div class="book-container">
            <#if book.imageUrl??>
                <img src="${book.imageUrl}" alt="Обложка ${book.title}" class="book-cover"
                     onerror="this.src='/images/no-cover.jpg'">
            <#else>
                <img src="/images/no-cover.jpg" alt="Нет обложки" class="book-cover">
            </#if>

            <div class="book-info">
                <!-- Ссылка на страницу книги -->
                <h3><a href="/book?id=${book.id}">${book.title}</a> - ${book.author}</h3>

                <p class="book-description">${book.description!""}</p>

                <#if book.taken>
                    <form method="post" action="/return">
                        <input type="hidden" name="id" value="${book.id}">
                        <button class="btn return-btn">Вернуть</button>
                    </form>
                <#else>
                    <form method="post" action="/take">
                        <input type="hidden" name="id" value="${book.id}">
                        <button class="btn take-btn">Взять</button>
                    </form>
                </#if>
            </div>
        </div>
    </li>
</#list>
</ul>

<style>
    .book-list {
        list-style: none;
        padding: 0;
    }

    .book-item {
        margin-bottom: 20px;
        border: 1px solid #ddd;
        padding: 15px;
        border-radius: 5px;
    }

    .book-container {
        display: flex;
        gap: 20px;
    }

    .book-cover {
        width: 150px;
        height: auto;
        object-fit: cover;
    }

    .book-info {
        flex: 1;
    }

    .book-info h3 a {
        text-decoration: none;
        color: #0066cc;
    }

    .book-info h3 a:hover {
        text-decoration: underline;
    }

    .book-description {
        color: #555;
        margin: 10px 0;
    }

    .btn {
        padding: 5px 10px;
        cursor: pointer;
    }

    .take-btn {
        background-color: #4CAF50;
        color: white;
        border: none;
    }

    .return-btn {
        background-color: #f44336;
        color: white;
        border: none;
    }
</style>