let numeroInput = prompt("Digite um número inteiro:");
let numero = parseInt(numeroInput);
if (isNaN(numero)) {
    alert("Entrada inválida. Por favor, digite um número.");

} else {
    if (numero % 2 === 0) {
        document.writeln(`O número ${numero} é PAR.`);
    } else {
        document.writeln(`O número ${numero} é ÍMPAR.`);
    }
}