Atualmente os gastos mensais de uma empresa são detalhados em planilhas eletrônicas. Assim, para fechar o balanço do
primeiro trimestre, é necessário somar o gasto total destas planilhas. Sabendo que, em janeiro, foram gastos R$ 30.000,00 reais, em fevereiro, R$ 33.030,77 reais e em março, R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, seguindo os seguintes passos:

a) Crie uma classe chamada BalancoTrimestral com o método main;
b) No método principal, declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro;
c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;
d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;
e) Exiba a variável gastosTrimestre.

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


System.out.println("O total gasto foi de: "+ gastosTrimestre);
