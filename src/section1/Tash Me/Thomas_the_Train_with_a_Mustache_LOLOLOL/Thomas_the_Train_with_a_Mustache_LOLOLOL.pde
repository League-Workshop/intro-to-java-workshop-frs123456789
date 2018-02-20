PImage mustache;
   PImage Train;
   
void setup(){
Train = loadImage("Train.png");
   size(800,600);
   Train.resize(width, height);
mustache = loadImage("stache.png");
   mustache.resize(200,50);
}




void draw() {

background(Train);

image(mustache, mouseX, mouseY);


}