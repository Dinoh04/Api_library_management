CREATE TABLE IF NOT EXISTS Book (
    book_id SERIAL PRIMARY KEY,
    bookName VARCHAR(255) NOT NULL,
    pageNumbers int,
    topic Topic,
    releaseDate Date,
    availibility Boolean,
    authorId INT REFERENCES Author(authorId)
    );
