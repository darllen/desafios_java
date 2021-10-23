var meuElemento = document.getElementsByTagName('h1');

console.log("Este é meu elemento: ",meuElemento[0].innerHTML);

meuElemento[0].innerHTML = "Olá Start LATAM";

console.warn("O valor do meu elemento agora é: ",meuElemento[0].innerHTML);

setTimeout(() => {console.log("Boa noite!")}, 2000);
setTimeout(() => {console.log("Tudo bem com vocês?")}, 4000);
setTimeout(() => {console.log("Vamos estudar JS?")}, 6000);
setTimeout(() => {console.log("É facinho, eles disseram")}, 8000);
