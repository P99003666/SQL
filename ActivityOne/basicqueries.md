Question 1. Display the name of movies, movie type is starts with Drama.
Answer : Select * from movies where movietype like "Drama%";

Question 2. Display the movies acted by actor Ayushmann.
Answer : select * from movies where heroame = "Ayushmann";

Qestion  3. Display the count of movies, having length above 18.
Answer :  Select count(movieName) from movies where LENGTH>18;

Qestion  4. Display the movie having minimum length.
Answer :  SELECT MovieName From movie where Length=(Select min(Length) from movies);

Qestion  5. Display all the details of movie, the language that first name starts with ‘T’
Answer : Select * from movies where language like "T%";

Qestion  6. Display the movie name, hero name, heroine name whose having maximum length.
Answer : select movieName, heroName. heroine from movies where length = (select max(length from movies));

Qestion  7. Display the movie name, hero name, heroine name the movie released after 15 march 2018.
Answer :  select movieName, heroName. heroine from movies where releaseDate > "2018-03-15"; 

Qestion  8. Display the count of thriller movies.
Answer :  select count(*) from movies where movietype like "thriller%";

Qestion  9. Display the count of movies whose released before 15 march 2018.
Answer : select * from movies where release date < "2018-03-15"; 

Qestion  10. Display the release date of the movie name ‘Zero’.
Answer : select releaseDate from movies where movieName = "zero";

Qestion  11.Display the actor name that acted with ‘Amy’.
Answer : select heroname from movies where heroine = 'amy';

Qestion  12.Display the Count of maximum movies released in a month of October.
Answer :  select * from movies where monthname(releasedate)='october';

Qestion  13.Display the movienames whose production id for different languages.
Answer :
