create temporary table StudentsTable_dg_tmp
(
    firstName  TEXT              not null,
    lastName   TEXT              not null,
    patronymic TEXT              not null,
    birthday   TEXT              not null,
    bookNumber integer           not null,
    id         integer default 0 not null
        constraint students_pk
            primary key autoincrement
)
    strict;

insert into StudentsTable_dg_tmp(firstName, lastName, patronymic, birthday, bookNumber, id)
select firstName, lastName, patronymic, birthday, bookNumber, id
from StudentsTable;

drop table StudentsTable;

alter table StudentsTable_dg_tmp
    rename to StudentsTable;


INSERT INTO StudentsTable (firstName , lastName , patronymic, birthday, bookNumber) VALUES
                                                                                        ('Smith', 'John', 'Williamovich', '2002-04-15', 'S001'),
                                                                                        ('Johnson', 'Emily', 'Jamesovna', '2001-07-22', 'S002'),
                                                                                        ('Williams', 'Michael', 'Robertovich', '2003-01-10', 'S003'),
                                                                                        ('Brown', 'Jessica', 'Alexandrovna', '2000-05-30', 'S004'),
                                                                                        ('Jones', 'David', 'Sergeevich', '2002-09-17', 'S005'),
                                                                                        ('Garcia', 'Sophia', 'Ivanovna', '2001-11-25', 'S006'),
                                                                                        ('Miller', 'Daniel', 'Petrovich', '2003-02-18', 'S007'),
                                                                                        ('Davis', 'Olivia', 'Andreevna', '2000-08-03', 'S008'),
                                                                                        ('Rodriguez', 'Ethan', 'Maximovich', '2002-10-29', 'S009'),
                                                                                        ('Martinez', 'Isabella', 'Nikolaevna', '2001-03-14', 'S010'),
                                                                                        ('Hernandez', 'Liam', 'Vladislavovich', '2000-12-09', 'S011'),
                                                                                        ('Lopez', 'Emma', 'Dmitrievna', '2003-05-05', 'S012'),
                                                                                        ('Gonzalez', 'Noah', 'Stanislavovich', '2001-09-21', 'S013'),
                                                                                        ('Wilson', 'Ava', 'Romanovna', '2002-07-11', 'S014'),
                                                                                        ('Anderson', 'Mason', 'Yurievich', '2000-01-27', 'S015'),
                                                                                        ('Thomas', 'Mia', 'Artemovna', '2003-11-08', 'S016'),
                                                                                        ('Taylor', 'Lucas', 'Kirillovich', '2001-04-23', 'S017'),
                                                                                        ('Moore', 'Charlotte', 'Pavlovna', '2002-10-02', 'S018'),
                                                                                        ('Jackson', 'Benjamin', 'Olegovich', '2000-05-19', 'S019'),
                                                                                        ('White', 'Amelia', 'Igorevna', '2003-02-07', 'S020');
