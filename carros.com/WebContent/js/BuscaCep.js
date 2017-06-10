/*
 * Busca de CEP através do site dos Correios (jQuery)
 */
function CEP(cep, callback, callbackErro) {
    $.get('http://www.correios.com.br/encomendas/malote/endereco.cfm',
          {'tipo': 'origem', 'cep': cep},
          function (data) {
              var data = $('#cep').append(data).find('input').map(function () {
                  return this.value;
              }).get();
              callback(data[1] == '' ? false : {
                  '#logradouro': data[0],
                  '#bairro': data[1],
                  '#cidade': data[2].split('/')[0].trim(),
                  '#uf': data[2].split('/')[1]
              });
    }).fail(function (xhr, textStatus, errorMsg) {
        callbackErro(errorMsg);
    });
}
 
// Exemplo de uso
buscaCEP('70150900', function (dados) {
    alert(JSON.stringify(dados));
});