CREATE TABLE IF NOT EXISTS MOVIE (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    released_dt DATE NOT NULL DEFAULT NOW(),
    PRIMARY KEY (id)
);

INSERT INTO MOVIE (id, name, released_dt) VALUES(1, '이블데드', '2013-05-16');
INSERT INTO MOVIE (id, name, released_dt) VALUES(2, '애나멜', '2014-10-02');
INSERT INTO MOVIE (id, name, released_dt) VALUES(3, '인시디어스', '2011-04-01');
INSERT INTO MOVIE (id, name, released_dt) VALUES(4, '컨저링2', '2016-06-09');
INSERT INTO MOVIE (id, name, released_dt) VALUES(5, '배트맨 대 슈퍼맨 : 저스티스의 시작', '2016-03-25');
INSERT INTO MOVIE (id, name, released_dt) VALUES(6, '수어사이드 스쿼드', '2016-08-03');
INSERT INTO MOVIE (id, name, released_dt) VALUES(7, '존 윅', '2015-01-21');
INSERT INTO MOVIE (id, name, released_dt) VALUES(8, '존 윅 2', '2017-02-09');
INSERT INTO MOVIE (id, name, released_dt) VALUES(9, '존 윅 3', '2019-05-22');
INSERT INTO MOVIE (id, name, released_dt) VALUES(10, '로스트 인 스페이스 2', '2018-04-13');
INSERT INTO MOVIE (id, name, released_dt) VALUES(11, '퍼시픽 림', '2013-07-11');
INSERT INTO MOVIE (id, name, released_dt) VALUES(12, '퍼시픽 림 : 업라이징', '2013-07-11');
