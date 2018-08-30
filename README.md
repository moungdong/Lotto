


//평균값 내는 쿼리
SELECT SUM(one+two+three+four+five+six+bonus)/818 FROM numbers; 




//오차범위20 일치 행 골라내기
SELECT one,two,three,four,five,six,bonus FROM numbers WHERE 139.8826 < SUM(one+two+three+four+five+six+bonus) AND SUM(one+two+three+four+five+six+bonus) < 179.8826; 


//위치마다 자주나오는 숫자 내림차순
select one,count(one)as onecount from result group by one order by onecount desc;
select two,count(two)as twocount from result group by two order by twocount desc;
select three,count(three)as threecount from result group by three order by threecount desc;
select four,count(four)as fourcount from result group by four order by fourcount desc;
select five,count(five)as fivecount from result group by five order by fivecount desc;
select six,count(six)as sixcount from result group by six order by sixcount desc;
select bonus,count(bonus)as bonuscount from result group by bonus order by bonuscount desc;


//백분율 계산 결과
select one,count(one)as onecount, ((count(one)/381)*100)AS onePer from result group by one order by onecount desc;
select two,count(two)as twocount, ((count(two)/381)*100)AS twoPer from result group by two order by twocount desc;
select three,count(three)as threecount, ((count(three)/381)*100)AS threePer from result group by three order by threecount desc;
select four,count(four)as fourcount, ((count(four)/381)*100)AS fourPer from result group by four order by fourcount desc;
select five,count(five)as fivecount, ((count(five)/381)*100)AS fivePer from result group by five order by fivecount desc;
select six,count(six)as sixcount, ((count(six)/381)*100)AS sixPer from result group by six order by sixcount desc;
select bonus,count(bonus)as bonuscount, ((count(bonus)/381)*100)AS bonusPer from result group by bonus order by bonuscount desc;
------------------

818회차 까지의 1번부터 보너스번호까지 합계를 평균을 내어서

정규분포를 사용하여 평균(159.8826)부터 오차범위 +-20을 주어 그 값이 일치하는 행만 따로 테이블을 만들었다.

그 테이블을 이용하여 각 위치마다 자주나오는 숫자 top 5를 정리했다.
+ 백분위 계산
TO DO : 백분위를 이용하여 if문으로 확률 출력만들기

