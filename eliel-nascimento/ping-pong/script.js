let xBolinha = 300, yBolinha = 200, diamBolinha = 20;
let vxBolinha = 4, vyBolinha = 6;
let raio = diamBolinha / 2;

let xRaquete = 10, yRaquete = 150;
let xRaqueteOponente = 580, yRaqueteOponente = 150;
let compRaquete = 10, largRaquete = 100;

let meusPontos = 0, pontosDoOponente = 0;

function setup() {
  createCanvas(600, 400);
}
function draw() {
  background(0);
  
  moverBolinha();
  verificarColisoesBorda();
  
  desenharRaquetes();
  moverRaqueteJogador();
  moverRaqueteOponente();
  
  verificarColisaoRaquete(xRaquete, yRaquete);
  verificarColisaoRaquete(xRaqueteOponente, yRaqueteOponente);
  
  verificarPontuacao();
  incluirPlacar();
}
function moverBolinha() {
  circle(xBolinha, yBolinha, diamBolinha);
  xBolinha += vxBolinha;
  yBolinha += vyBolinha;
}
function verificarColisoesBorda() {
  if (yBolinha + raio > height || yBolinha - raio < 0) {
    vyBolinha *= -1;
  }
}
function desenharRaquetes() {
  rect(xRaquete, yRaquete, compRaquete, largRaquete);
  rect(xRaqueteOponente, yRaqueteOponente, compRaquete, largRaquete);
}
function moverRaqueteJogador() {
  if (keyIsDown(UP_ARROW)) yRaquete -= 10;
  if (keyIsDown(DOWN_ARROW)) yRaquete += 10;
}
function moverRaqueteOponente() {
  yRaqueteOponente = yBolinha - largRaquete / 2;
}
function verificarColisaoRaquete(x, y) {
  if (
    xBolinha - raio < x + compRaquete &&
    xBolinha + raio > x &&
    yBolinha > y &&
    yBolinha < y + largRaquete
  ) {
    vxBolinha *= -1;
  }
}
function verificarPontuacao() {
  if (xBolinha - raio < 0) {
    pontosDoOponente++;
    resetBolinha();
  }
  if (xBolinha + raio > width) {
    meusPontos++;
    resetBolinha();
  }
}

function incluirPlacar() {
  fill(255);
  textSize(20);
  textAlign(CENTER);
  text(meusPontos, width / 2 - 30, 30);
  text(pontosDoOponente, width / 2 + 30, 30);
}
function resetBolinha() {
  xBolinha = width / 2;
  yBolinha = height / 2;
  vxBolinha = 4 * (random() > 0.5 ? 1 : -1);
  vyBolinha = random(-6, 6);
}
