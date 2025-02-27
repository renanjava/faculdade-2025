let xQuadrado = 300
let yQuadrado = 200
let diamQuadrado = 20
let vxQuadrado = 4
let vyQuadrado = 6
let raio = diamQuadrado / 2
let xRaquete = 10
let yRaquete = 150
let compRaquete = 10
let largRaquete = 100

function setup() {
  createCanvas(600, 400)
}

function draw() {
  background(0)
  square(xQuadrado,yQuadrado,diamQuadrado)
  xQuadrado += vxQuadrado
  yQuadrado += vyQuadrado
  if(xQuadrado + raio > 600 || xQuadrado - raio < 0) {
    vxQuadrado *= -1
    fill(random(255),random(255),random(255),200)
  }
  if(yQuadrado + raio > 400 || yQuadrado - raio < 0) {
    vyQuadrado *= -1
    fill(random(255),random(255),random(255),200)
  }

    rect(xRaquete, yRaquete, compRaquete, largRaquete)


  if(keyIsDown(UP_ARROW) === true){
    yRaquete -= 10
  }
    

  if(keyIsDown(DOWN_ARROW) === true){
    yRaquete += 10
  }
    
}
