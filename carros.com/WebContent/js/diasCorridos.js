// Calcula a diferenca entre duas datas
function diasDecorridos(dt1, dt2) {
    // variáveis auxiliares
    var minuto = 60000;
    var dia = minuto * 60 * 24;
    var horarioVerao = 0;

    // ajusta o horario de cada objeto Date
    dt1.setHours(0);
    dt1.setMinutes(0);
    dt1.setSeconds(0);
    dt2.setHours(0);
    dt2.setMinutes(0);
    dt2.setSeconds(0);

    // determina o fuso horário de cada objeto Date
    var fh1 = dt1.getTimezoneOffset();
    var fh2 = dt2.getTimezoneOffset();

    // retira a diferença do horário de verão
    if (dt2 > dt1) {
        horarioVerao = (fh2 - fh1) * minuto;
    }
    else {
        horarioVerao = (fh1 - fh2) * minuto;
    }

    var dif = Math.abs(dt2.getTime() - dt1.getTime()) - horarioVerao;
    return Math.ceil(dif / dia);
}