# productionlinemanagement

﻿Descrição do Problema - Linha de Produção

Precisamos ajustar as linhas de produção com base nas restrições abaixo.
São muitas possibilidades, você deverá escrever um programa para organizar essa produção.

Restrições:
- Não utilizar utilitários ou frameworks externos para calcular ou manipular as datas (ex: Joda-Time)
- Você deverá usar o arquivo entrada.txt para entrada de dados no seu sistema.
- A produção possui múltiplas linhas de montagem as quais possuem os períodos: manhã, intervalo para almoço e tarde.
- Cada período, exceto o de almoço, possui várias etapas do processo produtivo.
- O período da manhã inicia às 9:00 e deverá terminar às 12:00 para o intervalo de almoço.
- O período da tarde inicia às 13:00 e deverá terminar a tempo para a ginástica laboral.
- A ginástica laboral não poderá iniciar antes das 16:00 nem depois das 17:00, após a ginástica laboral os funcionários são dispensados e a linha de produção é parada.
- O nome das etapas do processo produtivo não possui números nele.
- Os números no nome das etapas serão sempre referentes ao tempo de execução da etapa em minutos ou a palavra manutenção, que representa uma pausa técnica de 5 minutos.
- Não haverá intervalos entre as etapas do processo.

Dependendo da abordagem escolhida para solucionar esse problema a saída poderá conter diferentes combinações de etapas dentro das linhas de montagem e isso é completamente aceitável, não existe ordem obrigatória para as etapas e elas podem ser distribuídas em qualquer linha de montagem. Você não precisa produzir uma saída exatamente igual ao exemplo, precisa apenas cumprir as restrições. 

Diferentes entradas de dados serão testadas, além do exemplo abaixo e poderão possui N linhas de montagens.




Entrada de dados de teste (entrada.txt)
------------------------------------------------------------

Recorte das chapas de aço 60min
Austêmpera 30min
Têmpera sub-zero 45min
Montagem de sensores de segurança 60min
Lavagem das peças 45min
Calibação dos eixos 30min
Montagem dos rolamentos 45min
Esfriamento da linha - manutenção
Nitretação 45min
Montagem do sub-sistema de injeção 60min
Averição de conformidade 30min
Montagem do sub-sistema de navegação 60min
Calibação do sub-sistema de conversão de torque 60min
Alinhamento da barra estabilizadora esquerda 30min
Configuração dos dispositivos de bloqueio e controle 45min
Alinhamento da barra estabilizadora direita 30min
Instalação das vedações 45min
Aplicação dos decalques 30min
Montagem do sub-sistema de monitoramento 30min



Exemplo de saída
------------------------------------------------------------

Linha de montagem 1:
09:00 Recorte das chapas de aço 60min
10:00 Montagem do sub-sistema de injeção 60min
11:00 Montagem do sub-sistema de navegação 60min
12:00 Almoço
13:00 Calibação do sub-sistema de conversão de torque 60min
14:00 Montagem dos rolamentos 45min
14:45 Nitretação 45min
15:30 Configuração dos dispositivos de bloqueio e controle 45min
16:15 Averição de conformidade 30min
16:45 Esfriamento da linha manutenção
16:50 Ginástica laboral

Linha de montagem 2:
09:00 Montagem de sensores de segurança 60min
10:00 Têmpera sub-zero 45min
10:45 Lavagem das peças 45min
11:30 Alinhamento da barra estabilizadora direita 30min
12:00 Almoço
13:00 Instalação das vedações 45min
13:45 Alinhamento da barra estabilizadora esquerda 30min
14:15 Montagem do sub-sistema de monitoramento 30min
14:45 Aplicação dos decalques 30min
15:15 Calibação dos eixos 30min
15:45 Austêmpera 30min
16:15 Ginástica laboral
