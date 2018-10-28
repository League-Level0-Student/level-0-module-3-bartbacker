void setup(){
  
  size(1000,1000);
}
  void draw(){
    
  for(int i = 8; i > 0; i--){
        ellipse(500,500,i*50,i*50);
    if(i%2==0){
      fill(250,0,0);
    }
    else{
      fill(255,255,255);
    }
         
       
  }
 
  
  
  
}
