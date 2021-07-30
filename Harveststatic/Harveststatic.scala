
  object Harvest_Problem {
  def main(args: Array[String]): Unit = {
    val harvest_table= Array.ofDim[ Float](5, 8)
    var max : Float=0
    var min : Float=0
    var range : Float=0
    var average : Float=0
    var medium : Float=0
    var total : Float=0
    val day_per_week=7
    val week_per_month=4
    
    //get user inputs for the harvest in the month
    for( x <-1 to week_per_month ; y <- 1 to day_per_week){
            
            print("Enter Haravest amount in "+ " week"+ x +" day "  + y + ":  " )
            var a=scala.io.StdIn.readInt() 
           
            harvest_table(x)(y)=a;
            total=total+a
           }
    

    max=harvest_table(1)(1)
    min=harvest_table(1)(1)
    
    //print amount tabel
    println("____________________________________________________________________________________________\n\n")
      for(x<-1 to week_per_month){
        print("week " + x + " amount-->"+"\t")
      
        for(y<- 1 to day_per_week){
          print(harvest_table(x)(y)+"\t")
            
        }
        println("")
    }

  println(" ")
println( "Total amount is:" + total )
    
//for calculate maximum
var a=0;
var b=0;
    println(" ")
    for(x<-1 to week_per_month ; y<- 1 to day_per_week){
           
            if(max< harvest_table(x)(y)){
            max=harvest_table(x)(y) 
            a=x
            b=y}
 }
   
   println( "maximum amount is:"+ max +" in " + a + " week " + b +" day" )
   
   
  
    
  //for calculate minimum
  println(" ")
    for(x<-1 to week_per_month ; y<- 1 to day_per_week){
        
            if(min> harvest_table(x)(y)){
            min=harvest_table(x)(y)
            a=x
            b=y
            }
     }
    
    println("minumum amount is:"+ min +" in " + a + " week " + b +" day")

    
    //for finding the range
      println(" ")
    range=max-min
    println("range is :"+range)
    
   
    
    //for calculate the average
      println("  ")
    average=total/28
    println("average is :"+ average)
   
   
    
    //sorting data for finding the medium
      println("  ")
    var sort_table= new Array[ Float](29)
    
    var i=1
    for(x<-1 to week_per_month ; y<- 1 to day_per_week){
      
          sort_table(i)=harvest_table(x)(y)
          i=i+1
    }
    
    var temp : Float=0
    for(a<- 1 to 28 ; b<- (1+a) to 28){
            
            if(sort_table(a)>sort_table(b)){
            temp=sort_table(b)
            sort_table(b)=sort_table(a)
            sort_table(a)=temp
          }
      
    }
    
  //calculate medium
    
    medium=(sort_table(14)+sort_table(15))/2
    
    println("medium is :"+medium)
  
    
    
  }}
