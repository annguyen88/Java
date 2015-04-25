// Andrew Nguyen
// April 24, 2015


class FizzGame{
       public static void main(String [] args) {
                 for(int i = 1; i <= 100; i++) {
                 	if(i % 3 == 0 && i % 5 == 0){
                 		System.out.println("FizzBuzz"); //Check for Multiple of 3's and 5's
                 	}

                 	else if(i % 3 == 0){ 				//Check for Multiple of 3's
                 		System.out.println("Fizz");
                 	}
                 	else if(i % 5 == 0){				//Check for Multiple of 5's
                 		System.out.println("Buzz");
                 	}
                 	else								//defaults to numerical value
                 		System.out.println(i);			

                 }
     	}
 }