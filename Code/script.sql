

create table tblCode(
    seq number primary key,
    subject varchar2(300) not null,
    code varchar2(2000) not null,
    regdate date default sysdate not null,
    language varchar2(30) not null
);

create sequence seqCode;


select * from tblCode;


create table tblUser(
    seq number primary key,
    name varchar2(30) not null
);

create sequence seqUser;

create table tblDetail(
    seq number primary key,
    email varchar2(100) not null,
    user_seq number not null references tblUser(seq)

);

create sequence seqDetail;

select * from tblDetail;
select * from tblUser;



create table tblInfo (
	seq number,
	school varchar2(100) not null,
	country varchar2(100) not null,
	
	constraint info_pk primary key(seq),
	constraint info_kf foreign key(seq) references tblAddress(seq) 
);

insert into tblInfo values (1, '媛뺣궓 �룞臾쇳븰援�', '���븳誘쇨뎅');
insert into tblInfo values (2, '媛뺣궓 �룞臾쇳븰援�', '���븳誘쇨뎅');
insert into tblInfo values (3, '�돱�슃 �븘移대뜲誘�', '誘멸뎅');
insert into tblInfo values (4, '�룞寃� �썕�젴�썝', '�씪蹂�');
insert into tblInfo values (5, '踰좎씠吏� �썕�젴�냼', '以묎뎅');

create table tblMemo (
	seq number primary key,
	memo varchar2(500) not null,
	regdate date default sysdate not null,
	aseq number not null references tblAddress(seq) 
);

create sequence seqMemo;

insert into tblMemo values (seqMemo.nextVal, '�븞�뀞�븯�꽭�슂.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '�궇�뵪媛� 議곌툑 �쓲�젮�슂.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '�썡�슂�씪�엯�땲�떎.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '�뒪�봽留� 怨듬��븯怨� �엳�뼱�슂.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '踰뚯뜥 諛곌� 怨좏뙆�슂.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '�삤�뒛�룄 �뿴�떖�엳 �궙�옞 以�', default, 2);
insert into tblMemo values (seqMemo.nextVal, '吏묒궗�빞 諛λ궡�넄�씪!', default, 2);
insert into tblMemo values (seqMemo.nextVal, '�굪�빟�굪�빟', default, 3);
insert into tblMemo values (seqMemo.nextVal, '援ш뎄', default, 6);
insert into tblMemo values (seqMemo.nextVal, '�븯�뒛�쓣 �궇�떎.', default, 9);
insert into tblMemo values (seqMemo.nextVal, '吏묒씠 醫곸븘�슂.', default, 8);


commit;

-- tblAddress : tblInfo
-- 1 : 1 > join
-- tblAddress : tblMemo
-- 1 : N > join

-- tblAddress
select * from tblAddress;

--tblInfo
select * from tblInfo;

-- tblMemo
select * from tblMemo;
