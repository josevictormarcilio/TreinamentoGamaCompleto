CREATE PROCEDURE `folha_pagamento` ()
BEGIN

drop table itau.folha_funcionario;

create table itau.folha_pagamento (select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c 
left join itau.funcionarios as f
on f.cod_cargo_func = c.cod_cargo);

END
