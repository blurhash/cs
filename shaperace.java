float xAxisRect = 20;
float xAxisCircle = 20;
float xAxisSquare = 20;
PFont f;
float r1 = random(10);
float r2 = random(10);
float r3 = random(10);
void setup() {
size(1200, 800);
f = createFont("Arial",16,true);
}

void draw() {
  background(#52b2bf);
  line(1100, 0, 1100, 800);
rect(xAxisRect, 30, 50, 50);
xAxisRect = xAxisRect + r1;
circle(xAxisCircle, 300, 50);
xAxisCircle = xAxisCircle + r2;
square(xAxisSquare, 600, 50);
xAxisSquare = xAxisSquare + r3;
textFont(f,36);
fill(255);
if (1100 < xAxisRect) { text("Rect wins!",500,700);
noLoop();
}
if (1100 < xAxisCircle) {text("Circle wins!",500,700);
noLoop();
};
if (1100 < xAxisSquare) {text("Square wins!",500,700);
noLoop();
}
}
