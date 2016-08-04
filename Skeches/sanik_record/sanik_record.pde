import ddf.minim.*;Minim minim;        //as a member variable
  AudioPlayer song;  
PImage pictureOfRecord;        //as member variable
void setup(){
  pictureOfRecord= loadImage("record.jpg");   //in setup method
   size(pictureOfRecord.width, pictureOfRecord.height);
   minim = new Minim(this);
   song = minim.loadFile("l.mp3", 512);//in the setup method

}
int record= 90;
void draw(){
 //image(pictureOfRecord, 0, 0);//in draw method 
 
rotateImage(pictureOfRecord, record);

image(pictureOfRecord, 0, 0);
if (mousePressed){
song.play();

record++;

}
}



void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}

