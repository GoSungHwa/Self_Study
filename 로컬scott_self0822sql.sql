select empno,ename,
    case
        when deptno=(select deptno from dept where loc='NEW YORK')
            then '본사'
            else '분점'
            end as 소속
from emp e
order by 소속 desc;

select ename,job,(select dname from dept where deptno=e.deptno) dname from emp e;

select ename,job from emp e
where deptno=(select deptno from dept where deptno=e.deptno and dname='SALES');

--급여가 부서번호 20인 부서의 평균보다 높고 사원을 관리하는 ‘MANAGER’로써 20부서에 속하지
--않은 사원을 조회
select b.empno,b.ename,b.job,b.sal,b.deptno
from (select empno from emp where sal>(select avg(sal) from emp
        where deptno=20))a,emp b
where a.empno=b.empno and b.mgr is NOT NULL
                      and b.deptno !=20;