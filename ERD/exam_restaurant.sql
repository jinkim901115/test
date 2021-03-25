
/* Drop Tables */

DROP TABLE exam_restaurant CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE exam_restaurant
(
	ex_uid number NOT NULL,
	ex_name varchar2(20),
	ex_grade NUMBER (2,1),
	ex_addr varchar2(100),
	PRIMARY KEY (ex_uid),
	CHECK(ex_grade BETWEEN 0.0 AND 5.0)   
);

CREATE SEQUENCE exam_restaurant_seq;

drop SEQUENCE exam_restaurant_seq;

SELECT  
	ex_uid "uid", ex_name name, ex_grade grade,
	ex_addr addr
FROM exam_restaurant ORDER BY ex_uid DESC;

INSERT INTO exam_restaurant(ex_uid, ex_name, ex_grade, ex_addr)
SELECT exam_restaurant_seq.nextval, ex_name, ex_grade, ex_addr
FROM exam_restaurant ;

SELECT * FROM exam_restaurant;

INSERT INTO exam_restaurant VALUES
(exam_restaurant_SEQ.nextval, '우리집', 3 , '성남시');

INSERT INTO exam_restaurant VALUES
(exam_restaurant_SEQ.nextval, '너의집', 5.0 , '서울시');



