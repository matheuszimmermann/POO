Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

Atv05
1 - Declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro, declare também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;

2 - Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis.

double GastosJaneiro = 30.00000;//variaveis dos gastos do mes de janeiro
double GastosFevereiro = 33.03077;//variaveis dos gastos do mes de fevereiro
double GastosMarco = 23.89901;//variaveis dos gastos do mes de marco

//soma dos gastos dos meses e guardando resultado na variavel gasto
double gastosTrimestre = GastosJaneiro + GastosFevereiro + GastosMarco;


Exiba a variável gastosTrimestre

double GastosJaneiro = 30.00000;//variaveis dos gastos do mes de janeiro
double GastosFevereiro = 33.03077;//variaveis dos gastos do mes de fevereiro
double GastosMarco = 23.89901;//variaveis dos gastos do mes de marco

//soma dos gastos dos meses e guardando resultado na variavel gasto
double gastosTrimestre = GastosJaneiro + GastosFevereiro + GastosMarco;


System.out.println("O total gasto foi de: "+ gastosTrimestre); //exibindo a variavel gastosTrimestre



Declare a variável mediaMensal e faça o cálculo para a média mensal de gastos

double GastosJaneiro = 30.00000;//variaveis dos gastos do mes de janeiro
double GastosFevereiro = 33.03077;//variaveis dos gastos do mes de fevereiro
double GastosMarco = 23.89901;//variaveis dos gastos do mes de marco

//media dos gastos mensais
double mediaMensal = (GastosJaneiro + GastosFevereiro + GastosMarco) /3;



Exiba a mensagem "Valor da média mensal = " juntamente com o valor da média mensal

double GastosJaneiro = 30.00000;//variaveis dos gastos do mes de janeiro
double GastosFevereiro = 33.03077;//variaveis dos gastos do mes de fevereiro
double GastosMarco = 23.89901;//variaveis dos gastos do mes de marco

//media dos gastos mensais
double mediaMensal = (GastosJaneiro + GastosFevereiro + GastosMarco) /3;


System.out.println("Valor da media mensal = "+ mediaMensal);
