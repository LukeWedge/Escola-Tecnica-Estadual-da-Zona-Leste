const anoAtual = new Date().getFullYear();
let anoNascimentoInput = prompt("Em que ano você nasceu?");
let anoNascimento = parseInt(anoNascimentoInput);
if (isNaN(anoNascimento) || anoNascimento > anoAtual || anoNascimento < 1900) {
    alert("Por favor, insira um ano de nascimento válido (um número entre 1900 e " + anoAtual + ").");

} else {
    let idade = anoAtual - anoNascimento;
    document.writeln(`Você tem ${idade} anos.`);
}