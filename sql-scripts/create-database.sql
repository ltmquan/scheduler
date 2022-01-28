drop database if exists scheduler;
create database scheduler;
use scheduler;

create table task_type (
	id 			INT,
    name		VARCHAR(30),
    
    PRIMARY KEY(id)
) ENGINE=InnoDB;

INSERT INTO task_type VALUES (1, "Coursework");
INSERT INTO task_type VALUES (2, "PhD Work");
INSERT INTO task_type VALUES (3, "Network");
INSERT INTO task_type VALUES (4, "Meeting");
INSERT INTO task_type VALUES (5, "Personal Stuff");

create table task (
	id 					INT 				AUTO_INCREMENT,
    title				VARCHAR(30),
    deadline			DATE,
    description			VARCHAR(100),
    type_id				INT,
    priority_level		INT,
    work_length			INT,
    
    PRIMARY KEY(id),
    CONSTRAINT task_type_id 
		FOREIGN KEY(type_id) REFERENCES task_type(id)
) ENGINE=InnoDB;


    
    
    