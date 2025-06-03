create table tblQuarto(
      Numero_Quarto number(4,0) PRIMARY KEY,
      Tipo_Quarto varchar2(1),
      ValorDiaria_Quarto number (6,2),
      Situacao_Quarto number(1,0),
      TotalFaturado_Quarto number(6,2)
);

create table tblHospede(
    Cpf_Hospede varchar2(11) PRIMARY KEY,
    Nome_Hospede varchar2(60),
    Endereco_Hospede varchar2(60),
    Telefone_Hospede varchar2(12),
    TaxaDesconto_Hospede number(6,2)
);

create table tblRecepcionista(
    RegFunc_Recep number(4,0) PRIMARY KEY,
    Nome_Recep varchar2(60),
    Endereco_Recep varchar2(60),
    Telefone_Recep varchar2(12),
    Turno_Recep varchar2(1)
);

create table tblServicoQuarto(
    Codigo_ServQuarto number(4,0) PRIMARY KEY,
    Descricao_ServQuarto varchar2(30),
    Valor_ServQuarto number(10,2)
);

commit;





