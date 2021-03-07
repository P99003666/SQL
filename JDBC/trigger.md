Trigger 

create trigger stud_marks 


before INSERT 


on 


Student 


for each row 


set Student.total = Student.subj1 + Student.subj2 + Student.subj3, Student.per = Student.total * 60 / 100;


insert into Student values(0, "ABCDE", 20, 20, 20, 0, 0); 
