select empno,ename,
    case
        when deptno=(select deptno from dept where loc='NEW YORK')
            then '����'
            else '����'
            end as �Ҽ�
from emp e
order by �Ҽ� desc;

select ename,job,(select dname from dept where deptno=e.deptno) dname from emp e;

select ename,job from emp e
where deptno=(select deptno from dept where deptno=e.deptno and dname='SALES');

--�޿��� �μ���ȣ 20�� �μ��� ��պ��� ���� ����� �����ϴ� ��MANAGER���ν� 20�μ��� ������
--���� ����� ��ȸ
select b.empno,b.ename,b.job,b.sal,b.deptno
from (select empno from emp where sal>(select avg(sal) from emp
        where deptno=20))a,emp b
where a.empno=b.empno and b.mgr is NOT NULL
                      and b.deptno !=20;