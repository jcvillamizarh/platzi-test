CREATE TABLE IF NOT EXISTS movies(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    genre VARCHAR(50) NOT NULL,
    director VARCHAR(50) NOT NULL
);

INSERT INTO movies (name, minutes, genre, director) values
    ('Dark Knight', 152, 'ACTION', 'Director1'),
    ('Memento', 113, 'THRILLER', 'Director2'),
    ('Matrix', 136, 'ACTION', 'Director3');