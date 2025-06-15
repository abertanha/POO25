-- Tabela de Quartos
CREATE TABLE tblQuarto (
    Numero_Quarto NUMBER(4,0) PRIMARY KEY,
    Tipo_Quarto VARCHAR2(1),
    ValorDiaria_Quarto NUMBER(6,2),
    Situacao_Quarto NUMBER(1,0),
    TotalFaturado_Quarto NUMBER(6,2)
);

-- Tabela de Hóspedes
CREATE TABLE tblHospede (
    Cpf_Hospede VARCHAR2(11) PRIMARY KEY,
    Nome_Hospede VARCHAR2(60),
    Endereco_Hospede VARCHAR2(60),
    Telefone_Hospede VARCHAR2(12),
    TaxaDesconto_Hospede NUMBER(6,2)
);

-- Tabela de Recepcionistas
CREATE TABLE tblRecepcionista (
    RegFunc_Recep NUMBER(4,0) PRIMARY KEY,
    Nome_Recep VARCHAR2(60),
    Endereco_Recep VARCHAR2(60),
    Telefone_Recep VARCHAR2(12),
    Turno_Recep VARCHAR2(1)
);

-- Tabela de Serviços de Quarto
CREATE TABLE tblServicoQuarto (
    Codigo_ServQuarto NUMBER PRIMARY KEY,
    Descricao_ServQuarto VARCHAR2(30),
    Valor_ServQuarto NUMBER(10,2)
);

-- Tabela de Registros
CREATE TABLE tblRegistro (
    Codigo_Registro NUMBER(4,0) PRIMARY KEY,
    DataEntrada_Registro DATE,
    DataSaida_Registro DATE,
    Recepcionista_Registro NUMBER(4,0),
    Hospede_Registro VARCHAR2(11),
    Quarto_Registro NUMBER(4,0),
    ValorHospedagem_Registro NUMBER(6,2)
);

-- Restrições de chave estrangeira da tabela de registros
ALTER TABLE tblRegistro
ADD CONSTRAINT fk_recepcionista
FOREIGN KEY (Recepcionista_Registro)
REFERENCES tblRecepcionista (RegFunc_Recep);

ALTER TABLE tblRegistro
ADD CONSTRAINT fk_hospede
FOREIGN KEY (Hospede_Registro)
REFERENCES tblHospede (Cpf_Hospede);

ALTER TABLE tblRegistro
ADD CONSTRAINT fk_quarto
FOREIGN KEY (Quarto_Registro)
REFERENCES tblQuarto (Numero_Quarto);

-- Tabela associativa entre Registro e Serviço de Quarto
CREATE TABLE tblRegistro_ServicoQuarto (
    Codigo_Registro_RS NUMBER NOT NULL,
    Codigo_ServQuarto_RS NUMBER NOT NULL,

    PRIMARY KEY (Codigo_Registro_RS, Codigo_ServQuarto_RS),

    CONSTRAINT fk_registro
        FOREIGN KEY (Codigo_Registro_RS)
        REFERENCES tblRegistro (Codigo_Registro)
        ON DELETE CASCADE,

    CONSTRAINT fk_servico_quarto
        FOREIGN KEY (Codigo_ServQuarto_RS)
        REFERENCES tblServicoQuarto (Codigo_ServQuarto)
        ON DELETE CASCADE
);
