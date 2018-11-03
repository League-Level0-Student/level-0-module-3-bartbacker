int x1 = 300;
int x2 =900;
int y=300;

void setup(){
  
  size(1200,1000);
}
  void draw(){
   background(255,255,255); 
   for(int i = 8; i > 0; i--){   
        ellipse(x1,y,i*50,i*50);
        ellipse(x2,y,i*50,i*50);
  }
  x1+=2;
  x2-=2;
  if(x1>1200) x1=200;
  if(x2<0)    x2=1000;
  }