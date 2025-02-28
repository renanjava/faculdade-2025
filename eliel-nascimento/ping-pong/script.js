let xBolinha = 300
let yBolinha = 200
let diamBolinha = 20
let vxBolinha = 4
let vyBolinha = 6
let raio = diamBolinha / 2
let xRaquete = 10
let yRaquete = 150
let compRaquete = 10
let largRaquete = 100

function incluiPlacar() {
    fill(255);
    text(meusPontos, 278, 26);
    text(pontosDoOponente, 321, 26);
}

function setup() {
  createCanvas(600, 400)
}

function draw() {
  background(0)
  square(xBolinha,yBolinha,diamBolinha)
  xBolinha += vxBolinha
  yBolinha += vyBolinha
  if(xBolinha + raio > 600 || xBolinha - raio < 0) {
    vxBolinha *= -1
    fill(random(255),random(255),random(255),200)
  }
  if(yBolinha + raio > 400 || yBolinha - raio < 0) {
    vyBolinha *= -1
    fill(random(255),random(255),random(255),200)
  }

  rect(xRaquete, yRaquete, compRaquete, largRaquete)


  if(keyIsDown(UP_ARROW) === true){
    yRaquete -= 10
  }

  if(keyIsDown(DOWN_ARROW) === true){
    yRaquete += 10
  }

  incluiPlacar()
}
