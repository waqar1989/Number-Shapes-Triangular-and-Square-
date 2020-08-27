package com.example.numbershapes;

public class SquareOrTriangular {

    int number;

   public boolean isItTriangular()
   {

    int x=1;
    int triangularNumber=1;

               while(triangularNumber<number){

        x++;
        triangularNumber=triangularNumber+x;

               }

       if(number==triangularNumber){

           return true;

               }
       else{

           return false;
       }
   }


       public boolean isItSquare(){
        double sqaureNumber ;
        sqaureNumber = Math.sqrt(number);


           if(Math.floor(sqaureNumber) == sqaureNumber) {
               return true;
           } else {
               return false;
           }

       }
}
