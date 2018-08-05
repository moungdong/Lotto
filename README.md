


//평균값 내는 쿼리
SELECT SUM(one+two+three+four+five+six+bonus)/818 FROM numbers; 




//오차범위20 일치 행 골라내기
SELECT one,two,three,four,five,six,bonus FROM numbers WHERE 139.8826 < one+two+three+four+five+six+bonus AND one+two+three+four+five+six+bonus < 179.8826; 

//위치마다 자주나오는 숫자 내림차순
select one,count(one)as count from result group by one order by count desc;
select two,count(two)as count from result group by two order by count desc;
select three,count(three)as count from result group by three order by count desc;
select four,count(four)as count from result group by four order by count desc;
select five,count(five)as count from result group by five order by count desc;
select six,count(six)as count from result group by six order by count desc;
select bonus,count(bonus)as count from result group by bonus order by count desc;


------------------

818회차 까지의 1번부터 보너스번호까지 합계를 평균을 내어서

정규분포 확률을 사용하여 평균(159.8826)부터 오차범위 +-20을 주어 평균이 일치하는 행만 따로 테이블을 만들었다.

그 테이블을 이용하여 각 위치마다 자주나오는 숫자 top 5를 정리했다.


INSERT INTO mysql.user (host,user,authentication_string,ssl_cipher, x509_issuer, x509_subject) VALUES ('%','root',password('md0779'),'','','');
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
FLUSH PRIVILEGES;