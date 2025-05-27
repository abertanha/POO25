CREATE TABLE tblFuncHorista 
( Registro_FuncHor NUMBER(10) PRIMARY KEY,
  Nome_FuncHor varchar2(35),
  Sexo_FuncHor VARCHAR2(2),
  DtAdmissao_FuncHor varchar2(10),
  Cargo_FuncHor varchar2(20),
  ValHorTrab_FuncHor NUMBER(6,2),
  QtdeHorTrab_FuncHor NUMBER(6),
  Sigla_Dep varchar2(2),
  CONSTRAINT FK_SIGLA_DEP FOREIGN KEY(Sigla_Dep) references tblDepartamento(Sigla_Dep)
);

commit;

